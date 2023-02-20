package com.designpatterns.singleresponsabilityprinciple.result;

import com.designpatterns.singleresponsabilityprinciple.common.SearchSuggestion;
import com.designpatterns.singleresponsabilityprinciple.common.SearchWidget;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GoogleResultPage {

    private SearchWidget searchWidget;
    private SearchSuggestion searchSuggestion;
    private NavigationBar navigationBar;
    private ResultStat resultStat;

    public GoogleResultPage(final WebDriver driver) {
        this.searchWidget = PageFactory.initElements(driver, SearchWidget.class);
        this.searchSuggestion = PageFactory.initElements(driver, SearchSuggestion.class);
        this.navigationBar = PageFactory.initElements(driver, NavigationBar.class);
        this.resultStat = PageFactory.initElements(driver, ResultStat.class);

    }

    public NavigationBar getNavigationBar() {
        return this.navigationBar;
    }

    public SearchSuggestion getSearchSuggestion() {
        return this.searchSuggestion;
    }

    public SearchWidget getSearchWidget() {
        return this.searchWidget;
    }

    public ResultStat getResultStat() {
        return this.resultStat;
    }
}
