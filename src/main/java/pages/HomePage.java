package pages;

import locators.HomePageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;
    HomePageLocators locators;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        locators = new HomePageLocators();
        PageFactory.initElements(driver, locators);
    }

    public boolean isBrowseByCategoryVisible() {
        return locators.browseByCategoryLink.isDisplayed();
    }

    public boolean isPartsLookupVisible() {
        return locators.partsLookupLink.isDisplayed();
    }

    public boolean isContactVisible() {
        return locators.contactLink.isDisplayed();
    }

    public void clickBrowseByCategory() {
        locators.browseByCategoryLink.click();
    }
}