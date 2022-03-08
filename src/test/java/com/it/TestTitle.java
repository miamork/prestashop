package com.it;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import static org.junit.jupiter.api.Assertions.assertEquals;


/*class testElements {
    @BeforeAll

    public static void setUp() {
        ChromeDriver driver = new ChromeDriver();
        FirefoxDriver driver2 = new FirefoxDriver();
        driver.get("http://104.209.254.152/");
        driver2.get("http://104.209.254.152/");
        driver.manage().window().maximize();
        driver2.manage().window().maximize();
        Actions actions = new Actions(driver);
        Actions actions1 = new Actions(driver2);
        }
    } */



public class TestTitle {

    @Test()
    public void testWebSite() {
        System.setProperty("webriver.chrome.driver" , "c:\\WebDriver\\bin\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        //WebDriver driver = new FirefoxDriver();

        driver.navigate().to("http://104.209.254.152/");

        assertEquals("PrestaShop", driver.getTitle(), "Check av titel misslyckades");

        driver.quit();
    }
}

/*public class LogIn {
}*/
