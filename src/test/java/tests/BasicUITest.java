package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrowseByCategoryPage;
import pages.HomePage;
import pages.ProductPage;

public class BasicUITest extends BaseTest {

    @Test(priority = 1)
    public void verifyHomePageElements() {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isBrowseByCategoryVisible(), "Browse By Category link not visible.");
        Assert.assertTrue(homePage.isPartsLookupVisible(), "Parts Look Up link not visible.");
        Assert.assertTrue(homePage.isContactVisible(), "Contact link not visible.");
    }

    @Test(priority = 2)
    public void verifyBrowseByCategory(){
        HomePage homePage = new HomePage(driver);
        homePage.clickBrowseByCategory();
        BrowseByCategoryPage categoryPage = new BrowseByCategoryPage(driver);

        Assert.assertTrue(categoryPage.isOilLubricantsVisible(), "Oil & Lubricants category not visible.");
    }

    @Test(priority = 3)
    public void verifyProductDetails() {
        driver.get("https://www.shophighlinewarren.com/c/oil-bar-chain"); // Replace with actual product URL
        ProductPage productPage = new ProductPage(driver);
        Assert.assertTrue(productPage.isProductTitleVisible(), "Product title not visible.");

        // Get the product name and store it in a variable
        String productName = productPage.getProductTitle();
        System.out.println("Product Name: " + productName);

        // Navigate back to the homepage
        driver.get("https://www.shophighlinewarren.com/");

        // Enter the product name into the search bar and press enter
        driver.findElement(By.xpath("(//input[@placeholder='Search'])[1]")).sendKeys(productName + Keys.ENTER);

        // Verify that the product page is displayed again
        Assert.assertTrue(productPage.isProductPageProductTitleVisible(), "Product title not visible after search.");
    }
}
