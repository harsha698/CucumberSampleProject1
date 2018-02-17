package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\Public\\CucumberPractice1\\src\\main\\java\\features\\TestFeature4.feature",
		glue= {"stepDefinitions"}
		
		)

public class TestRunner2 {

}
