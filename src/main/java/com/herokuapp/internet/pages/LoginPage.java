package com.herokuapp.internet.pages;


import com.herokuapp.internet.utility.Utility;
import org.openqa.selenium.By;


public class LoginPage extends Utility {
    By emailIdField =By.xpath("//input[@id='username']"); //"tomsmith");
    By passwordField = By.xpath("//input[@id='password']");
    By loginButton = By.xpath("//i[normalize-space()='Login']");

    public void enterEmailIdField (String email){sendTextToElement(emailIdField , email);}
    public void enterPasswordField(String password){sendTextToElement(passwordField,password);}
    public void clickOnLoginButton(){clickOnElement(loginButton);}
}

