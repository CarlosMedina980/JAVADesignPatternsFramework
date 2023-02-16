package com.designpatterns.singleresponsabilityprinciple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchWidget extends AbstractComponent {

    @FindBy(name = "q")
    private WebElement searchBox;

    private WebDriverWait wait;

    public SearchWidget(WebDriver driver) {
        super(driver);
    }

    public void enter(String text) {
        this.searchBox.clear();
        this.searchBox.sendKeys(text);
    }

    @Override
    public boolean isDisplayed() {
        this.wait.until((d) -> this.searchBox.isDisplayed());
        return this.searchBox.isDisplayed();
    }
}
