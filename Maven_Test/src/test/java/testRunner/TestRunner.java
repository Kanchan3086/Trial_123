package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
				features="C:\\Users\\Kanchan\\eclipse-workspace\\Maven_Test\\src\\test\\java\\features_Folder\\compareTitle.feature",
				glue="stepdefinition_Package",
				dryRun=false,
				monochrome=true
				
			)

public class TestRunner {

}
