package tests;

import models.Product;
import models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddItemToCartTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        User user = new User("kalughina1234@bk.ru", "Password@123");
        app.getUserHelper().login(user);
        Assert.assertTrue(app.getUserHelper().isUserLoggedIn(), "❌ Логин не выполнен!");
    }

    @Test
    public void addItemToCartTest() {
        Product secondProduct = new Product(2);
        app.getCartHelper().addProductToCart(secondProduct);
        Assert.assertTrue(app.getCartHelper().isProductAdded(), "❌ Товар не добавлен в корзину!");
    }
}