package com.demo.cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
@Author Puja Kumari
@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", glue = "com.Multi", plugin = { "html:target/cucumber-html-report",
		"json:target/cucumber.json", "pretty:target/cucumber-pretty.txt", "usage:target/cucumber-usage.json",
		"junit:target/cucumber-results.xml" }, dryRun = false, strict = true, monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests {

}
