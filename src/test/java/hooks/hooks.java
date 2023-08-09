package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;

import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import utilities.ConfigReader;
import utilities.LoggerLoad;

public class hooks {
	public static WebDriver driver;
	public static DriverFactory driverfactory;
	
@BeforeAll
public static void before() throws Throwable {
	
	//get browser type from config file
	LoggerLoad.info("Loading config file");
	ConfigReader.loadConfig();
	String browser=ConfigReader.getBrowserType();
	
	//Initialize driver from driver factory
	driverfactory= new DriverFactory();
	driver= driverfactory.initializeDrivers(browser);
			LoggerLoad.info("Initializing driver for"+browser);
	
}


@AfterStep 

public void afterstep(Scenario scenario) {
	if (scenario.isFailed()) {
		LoggerLoad.error("Steps Failed, Taking Screenshot");
		final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot,"image/png","My screenshot");
	}
}
}
/*@AfterAll

public static void after() {
	LoggerLoad.info("Closing Driver");
	driverfactory.closeallDriver();
}
}*/
