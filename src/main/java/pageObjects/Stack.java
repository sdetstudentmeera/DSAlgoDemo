package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import factory.DriverFactory;
import utilities.ConfigReader;
import utilities.LoggerLoad;

public class Stack {
	public static WebDriver driver = DriverFactory.getdriver();
	String homeUrl = ConfigReader.getHomePage();
	Array arrayPage = new Array();
	@FindBy(xpath = "//a[@href='stack']")
	WebElement stack_getStarted;
	@FindBy(xpath = "//a[@href='operations-in-stack']")
	WebElement operationsInStack;
	@FindBy(xpath = "//a[@href='implementation']")
	WebElement implementation;
	@FindBy(xpath = "//a[@href='stack-applications']")
	WebElement Applications;
	@FindBy(xpath = "//a[@href='/stack']")
	WebElement dropdown_stack;
	

	public Stack() {
		PageFactory.initElements(driver, this);
	}

	// to click get started in Stasck panel
	public void clickStackGetStarted() {
		stack_getStarted.click();
	}

	// navigate to operations In Stack
	public void operationsInStack() {
		operationsInStack.click();
	}

	// navigate to the Implementation
	public void navigateToImplementation() {

		implementation.click();
	}

	// navigate to Applications
	public void navigateToApplications() {
		Applications.click();
	}

	public void navigateToDropdownStack() {

		arrayPage.dropdown_dataStructs.click();
		LoggerLoad.info("Click " + arrayPage.dropdown_dataStructs.getText() + "on the dropdown");
		dropdown_stack.click();
		LoggerLoad.info("Click " + dropdown_stack.getText() + "from the Data Structures dropdown");
	}
	
}
