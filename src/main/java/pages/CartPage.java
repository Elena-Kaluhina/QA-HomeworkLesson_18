package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isProductInCart() {
        return driver.findElements(By.xpath("//p[contains(text(), 'The product has been added')]")).size() > 0;
    }
}