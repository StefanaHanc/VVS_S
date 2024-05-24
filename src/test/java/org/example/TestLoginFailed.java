package org.example;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.example.steps.serenity.MainSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("src/test/resources/features/search/LoginFailedData.csv")
public class TestLoginFailed {
    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public MainSteps mainSteps;

    String username;
    String password;


    @Test
    public void login() {
        mainSteps.loginFailed(username, password);
    }
}