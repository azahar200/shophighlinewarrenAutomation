package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void selectFirstProduct() {
        firstProductLink.click();
    }

    public boolean isSearchResultDisplayed() {
        // Add logic to verify search results
        return true;
    }
}
