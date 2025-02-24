package manager;

import models.Product;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartHelper extends BaseHelper {

    public CartHelper(WebDriver driver) {
        super(driver);
    }

    public void addProductToCart(Product product) {
        // Ожидание кликабельности второй кнопки "Add to cart"
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        By addToCartButton = By.xpath("(//input[@value='Add to cart'])[2]");

        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton)).click();
    }

    public boolean isProductAdded() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // Ожидание до 5 секунд
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//p[contains(text(), 'The product has been added')]")
        )) != null;
    }
}
