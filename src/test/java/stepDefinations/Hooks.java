package stepDefinations;
import org.openqa.selenium.WebDriver;

import Cucumber.Automation.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;
public class Hooks extends Base{
	
	
	@Before("@MobileTest")
	public void beforeValidation() {
		System.out.println("Before Mobile Hook.....");	
	}
	@After("@MobileTest")
	public void afterExecution() {
		System.out.println("After Mobile Hook.....");
	}
	@Before("@WebTest")
	public void beforeWebValidation() {
		System.out.println("Before Web Hook.....");	
	}
	@After("@WebTest")
	public void afterWebExecution() {
		System.out.println("After Web Hook.....");
	}	
	
	@After("@SeleniumTest2")
	public void afterSeleniumTest() {
		driver.quit();
		
	}
	
	
	
	
}
