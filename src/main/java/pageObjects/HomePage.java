package pageObjects;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import factory.DriverFactory;
import utilities.ConfigReader;
import utilities.LoggerLoad;
public class HomePage {
	//public static WebDriver driver = new ChromeDriver();----->only using chromedriver
	
	public static WebDriver driver = DriverFactory.getdriver();
	String URL = ConfigReader.getApplicationUrl();
	String homeUrl = ConfigReader.getHomePage();
	ConfigReader config = new ConfigReader();// why do we need this line?



	// DSAlgo Portal
	@FindBy(xpath = "//a[@href='/home']")WebElement getStarted;

	// Home Page get started links
	@FindBy(xpath = "//a[@href='data-structures-introduction']")WebElement getstarted_dataStructs;
	@FindBy(xpath = "//a[@href='array']")WebElement getstarted_array;
	@FindBy(xpath = "//a[@href='linked-list']")WebElement getstarted_linkedList;
	@FindBy(xpath = "//a[@href='stack']")WebElement getstarted_stack;
	@FindBy(xpath = "//a[@href='queue']")WebElement getstarted_queue;
	@FindBy(xpath = "//a[@href='tree']")WebElement getstarted_tree;
	@FindBy(xpath = "//a[@href='graph']")WebElement getstarted_graph;

	// Dropdown selection
	@FindBy(xpath = "//a[@class='nav-link dropdown-toggle']")WebElement dropdown_dataStructs;
	@FindBy(xpath = "//a[@href='/array']")WebElement dropdown_array;
	@FindBy(xpath = "//a[@href='/linked-list']")WebElement dropdown_linkedList;
	@FindBy(xpath = "//a[@href='/stack']")WebElement dropdown_stack;
	@FindBy(xpath = "//a[@href='/queue']")WebElement dropdown_queue;
	@FindBy(xpath = "//a[@href='/tree']")WebElement dropdown_tree;
	@FindBy(xpath = "//a[@href='/graph']")WebElement dropdown_graph;

	// Alert Message
	@FindBy(xpath = "//div[@class='alert alert-primary']")WebElement ds_alertMsg;

	// Register
	@FindBy(xpath = "//a[@href='/register']")WebElement registerHmPg;

	// Signin
	@FindBy(xpath = "//a[@href='/login']")WebElement signInHmPg;

	// Initializing Page Factory
//Constructors are special methods in a class that are automatically called when an object of the class is created.
	public HomePage() {
		PageFactory.initElements(driver, this);
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		//driver.manage().window().maximize();
	}

	// Ds Algo Portal Page
	public void dsAlgoPortal() {
		driver.get(URL);
	}

	// Click the Get Started link in DS Algo Portal
	public void getStarted(String string) {
		getStarted.click();
	}

	// Verify the title of the page
	public String verifyPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;

	}

	// Redirected to the home page
	public void homePage() {
		driver.get(homeUrl);
	}

	// method to get the alert message
	public String alertMessage() {
		String alertMsg = ds_alertMsg.getText();
		return alertMsg;
	}

	// method to check the gherkin conditions in the home page get started link
	public void home_getStarted(String string) {
		switch (string) {
		case "Datastructures":
			LoggerLoad.info("Click " + getstarted_dataStructs.getText() + " link on Data Structures-Introduction");
			getstarted_dataStructs.click();
			break;
		case "Arrays":
			LoggerLoad.info("Click " + getstarted_array.getText() + " link on Array");
			getstarted_array.click();
			break;
		case "Linkedlist":
			LoggerLoad.info("Click " + getstarted_linkedList.getText() + " link on Linkedlist");
			getstarted_linkedList.click();
			break;
		case "Stack":
			LoggerLoad.info("Click " + getstarted_stack.getText() + " link on Stack");
			getstarted_stack.click();
			break;
		case "Queue":
			LoggerLoad.info("Click " + getstarted_queue.getText() + " link on Queue");
			getstarted_queue.click();
			break;
		case "Tree":
			LoggerLoad.info("Click " + getstarted_tree.getText() + " link on Tree");
			getstarted_tree.click();
			break;
		case "Graph":
			LoggerLoad.info("Click " + getstarted_graph.getText() + " link on Graph");
			getstarted_graph.click();
			break;

		}
	}

	// method to check the gherkin conditions in the home page dropdown selection
	public void home_dropdown(String string) {

		dropdown_dataStructs.click();
		LoggerLoad.info("Click " + dropdown_dataStructs.getText() + " link in the dropdown");
		switch (string) {
		case "Arrays":
			LoggerLoad.info("Click " + dropdown_array.getText() + " link in the dropdown");
			dropdown_array.click();
			break;
		case "Linkedlist":
			LoggerLoad.info("Click " + dropdown_linkedList.getText() + " link in the dropdown");
			dropdown_linkedList.click();
			break;
		case "Stack":
			LoggerLoad.info("Click " + dropdown_stack.getText() + " link in the dropdown");
			dropdown_stack.click();
			break;
		case "Queue":
			LoggerLoad.info("Click " + dropdown_queue.getText() + " link in the dropdown");
			dropdown_queue.click();
			break;
		case "Tree":
			LoggerLoad.info("Click " + dropdown_tree.getText() + " link in Tree");
			dropdown_tree.click();
			break;
		case "Graph":
			LoggerLoad.info("Click " + dropdown_graph.getText() + " link in Graph");
			dropdown_graph.click();
			break;

		}
	}
	public void registerHomePage() {
		registerHmPg.click();
	}
    public void signInHomePage() {	
		signInHmPg.click();
	}
}
