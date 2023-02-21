package com.cucumber.stepdefinitions.hooks;

import com.google.common.util.concurrent.Uninterruptibles;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void setupDriver() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();

    }

    @After
    public void tearDown() {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
        driver.quit();
    }
}
