package manager;

import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends BaseHelper {

    public UserHelper(WebDriver driver) {
        super(driver);
    }

    public void login(User user) {
        click(By.xpath("//a[@class='ico-login']"));
        type(By.id("Email"), user.getEmail());
        type(By.id("Password"), user.getPassword());
        click(By.xpath("//input[@value='Log in']"));
    }

    public boolean isUserLoggedIn() {
        return isElementPresent(By.xpath("//a[@class='ico-logout']"));
    }
}
