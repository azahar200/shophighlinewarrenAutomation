package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPageLocators {
    @FindBy(xpath = "(//span[@class='product-title'])[1]")
    public WebElement productTitle;

    @FindBy(xpath = "(//span[@itemprop='name'])[1]")
    public WebElement productPageProductTitle;

    @FindBy(xpath = "(//input[@placeholder='Search'])[1]")
    public WebElement searchBar;
}