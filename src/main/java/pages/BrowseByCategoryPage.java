package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrowseByCategoryPage {
    WebDriver driver;

    @FindBy(xpath = "//a[text()='Oil & Lubricants']")
    WebElement oilLubricantsCategory;

    public BrowseByCategoryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOilLubricantsCategory() {
        oilLubricantsCategory.click();
    }

    public boolean isOilLubricantsVisible() {
        return oilLubricantsCategory.isDisplayed();
    }
}
