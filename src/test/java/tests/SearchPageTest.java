package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchPage;
import pages.ProductDetailsPage;

public class SearchPageTest extends BaseTest {
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
    public void verifySearchResultsAndNavigationToProduct() {
        homePage.searchProduct("Laptop");

        // Verify search results are displayed
        Assert.assertTrue(searchPage.isSearchResultDisplayed(), "Search results are displayed");

        // Navigate to first product
        searchPage.selectFirstProduct();

        // Verify product details page is loaded
        Assert.assertNotNull(productDetailsPage.getProductTitle(), "Product title is displayed");
    }

    @AfterMethod
    public void tearDownTest() {
        tearDown();
    }
}
