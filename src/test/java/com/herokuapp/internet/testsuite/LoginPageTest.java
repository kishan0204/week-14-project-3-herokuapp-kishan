package com.herokuapp.internet.testsuite;

import com.herokuapp.internet.pages.LoginPage;
import com.herokuapp.internet.pages.UserNameErrorMessagePage;
import com.herokuapp.internet.testbase.BaseTest;

import org.testng.annotations.Test;


public class LoginPageTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    UserNameErrorMessagePage userNameErrorMessagePage = new UserNameErrorMessagePage();

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        loginPage.enterEmailIdField("tomsmith");
        loginPage.enterPasswordField("SuperSecretPassword!");
        loginPage.clickOnLoginButton();
    }
    @Test
    public void verifyTheUsernameErrorMessage() {
        loginPage.enterEmailIdField("tomsmith1");
        loginPage.enterPasswordField("SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        userNameErrorMessagePage.closeBrowser();
        //userNameErrorMessagePage.verifyTextMessage();
    }
    @Test
    public void verifyThePasswordErrorMessage(){
        loginPage.enterEmailIdField("tomsmith");
        loginPage.enterPasswordField("SuperSecretPassword");
        loginPage.clickOnLoginButton();

    }
}



