package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.example.pages.CartPage;
import org.example.pages.ProductPage;

import static org.junit.Assert.assertEquals;

public class CartSteps {
    private CartPage cartPage;

    public void purchase(String name, String card) {
        assertEquals(cartPage.getCart(), 1);
        cartPage.clickPlaceOrder();
        cartPage.enterName(name);
        cartPage.enterCard(card);
        cartPage.clickPurchase();
        assertEquals(cartPage.getMessage(), "Thank you for your purchase!");
        cartPage.clickOk();
    }
}
