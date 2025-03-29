package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    WebDriver driver;

    @FindBy(xpath = "(//span[@class='product-title'])[1]")
    WebElement productTitle;

    @FindBy (xpath = "(//span[@itemprop='name'])[1]")
    WebElement productPageProductTitle;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isProductTitleVisible() {
        return productTitle.isDisplayed();
    }
    public String getProductTitle() {
        return productTitle.getText();
    }
    public boolean isProductPageProductTitleVisible() {
        return productPageProductTitle.isDisplayed();
    }

}
