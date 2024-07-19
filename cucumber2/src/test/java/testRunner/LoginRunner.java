package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//import.cucumber.api.testng.AbstarctTestNGcucumberTests;

@CucumberOptions(
		features= {"src/test/java/features/login.feature"},
		//dryRun=!true,
		glue={"pages", "hooks", "steps"},
		snippets=SnippetType.CAMELCASE,
		monochrome= true,
		//plugin= {"pretty" , "html:reports"},
				plugin =  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		//tags= {"@reg"}

		)
public class LoginRunner extends AbstractTestNGCucumberTests {

}
