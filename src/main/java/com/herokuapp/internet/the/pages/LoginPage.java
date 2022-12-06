package com.herokuapp.internet.the.pages;
import com.herokuapp.internet.the.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By userNameField = By.id("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//i[@class='fa fa-2x fa-sign-in']");
    By textMessage = By.xpath("//h2[text()=' Secure Area']");

    By userNameErrorMessage = By.xpath("//div[@id='flash']");
    By passwordErrorMessage = By.xpath("//div[@id='flash']");

    public void enterUserName(String userName) {
        sendTextToElement(userNameField, userName);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getTextMessage() {
        return getTextFromElement(textMessage);
    }

    public String getUserNameErrorMessage() {
        return getTextFromElement(userNameErrorMessage);
    }

    public String getPasswordErrorMessage() {
        return getTextFromElement(passwordErrorMessage);
    }


}
