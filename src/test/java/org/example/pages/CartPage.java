package org.example.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.stream.Collectors;

@DefaultUrl("https://www.demoblaze.com/cart.html")
public class CartPage extends PageObject {
    @FindBy(id = "tbodyid")
    private WebElementFacade cartTableBody;

    @FindBy(xpath = "//*[@id=\"page-wrapper\"]/div/div[2]/button")
    private WebElementFacade placeOrderButton;

    @FindBy(xpath = "//*[@id=\"name\"]")
    private WebElementFacade nameField;

    @FindBy(id = "card")
    private WebElementFacade cardField;

    @FindBy(xpath = "//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")
    private WebElementFacade purchaseButton;

    @FindBy(xpath = "/html/body/div[10]/h2")
    private WebElementFacade successMessage;

    @FindBy(xpath = "/html/body/div[10]/div[7]/div/button")
    private WebElementFacade okButton;


    public int getCart() {
        System.out.println("before check");
        return new ArrayList<>(cartTableBody.findElements(By.tagName("tr"))).size();
        //return cartTableBody.findElement(By.tagName("tr")).findElement(By.tagName("td")).getText();
    }

    public void clickPlaceOrder() {
        System.out.println(placeOrderButton.isPresent());
        System.out.println(purchaseButton.isPresent());
        placeOrderButton.click();
    }

    public void enterName(String name) {
        nameField.type(name);
    }

    public void enterCard(String card) {
        cardField.type(card);
    }

    public void clickPurchase() {
        purchaseButton.click();
    }

    public void clickOk() {
        okButton.click();
    }

    public String getMessage() {
        if (successMessage.isPresent())
            return successMessage.getText();
        return null;
    }

    public String currentUrl() {
        return getDriver().getCurrentUrl();
    }

}
