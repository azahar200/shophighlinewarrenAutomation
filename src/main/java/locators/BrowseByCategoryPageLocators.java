package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrowseByCategoryPageLocators {
    @FindBy(xpath = "//a[text()='Oil & Lubricants']")
    public WebElement oilLubricantsCategory;
}