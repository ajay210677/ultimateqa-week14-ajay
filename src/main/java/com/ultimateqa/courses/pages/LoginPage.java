package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By welcomeText = By.xpath("//h1[contains(text(),'Welcome Back!')]");
    By emailField = By.id("user[email]");
    By passwordField = By.name("user[password]");
    By signInButton = By.xpath("//input[@value='Sign in']");
    By errorMessage = By.xpath("//li[contains(text(),'Invalid email or password.')]");

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnSignInButton() {
        clickOnElement(signInButton);
    }

    public String getErrorMessage() {
        return getTextFromElement(errorMessage);
    }
}
