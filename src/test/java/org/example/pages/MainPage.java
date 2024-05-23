package org.example.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.WebElementFacade;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.NoAlertPresentException;

@DefaultUrl("https:www.demoblaze.com/index.html")
public class MainPage extends PageObject {

    //@FindBy(id="login2")
    @FindBy(xpath="//*[@id=\"login2\"]")
    private WebElementFacade tryLoginButton;

    @FindBy(id="loginusername")
    private WebElementFacade usernameField;

    @FindBy(id="loginpassword")
    private WebElementFacade passwordField;

    @FindBy(xpath = "//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
    private WebElementFacade loginButton;

    @FindBy(id = "nameofuser")
    private WebElementFacade userName;

    @FindBy(id = "logout2")
    private WebElementFacade logoutButton;

    @FindBy(xpath = "//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")
    private WebElementFacade productEty;

    public void tryLogin() {
        tryLoginButton.click();
    }

    public void enterUsername(String username) {
        usernameField.type(username);
    }

    public void enterPassword(String password) {
        passwordField.type(password);
    }

    public void login() {
        loginButton.click();
    }

    public String username() {
        if (userName.isPresent())
            return userName.getText();
        return null;
    }

    public boolean alert() {
        try {
            userName.isDisplayed();
            return false;
        } catch (Exception e) {
            return true;
        }
    }

    public void logout() {
        logoutButton.click();
    }

    public void viewProduct() {
        productEty.click();
    }
    public String currentUrl() {
        return getDriver().getCurrentUrl();
    }
}