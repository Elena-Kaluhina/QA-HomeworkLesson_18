package models;

import org.openqa.selenium.By;

public class Product {
    private By locator;

    public Product(int index) {

        this.locator = By.xpath("(//div[@class='item-box'])[" + index + "]");
    }

    public By getLocator() {
        return locator;
    }
}