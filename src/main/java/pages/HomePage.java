package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openLoginPage() {
        driver.get("https://demowebshop.tricentis.com/");
    }

    public void goToLoginPage() {
        driver.findElement(By.xpath("//a[@class='ico-login']")).click();
    }
}