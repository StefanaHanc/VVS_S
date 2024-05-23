package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.example.pages.MainPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.*;

public class MainSteps {
    MainPage mainPage;

    @Step
    public void login(String username, String password) {
        mainPage.open();
        mainPage.tryLogin();
        mainPage.enterUsername(username);
        mainPage.enterPassword(password);
        mainPage.login();
        assertTrue(mainPage.username().contains(username));
    }

    @Step
    public void loginFailed(String username, String password) {
        mainPage.open();
        mainPage.tryLogin();
        mainPage.enterUsername(username);
        mainPage.enterPassword(password);
        mainPage.login();
        assertTrue(mainPage.alert());
    }
    @Step
    public void logout() {
        assertEquals(mainPage.currentUrl(), "https://www.demoblaze.com/index.html");
        mainPage.logout();
    }

    @Step
    public void viewProduct() {
        mainPage.viewProduct();
    }

    public void openPage() {
        mainPage.open();
    }

    @Step
    public String name() {
        return mainPage.username();
    }
}