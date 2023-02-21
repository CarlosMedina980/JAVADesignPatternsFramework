package com.cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", features = {"src/test/resources/features/"}, glue = {"com.cucumber"},
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"})


public class CucumberTestRunner extends AbstractTestNGCucumberTests {

}


