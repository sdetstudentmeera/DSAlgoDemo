package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import factory.DriverFactory;
import utilities.ConfigReader;
import utilities.LoggerLoad;
public class Queue {
	public static WebDriver driver = DriverFactory.getdriver();
	String homeUrl = ConfigReader.getHomePage();
	Array arrayPage = new Array();

	@FindBy(xpath = "//a[@href='queue']")
	WebElement queue_getStarted;
	@FindBy(xpath = "//a[@href='implementation-lists']")
	WebElement impleofQueueinPython;
	@FindBy(xpath = "//a[@href='/queue']")
	WebElement dropdown_queue;
	@FindBy(xpath = "//a[@href='implementation-collections']")
	WebElement impleUsingCollects;
	@FindBy(xpath = "//a[@href='Implementation-array']")
	WebElement impleUsingArray;
	@FindBy(xpath = "//a[@href='QueueOp']")
	WebElement queueOperations;

	public Queue() {
		PageFactory.initElements(driver, this);
	}

	// to click get started in Queue panel
	public void clickQueueGetStarted() {
		queue_getStarted.click();
	}

	// navigate to Implementation of Queue in Python
	public void navigateToImpleQueueinPython() {
		impleofQueueinPython.click();
	}

	// navigate to the dropdown queue
	public void navigateToDropdownQueue() {

		arrayPage.dropdown_dataStructs.click();
		LoggerLoad.info("Click " + arrayPage.dropdown_dataStructs.getText() + "on the dropdown");
		dropdown_queue.click();
		LoggerLoad.info("Click " + dropdown_queue.getText() + "from the Data Structures dropdown");
	}

	// navigate to Implementation using collections.deque
	public void navigateToImpleUsingCollections() {
		impleUsingCollects.click();
	}

	// navigate to Implementation using array
	public void navigateToImpleUsingArray() {
		impleUsingArray.click();
	}

	// navigate to Queue Operations
	public void navigateToQueueOperations() {
		queueOperations.click();
	}
}
