package pageObjects;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import factory.DriverFactory;
import utilities.ConfigReader;
import utilities.LoggerLoad;

public class SigninPage {
	
	public static WebDriver driver = DriverFactory.getdriver();
	String homeUrl = ConfigReader.getHomePage();
	String loginUrl = ConfigReader.getLoginPage();
	Boolean isRequired;
	
	@FindBy(xpath="//a[@href='/login']")WebElement signinLink;
	@FindBy(xpath="//a[@href='/register']")WebElement registerLink;
	@FindBy (xpath="//*[@value='Login']")WebElement loginButton;
	@FindBy (xpath="//*[@id='id_username']")static WebElement userName;
	@FindBy (xpath="//*[@id='id_password']")static WebElement pwd;
	@FindBy (xpath="//div[@class='alert alert-primary']")WebElement alertMsg;
	@FindBy (xpath="//a[@href='/logout']")WebElement signout;


	
	
	
	public SigninPage() {
		PageFactory.initElements(driver, this);

	}
	
	public void getLoginPage() {
		driver.get(loginUrl);

	}
	
	//method to open Signin Page
	public void navigateToSignInLink() {
		signinLink.click();
	}
	
	//to navigate to register page
	public void navigateToRegisterPage()
	{
		registerLink.click();
	}

	// Verify the title of the page
		public String verifyPageTitle() {
			String pageTitle = driver.getTitle();
			return pageTitle;

		}
		
		public void loginButton() {
			loginButton.click();
		}
		
		//click login button
		public String clickLoginButton() {
			loginButton.click();
			String msg = alertMsg.getText();
			return msg;
		}
		
//		//method to get the message
//		public String getMsg() {
//			String msg = null;
//			try {
//				
//			} catch (NoSuchElementException e) {
//				e.printStackTrace();
//				LoggerLoad.info("No Such Element Found");
//
//			}
//			
//		}
		
		//validate the username and password for empty fields
		public Boolean doLogin(String username, String password) {

			userName.clear();
			userName.sendKeys(username);
			pwd.clear();
			pwd.sendKeys(password);

			
			// To check empty fields , we need to check "required" field is on an attribute
			if (username.isBlank()) {
				JavascriptExecutor js_user = (JavascriptExecutor) driver;
				isRequired = (Boolean) js_user.executeScript("return arguments[0].required;", userName);
				return isRequired;
			} else if (password.isBlank()) {
				JavascriptExecutor js_password = (JavascriptExecutor) driver;
				isRequired = (Boolean) js_password.executeScript("return arguments[0].required;", pwd);
				return isRequired;

			}
			return isRequired;
		}
		
		public void signout() {
			signout.click();
		}			
}
