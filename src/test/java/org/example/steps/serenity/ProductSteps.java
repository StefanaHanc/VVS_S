package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.example.pages.ProductPage;

import static org.junit.Assert.*;

public class ProductSteps {
    private ProductPage productPage;

    @Step
    public void addToCart() {
        assertEquals(productPage.currentUrl(), "https://www.demoblaze.com/prod.html?idp_=1");
        productPage.clickAddButton();
        productPage.clickCart();
    }
}
