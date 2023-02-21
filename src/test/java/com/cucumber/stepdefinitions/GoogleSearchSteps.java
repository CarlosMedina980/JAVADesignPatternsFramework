package com.cucumber.stepdefinitions;

import com.designpatterns.singleresponsabilityprinciple.main.GoogleMainPage;
import com.designpatterns.singleresponsabilityprinciple.result.GoogleResultPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.cucumber.stepdefinitions.hooks.Hooks.driver;

public class GoogleSearchSteps {

    private GoogleMainPage googleMainPage;
    private GoogleResultPage googleResultPage;


    public GoogleSearchSteps() {
        this.googleMainPage = new GoogleMainPage(driver);
        this.googleResultPage = new GoogleResultPage(driver);
    }

    @Given("the user navigates to google home page")
    public void theUserNavigatesToGoogleHomePage() {
        googleMainPage.goTo();
        Assert.assertTrue(googleMainPage.getSearchWidget().isDisplayed());
    }

    @And("the user enters {string}")
    public void theUserEntersSearchKeyword(String keyword) {
        googleMainPage.getSearchWidget().enter(keyword);
        Assert.assertTrue(googleMainPage.getSearchSuggestion().isDisplayed());
    }

    @And("user selects the {int} among suggestions")
    public void userSelectsTheSuggestionIndexAmongSuggestions(int index) {
        googleResultPage.getSearchSuggestion().clickSuggestionByIndex(index);
    }

    @When("the user goes to news on navigation bar")
    public void theUserGoesToNewsOnNavigationBar() {
        googleResultPage.getNavigationBar().goToNews();
    }

    @Then("the user prints the quantity of results found")
    public void theUserPrintsTheQuantityOfResultsFound() {
        System.out.println(googleResultPage.getResultStat().getStat());
    }
}
