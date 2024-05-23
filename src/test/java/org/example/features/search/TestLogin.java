package org.example.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import org.example.steps.serenity.MainSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class TestLogin {


    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public MainSteps endUserSteps;

    @Test
    public void searching_by_keyword_apple_should_display_the_corresponding_article() {
        endUserSteps.login("whiteblack", "vvss");
    }
}