package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {
    @FindBy(xpath = "//a[text()='Browse By Category']")
    public WebElement browseByCategoryLink;

    @FindBy(xpath = "//a[text()='Parts Look Up']")
    public WebElement partsLookupLink;

    @FindBy(xpath = "//a[text()='Contact']")
    public WebElement contactLink;
}