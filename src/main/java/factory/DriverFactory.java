package factory;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.LoggerLoad;


public class DriverFactory {
	
	public static WebDriver driver;
	//WebDriverManager.chromedriver().driverVersion("114.0.5735.90").setup();
	//WebDriverManager.chromedriver().driverVersion("114.0.5735.90").setup();
	
	
	//WebDriver: This is an interface provided by Selenium that 
	//represents a web browser's window. It provides various methods to interact with and control the browser
	
	//Static-->This keyword indicates that the variable is a class-level variable, shared among all instances of the class. 
	//It means that there will be only one copy of the driver variable shared by all objects of the ConfigReader class, 
	//and it can be accessed directly using the class name (ConfigReader.driver) without needing to create an instance of the class.
	
	public  WebDriver initializeDrivers (String browser) {
		if(browser.equalsIgnoreCase("firefox")) {
			LoggerLoad.info("Testing on firefox");
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			
		}else if(browser.equalsIgnoreCase("chrome")) {
			LoggerLoad.info("Testing on firefox");
			WebDriverManager.chromedriver().driverVersion("114.0.5735.90").setup();
			driver= new ChromeDriver();
			
		}else if(browser.equalsIgnoreCase("edge")) {
			LoggerLoad.info("Testing on edge");
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
	}
	   
	
//set page load timeout
	
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	//Setting a page load timeout is crucial in automation testing to avoid getting stuck on pages that take too long to load. 
	//By setting this timeout, if a page takes longer than the specified duration to load, 
	//Selenium will throw a TimeoutException, allowing the automation script to handle the situation accordingly 
	//(e.g., logging the error, taking a specific action, etc.).
	driver.manage().window().maximize();
	//By maximizing the browser window, you ensure that the web page being tested will be displayed at its largest possible size, 
	//which can be beneficial for testing responsive web designs and
	//ensuring that elements are displayed correctly across different screen resolutions and devices.
	return driver;
	}
	//The returned driver can then be used in other parts of the automation framework to perform actions and
	//interact with the web application being tested. For example, you might use it in test scripts to 
	//navigate to specific URLs,interact with elements, and perform various actions during the test execution.

	public static WebDriver getdriver() {
		return driver;
		//The method returns the WebDriver instance that was previously set or initialized in the factory class.
	}
	public void closeallDriver() {
		driver.close();
		//The line driver.close(); is a Selenium WebDriver command used to close the current browser window or 
		//tab that the WebDriver instance is controlling. This action effectively closes the active browser window or tab, 
		//but it does not terminate the WebDriver instance or the browser process entirely.
	}
}


