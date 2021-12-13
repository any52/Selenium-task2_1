package ru.stqa.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstClass {
    private WebDriver driver;

    @BeforeEach
    public void start(){
        driver = new ChromeDriver();
    }

    @Test
    public void myfirstTest()  {
        driver.get("http://www.google.com/");
    }

    @AfterEach
    public void stopt(){
        driver.quit();
        driver = null;
    }
}
