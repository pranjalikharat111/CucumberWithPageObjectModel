package com.cas.runner.Cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue={"com/cas/glue/StepDefination"},monochrome=true, 
plugin= {"pretty","html:target/report.html"}
		)

public class TestRunClass {
}
