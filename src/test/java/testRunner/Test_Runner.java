package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="Feature/multipleData.feature",glue="stepDefinitionMultipleData")
public class Test_Runner extends AbstractTestNGCucumberTests {

}
