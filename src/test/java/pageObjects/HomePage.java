package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Cucumber.Automation.Base;
public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	By search=By.xpath("//input[@type='search']");
	public WebElement getSearch()
	{
		return driver.findElement(search);
	}
	By increment=By.cssSelector("a.increment");
	public WebElement getIncrement()
	{
		return driver.findElement(increment);
	}
	By add2Cart=By.xpath("//button[contains(text(),'ADD TO CART')]");
	public WebElement addToCart()
	{
		return driver.findElement(add2Cart);
	}
	By productName=By.cssSelector("h4.product-name");
	public WebElement verifyProductName() {
		return driver.findElement(productName);
	}
	By cartIcon=By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]");	
	public WebElement clickCartIcon() {
		return driver.findElement(cartIcon);
	}
	By proceedToCheckout=By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	public WebElement clickproceedToCheckout() {
		return driver.findElement(proceedToCheckout);
	}
	By productInCart=By.cssSelector("p.product-name");
	public WebElement verifyProductInCart() {
		return driver.findElement(productInCart);
	}
}
