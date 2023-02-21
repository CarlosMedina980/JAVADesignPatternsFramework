package com.designpatterns.factory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleFrenchPage extends GooglePage{

    @FindBy(css="div#SIvCob a")
    private WebElement french;

    @Override
    public void launchSite() {

    }

    @Override
    public void search(String keyword) {

    }

    @Override
    public int getResultsCount() {
        return 0;
    }
}
