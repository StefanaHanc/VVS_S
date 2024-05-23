package org.example;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.example.steps.serenity.CartSteps;
import org.example.steps.serenity.MainSteps;
import org.example.steps.serenity.ProductSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class TestPlaceOrder {
    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public MainSteps mainSteps;
    @Steps
    public ProductSteps productSteps;
    @Steps
    public CartSteps cartSteps;

    @Test
    public void placeOrder() {
        mainSteps.login("whiteblack", "vvss");
        mainSteps.viewProduct();
        productSteps.addToCart();
        cartSteps.purchase("whiteblack", "1234-5678-0000-9999");
        mainSteps.openPage();
        mainSteps.logout();
        //System.out.println(mainSteps.name());
    }

    @Test
    public void login() {
        mainSteps.login("whiteblack", "vvss");
    }

    @Test
    public void failedLogin() {
        mainSteps.loginFailed("whiteblack", "vvsss");

    }
}
