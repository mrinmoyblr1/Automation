package stepDefinations;
import java.util.List;
import org.openqa.selenium.WebDriver;
import Cucumber.Automation.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObjects.HomePage;
public class stepDefinations extends Base{
	HomePage h;	
	@Given("^User is on NetBanking Landing Page$")
	public void user_is_on_netbanking_landing_page() throws Throwable {
		System.out.println("User is on NetBanking Landing Page");
	}
	@Then("^Home Page is populated$")
	public void home_page_is_populated() throws Throwable {
		System.out.println("Home Page is populated");
	}
	
	
	@When("^User login into Application with UserName \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void user_login_into_application_with_username_something_and_password_something(String strArg1,
			String strArg2) throws Throwable {
		String UserName = strArg1;
		String Password = strArg2;
		System.out.println("The User Name is: " + UserName + " and the Password is: " + Password);
	}
	
	
	@And("^Cards displayed are \"([^\"]*)\"$")
	public void cards_displayed_are_something(String strArg1) throws Throwable {
		System.out.println("Card Display Status: " + strArg1);
	}
	
	
	@When("^User Sign Up with following details$")
	public void user_sign_up_with_following_details(DataTable data) throws Throwable {
		List<List<String>> obj = data.raw();
		System.out.println("The UserName is: " + obj.get(0).get(0));
		System.out.println("The Password is: " + obj.get(0).get(1));
	}
	
	
	@When("^User login with UserName (.+) and Password (.+)$")
	public void user_login_with_username_and_password(String username, String password) throws Throwable {
		System.out.println("The UserName is: " + username + " The Password is: " + password);
	}
	@Given("^validate the Browser$")
    public void validate_the_browser() throws Throwable {
		System.out.println("Validate the Browser");
    }
    @When("^the Browser is triggered$")
    public void the_browser_is_triggered() throws Throwable {
    	System.out.println("The Browser is triggered");
    }
    @Then("^Check if the Browser is displayed$")
    public void check_if_the_browser_is_displayed() throws Throwable {
    	System.out.println("Check if the Browser is displayed=================");
    }
    
    
    
        
    
    @SuppressWarnings("deprecation")
	@Then("^verify selected (.+) items are displayed in Checkout page$")
    public void verify_selected_items_are_displayed_in_checkout_page(String Vegitable) throws Throwable {
    	h=new HomePage(driver);
    	Assert.assertTrue(h.verifyProductInCart().getText().contains(Vegitable));
    }
    
    
    
    
    
    
}
