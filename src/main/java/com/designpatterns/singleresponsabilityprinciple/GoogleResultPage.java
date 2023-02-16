package com.designpatterns.singleresponsabilityprinciple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GoogleResultPage {

    private SearchWidget searchWidget;
    private SearchSuggestion searchSuggestion;
    private NavigationBar navigationBar;
    private ResultStat resultStat;

    public GoogleResultPage(final WebDriver driver) {
        this.searchWidget = PageFactory.initElements(driver, searchWidget.getClass());
        this.searchSuggestion = PageFactory.initElements(driver, searchSuggestion.getClass());
        this.navigationBar = PageFactory.initElements(driver, navigationBar.getClass());
        this.resultStat = PageFactory.initElements(driver, resultStat.getClass());

    }
}
