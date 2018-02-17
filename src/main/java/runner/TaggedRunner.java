package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Public\\CucumberPractice1\\src\\main\\java\\features\\TaggedFeature.feature",
		glue= {"stepDefinitions"},
		//tags= {"@FunctionalTests"}
		//tags= {"@SmokeTesting"}
		//tags= {"@RegressionTesting"}
		//tags= {"@E2ETesting"}
		//tags= {"@FunctionalTests", "~@SmokeTesting", "~@RegressionTesting", "~@E2ETesting"} //this will include all functional tests but not smoke, regression, e2e
		//tags= {"@SmokeTesting", "@RegressionTesting"} //smoke AND regression
		tags= {"@SmokeTesting, @RegressionTesting"} //smoke OR regression
		
		)

public class TaggedRunner {

}
