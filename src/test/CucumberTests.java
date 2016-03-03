package test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(format= { "pretty", "html:target/cucumber-html-report",
        "json:target/cucumber- report.json" }, features="src/test/",  glue = {"bdd.gherkin"})
public class CucumberTests extends AbstractTestNGCucumberTests {


}