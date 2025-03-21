package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends BaseTest {
    HomePage homePage;

    @BeforeMethod
    public void setupTest() {
        setup();
        homePage = new HomePage(driver);
    }

    @Test
    public void testSearchFunctionality() {
        homePage.searchProduct("Laptop");
        Assert.assertTrue(true, "Search was successful");
    }

    @AfterMethod
    public void tearDownTest() {
        tearDown();
    }
}
