package Cucumber.Automation;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Base {
	public static WebDriver driver;
	public static WebDriver getDriver() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Mrinmoy\\eclipse-workspace\\Automation\\src\\main\\java\\Cucumber\\Automation\\global.properties");
		prop.load(fis);	
    	System.setProperty("webdriver.chrome.driver", "D:\\Study\\Driver Apps\\chromedriver.exe");
       	driver=new ChromeDriver();
       	driver.manage().window().maximize();
       	driver.get(prop.getProperty("url")); 
       	return driver;
	}
}
