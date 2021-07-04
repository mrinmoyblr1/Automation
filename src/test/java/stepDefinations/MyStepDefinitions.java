package stepDefinations;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import junit.framework.Assert;
import pageObjects.HomePage;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Cucumber.Automation.Base;
@RunWith(Cucumber.class)
public class MyStepDefinitions {
	WebDriver driver;
	HomePage h;
    @Given("^User is on Greencart Landing page$")
    public void user_is_on_greencart_landing_page() throws Throwable {
  	driver=Base.getDriver();
    }
    @SuppressWarnings("deprecation")
	@When("^User searched for (.+) vegitable$")
    public void user_searched_for_vegitable(String vegitable) throws Throwable {
    	h=new HomePage(driver);
    	h.getSearch().sendKeys(vegitable);    	
    	Thread.sleep(3000);    	
    	Assert.assertTrue(h.verifyProductName().getText().contains(vegitable));
    }
    @Then("^\"([^\"]*)\" results are displayed$")
    public void something_results_are_displayed(String strArg1) throws Throwable {
    	driver.quit();
    }
    @And("^Added items to cart$")
    public void added_items_to_cart() throws Throwable {
    	h.getIncrement().click();
    	h.addToCart().click();	
    }  
    @And("^User proceeded to Checkout page for purchase$")
    public void user_proceeded_to_checkout_page_for_purchase() throws Throwable {
    	h.clickCartIcon().click();
    	h.clickproceedToCheckout().click();
    }
}