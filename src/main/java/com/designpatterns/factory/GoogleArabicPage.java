package com.designpatterns.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleArabicPage extends GoogleEnglishPage {

    @FindBy(css = "div#SIvCob a")
    private WebElement language;

    @FindBy(css = "span.hOoLGe")
    private WebElement keyboardBtn;

    @FindBy(id = "kbd")
    private WebElement keyboard;

    public GoogleArabicPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void launchSite() {
        this.driver.get("https://www.google.sa");
        this.language.click();
    }

    @Override
    public void search(String keyword) {
        this.wait.until((d) -> this.keyboardBtn.isDisplayed());
        this.keyboardBtn.click();
        this.wait.until((d) -> this.keyboard.isDisplayed());
        super.search(keyword);
    }
}
