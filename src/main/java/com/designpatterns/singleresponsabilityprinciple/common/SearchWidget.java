package com.designpatterns.singleresponsabilityprinciple.common;

import com.designpatterns.singleresponsabilityprinciple.common.AbstractComponent;
import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class SearchWidget extends AbstractComponent {

    @FindBy(name = "q")
    private WebElement searchBox;


    public SearchWidget(WebDriver driver) {
        super(driver);
    }

    public void enter(String text) {
        this.searchBox.clear();
        for (char ch : text.toCharArray()) {
            Uninterruptibles.sleepUninterruptibly(Duration.ofMillis(20));
            this.searchBox.sendKeys(ch + "");
        }

    }

    @Override
    public boolean isDisplayed() {
        this.wait.until((d) -> this.searchBox.isDisplayed());
        return this.searchBox.isDisplayed();
    }
}
