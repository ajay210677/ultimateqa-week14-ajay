package com.ultimateqa.courses.testbase;

import com.ultimateqa.courses.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {

    String browser = "chrome";
    @BeforeMethod
    public  void setup(){
        selectBrowser(browser);
    }
    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }
}
