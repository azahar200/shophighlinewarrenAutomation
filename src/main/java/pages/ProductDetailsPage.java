package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage {
    WebDriver driver;

    @FindBy(id = "productTitle")
    WebElement productTitle;

    @FindBy(id = "productPrice")
    WebElement productPrice;

    @FindBy(id = "addToCartButton")
    WebElement addToCartButton;

    @FindBy(id = "cartSuccessMessage")
    WebElement cartSuccessMessage;

    public ProductDetailsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getProductTitle() {
        return productTitle.getText();
    }

    public String getProductPrice() {
        return productPrice.getText();
    }

    public void addToCart() {
        addToCartButton.click();
    }

    public boolean isAddedToCart() {
        return cartSuccessMessage.isDisplayed();
    }
}
