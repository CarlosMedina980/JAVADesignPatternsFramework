package com.designpatterns.singleresponsabilityprinciple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationBar extends AbstractComponent {

    @FindBy(id = "hdtb")
    private WebElement bar;

    @FindBy(linkText = "Images")
    private WebElement imagesLink;

    @FindBy(linkText = "News")
    private WebElement newsLink;

    public NavigationBar(WebDriver driver) {
        super(driver);
    }

    public void goToImages() {
        this.imagesLink.click();
    }

    public void goToNews() {
        this.newsLink.click();
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until((d) -> this.bar.isDisplayed());
    }
}
