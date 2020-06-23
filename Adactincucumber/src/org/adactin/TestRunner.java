 package org.adactin;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\org\\adactin\\Testcases.feature",glue="org.adactin",strict=true,monochrome=true,tags= {"@cancel"})

public class TestRunner {
	
	

}
