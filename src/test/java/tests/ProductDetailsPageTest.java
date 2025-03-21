package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductDetailsPage;
import pages.SearchPage;

public class ProductDetailsPageTest extends BaseTest {
    HomePage homePage;
    SearchPage searchPage;
    ProductDetailsPage productDetailsPage;

    @BeforeMethod
    public void setupTest() {
        setup();
        homePage = new HomePage(driver);
        searchPage = new SearchPage(driver);
        productDetailsPage = new ProductDetailsPage(driver);
    }

    @Test
    public void verifyProductDetailsAndAddToCart() {
        homePage.searchProduct("Laptop");

        // Assuming first search result navigates to product page
        // Implement searchPage.selectFirstProduct() if needed
        // searchPage.selectFirstProduct();

        String title = productDetailsPage.getProductTitle();
        String price = productDetailsPage.getProductPrice();

        Assert.assertNotNull(title, "Product title is displayed");
        Assert.assertNotNull(price, "Product price is displayed");

        productDetailsPage.addToCart();
        Assert.assertTrue(productDetailsPage.isAddedToCart(), "Product successfully added to cart");
    }

    @AfterMethod
    public void tearDownTest() {
        tearDown();
    }
}
