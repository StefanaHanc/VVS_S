package org.example.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.demoblaze.com/prod.html?idp_=1")
public class ProductPage extends PageObject {
    @FindBy(xpath = "//*[@id=\"tbodyid\"]/div[2]/div/a")
    private WebElementFacade addToCartButton;

    @FindBy(id = "cartur")
    private WebElementFacade goToCart;

    public String currentUrl() {
        return getDriver().getCurrentUrl();
    }

    public void clickAddButton() {
        addToCartButton.click();
    }

    public void clickCart() {
        goToCart.click();
    }
}
