package com.herokuapp.internet.the.testsuite;

import com.herokuapp.internet.the.pages.LoginPage;
import com.herokuapp.internet.the.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginPageTest extends BaseTest {

    LoginPage loginPage = new LoginPage();


    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        loginPage.enterUserName("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        String expectedMessage = "Secure Area";
        Assert.assertEquals(loginPage.getTextMessage(), expectedMessage, "No Secure Area text found");
    }

    @Test
    public void verifyTheUsernameErrorMessage() {
        loginPage.enterUserName("tomsmith1");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        String expectedMessage = "Your username is invalid!\n" + "×";
        Assert.assertEquals(loginPage.getUserNameErrorMessage(), expectedMessage, "Your username is invalid!");
    }

    @Test
    public void verifyThePasswordErrorMessage() {
        loginPage.enterUserName("tomsmith");
        loginPage.enterPassword("SuperSecretPassword");
        loginPage.clickOnLoginButton();
        String expectedMessage = "Your password is invalid!\n" + "×";
        Assert.assertEquals(loginPage.getPasswordErrorMessage(), expectedMessage, "Your password is invalid!");
    }
}
