package com.designpatterns.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleFrenchPage extends GoogleEnglishPage {

    @FindBy(css = "div#SIvCob a")
    private WebElement language;

    public GoogleFrenchPage(WebDriver driver) {
        super(driver);
    }


    @Override
    public void launchSite() {
        this.driver.get("https://www.google.fr");
        this.language.click();
    }
}
