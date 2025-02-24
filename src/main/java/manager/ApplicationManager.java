package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class ApplicationManager {
    private WebDriver driver;
    private UserHelper userHelper;
    private CartHelper cartHelper;

    public void init() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window(); //.maximize();
        driver.get("https://demowebshop.tricentis.com/");

        userHelper = new UserHelper(driver);
        cartHelper = new CartHelper(driver);
    }

    public void stop() {
        if (driver != null) {
            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

    public UserHelper getUserHelper() {
        return userHelper;
    }

    public CartHelper getCartHelper() {
        return cartHelper;
    }
}