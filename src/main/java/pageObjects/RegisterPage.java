package pageObjects;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import utilities.LoggerLoad;




public class RegisterPage {
	public static WebDriver driver = DriverFactory.getdriver();

	@FindBy(xpath = "//a[@href='/register']")
	WebElement registerLink;
	@FindBy(xpath = "//*[@value='Register']")
	WebElement registerButton;
	@FindBy(xpath = "//*[@id='id_username']")
	WebElement username;
	@FindBy(xpath = "//*[@id='id_password1']")
	WebElement password;
	@FindBy(xpath = "//*[@id='id_password2']")
	WebElement pwdConfirm;
	@FindBy(xpath = "//*[@class='alert alert-primary']")
	WebElement alertMsg;
	@FindBy(xpath="//a[@href='/logout']")WebElement signout;

	//a[normalize-space()='Numpy@sdet117_14']
	
	public RegisterPage() {
		PageFactory.initElements(driver, this);

	}

	// method to select register link in home page
	public void navigateToRegisterLink() {
		registerLink.click();
	}

	// method to click register button
	public void clickRegisterButton() {
		registerButton.click();
	}

	// Method to check whether username is empty
	public Boolean getEmptyRequiredUserField() {
		boolean isRequired = false;
		LoggerLoad.info("Checking whether username is empty field");
		if (username.getText().isBlank()) {
			LoggerLoad.info("Username is found to be empty so getting the required field value");
			JavascriptExecutor js_user = (JavascriptExecutor) driver;
			isRequired = (Boolean) js_user.executeScript("return arguments[0].required", username);
		}
		return isRequired;

	}

	// Method to check whether password is empty
	public Boolean getEmptyRequiredPwdField() {
		boolean isRequired = false;
		LoggerLoad.info("Checking whether Password is empty field");
		if (password.getText().isBlank()) {
			LoggerLoad.info("Password is found to be empty so getting the required field value");
			JavascriptExecutor js_pwd = (JavascriptExecutor) driver;
			isRequired = (Boolean) js_pwd.executeScript("return arguments[0].required;", password);
		}
		return isRequired;

	}

	// Method to check whether Password Confirmations is em
	public Boolean getEmptyRequiredPwdConfirmField() {
		boolean isRequired = false;
		LoggerLoad.info("Checking whether username is empty field");
		if (pwdConfirm.getText().isBlank()) {
			LoggerLoad.info("Password Confirmation is found to be empty so getting the required field value");
			JavascriptExecutor js_pwdConfirm = (JavascriptExecutor) driver;
			isRequired = (Boolean) js_pwdConfirm.executeScript("return arguments[0].required;", pwdConfirm);
		}
		return isRequired;

	}

	// method to get the validation message that pops up when the username textbox
	// is
	// empty or required
	public String getEmptyFieldErrormsgUser() {
		return username.getAttribute("validationMessage");
	}

	// method to get the validation message that pops up when the password textbox
	// is
	// empty or required
	public String getEmptyFieldErrormsgPwd() {
		return password.getAttribute("validationMessage");
	}

	// method to get the validation message that pops up when the password
	// confirmation textbox is
	// empty or required
	public String getEmptyFieldErrormsgPwdConfirm() {
		return pwdConfirm.getAttribute("validationMessage");
	}

	// method to enter the username value
	public void enterValidUsername(DataTable dataTable) {
		List<Map<String, String>> userDetail = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> form : userDetail) {
			String user = form.get("username");
			LoggerLoad.info("The User enters the username as : " + user);
			username.sendKeys(user);
		}

	}
	
	

	// method to enter the password value
	public void enterValidPassword(DataTable datatable) {
		List<Map<String, String>> pwdDetail = datatable.asMaps(String.class, String.class);
		for (Map<String, String> form : pwdDetail) {
			String pwd = form.get("password");
			LoggerLoad.info("The User enters the password as : " + pwd);
			password.sendKeys(pwd);
		}
	}

	// method to enter password confirmation value
	public void enterValidPwdConfirm(DataTable datatable) {
		List<Map<String, String>> pwdConfirmDetail = datatable.asMaps(String.class, String.class);
		for (Map<String, String> form : pwdConfirmDetail) {
			String passwordConfirm = form.get("password confirmation");
			LoggerLoad.info("The User enters the password confirmation as : " + passwordConfirm);
			pwdConfirm.sendKeys(passwordConfirm);
		}
	}

	public String getErrorMsg() {
		String error = null;
		try {
			error = alertMsg.getText();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			LoggerLoad.info("No Such Element Found");

		}
		return error;

	}

	// Verify the title of the page
	public String verifyPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;

	}
	
	//method to get the message
	public String getMsg() {
		String msg = null;
		try {
			msg = alertMsg.getText();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			LoggerLoad.info("No Such Element Found");

		}
		return msg;

	}
	//method to click signout link
	public void clickSignOutLink() {		
		signout.click();
		
	}
}
