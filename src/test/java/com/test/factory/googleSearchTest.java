package com.test.factory;

import com.designpatterns.factory.GoogleFactory;
import com.designpatterns.factory.GooglePage;
import com.test.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class googleSearchTest extends BaseTest {

    private GooglePage googlePage;

    @Test(dataProvider = "getData")
    public void searchTest(String language, String keyword) {
        this.googlePage = GoogleFactory.get(language, this.driver);
        this.googlePage.launchSite();
        this.googlePage.search(keyword);
        int resultCount = this.googlePage.getResultsCount();
        System.out.println("Result Count : " + resultCount);
    }

    @DataProvider
    public Object[][] getData() {
        return new Object[][]{
                {"ENG", "Selenium"},
                {"FR", "Design Patterns"},
                {"SA", "Docker"},
        };
    }
}
