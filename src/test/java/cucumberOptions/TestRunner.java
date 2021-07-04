package cucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="classpath:features/Search.feature",tags="@SeleniumTest2,@SeleniumTest1",
		glue="stepDefinations", 
				//tags="@PortalTest",
				//monochrome=true,
				//dryRun=true,		
				// dryRun=true--> will check if all the scenarios are having step Definitions
				// monochrome=true --> will make the console output in pretty format
				// strict=true --> this will make sure to to check all the steps is passed then only 
				//result will be passed. If any steps is skipped the the test will be failed.
				plugin= {"pretty","html:target/cucumber","json:target/cucumber.json","junit:target/cukes.xml"
		}
		)

public class TestRunner {
	

}
