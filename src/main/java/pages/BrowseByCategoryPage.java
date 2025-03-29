package pages;

import locators.BrowseByCategoryPageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BrowseByCategoryPage {
    WebDriver driver;
    BrowseByCategoryPageLocators locators;

    public BrowseByCategoryPage(WebDriver driver) {
        this.driver = driver;
        locators = new BrowseByCategoryPageLocators();
        PageFactory.initElements(driver, locators);
    }

    public void clickOilLubricantsCategory() {
        locators.oilLubricantsCategory.click();
    }

    public boolean isOilLubricantsVisible() {
        return locators.oilLubricantsCategory.isDisplayed();
    }
}