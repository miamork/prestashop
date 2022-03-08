package com.it;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


class testElements {
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
    }

/*public class LogIn {
}*/
