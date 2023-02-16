package com.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", features = {"src/test/resources/features/LoginPage.feature"}, glue = {"com.stepDefinitions"},
        plugin = {})
public class CucumberTestRunner extends AbstractTestNGCucumberTests {

}
