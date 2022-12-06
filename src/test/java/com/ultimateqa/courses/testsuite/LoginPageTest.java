package com.ultimateqa.courses.testsuite;


import com.ultimateqa.courses.pages.HomePage;
import com.ultimateqa.courses.pages.LoginPage;
import com.ultimateqa.courses.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {


        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();

        public LoginPageTest() {
        }

        @Test
        public void userShouldNavigateToLoginPageSuccessfully() {
            this.homePage.clickOnSignInLink();
            Assert.assertEquals(this.loginPage.getWelcomeText(), "Welcome Back!", "Welcome Text not found/ Not navigated to SignIn Page");
        }

        @Test
        public void verifyTheErrorMessage() {
            this.homePage.clickOnSignInLink();
            this.loginPage.enterEmail("test123@");
            this.loginPage.enterPassword("test123");
            this.loginPage.clickOnSignInButton();
            Assert.assertEquals(this.loginPage.getErrorMessage(), "Invalid email or password.", "Error message not found");
        }





    }
