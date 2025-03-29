package tests;

import base.BaseTest;
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
    }
}
