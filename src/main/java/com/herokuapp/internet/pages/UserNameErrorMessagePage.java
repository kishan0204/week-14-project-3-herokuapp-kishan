package com.herokuapp.internet.pages;

import com.herokuapp.internet.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class UserNameErrorMessagePage extends Utility {

    By closeBrowser = By.xpath("//a[@class='close']");
   // By textMessage = By.xpath("//div[@id='flash']");

    public void clickOnCloseBrowser(){clickOnElement(closeBrowser);}
   // public void verifyTextMessage(){verifyTextFromElements(textMessage,"Your username is invalid!\n" +
          //  "×");}




}
