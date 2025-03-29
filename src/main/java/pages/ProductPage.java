package pages;

import locators.ProductPageLocators;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    WebDriver driver;
    ProductPageLocators locators;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        locators = new ProductPageLocators();
        PageFactory.initElements(driver, locators);
    }

    public boolean isProductTitleVisible() {
        return locators.productTitle.isDisplayed();
    }

    public String getProductTitle() {
        return locators.productTitle.getText();
    }

    public boolean isProductPageProductTitleVisible() {
        return locators.productPageProductTitle.isDisplayed();
    }

    public void searchProduct(String productName) {
        locators.searchBar.sendKeys(productName + Keys.ENTER);
    }
}