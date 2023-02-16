package com.designpatterns.singleresponsabilityprinciple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GoogleMainPage {

    private WebDriver driver;
    private SearchWidget searchWidget;
    private SearchSuggestion searchSuggestion;

    public GoogleMainPage(WebDriver driver) {
        this.driver = driver;
        this.searchWidget = PageFactory.initElements(driver, searchWidget.getClass());
        this.searchSuggestion = PageFactory.initElements(driver, searchSuggestion.getClass());
    }

    public void goTo() {
        this.driver.get("https://google.com");
    }

    public SearchWidget getSearchWidget() {
        return searchWidget;
    }

    public SearchSuggestion getSearchSuggestion() {
        return searchSuggestion;
    }
}
