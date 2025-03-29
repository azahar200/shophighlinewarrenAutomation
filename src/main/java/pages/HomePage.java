package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    @FindBy(xpath = "//a[text()='Browse By Category']")
    WebElement browseByCategoryLink;

    @FindBy(xpath = "//a[text()='Parts Look Up']")
    WebElement partsLookupLink;

    @FindBy(xpath = "//a[text()='Contact']")
    WebElement contactLink;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isBrowseByCategoryVisible() {
        return browseByCategoryLink.isDisplayed();
    }

    public boolean isPartsLookupVisible() {
        return partsLookupLink.isDisplayed();
    }

    public boolean isContactVisible() {
        return contactLink.isDisplayed();
    }

    public void clickBrowseByCategory() {
        browseByCategoryLink.click();
    }
}
