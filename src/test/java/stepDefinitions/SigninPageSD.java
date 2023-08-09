package stepDefinitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SigninPage;
//import pageObjects.SignInPage;
import utilities.ConfigReader;
import utilities.ExcelReader;
import utilities.LoggerLoad;

public class SigninPageSD {
	
	SigninPage signin = new SigninPage();
	String excelfilepath = ConfigReader.getExcelFilePath();
	static String username;
	static String password;
	static String expectedMsg;
	Boolean isRequired;
	
	//@TC_Signin_01
	@Given("The user opens Signin page")
	public void the_user_opens_signin_page() {
		LoggerLoad.info("User opens Sign in Page");
		signin.getLoginPage();
		
	}

	@When("The user clicks on Register link on signin page")
	public void the_user_clicks_on_register_link_on_signin_page() {
		LoggerLoad.info("User clicks Register Link to validate");
		signin.navigateToRegisterPage();
	}

	@Then("The user redirected to Registration page from signin page")
	public void the_user_redirected_to_registration_page_from_signin_page() {
		LoggerLoad.info("User is redirected to the Register Page");
		String title = signin.verifyPageTitle();
		LoggerLoad.info("Titile of Current Page " + title);
		assertEquals(title, "Registration", "Title do not match");
	}
	
	//@TC_Signin_02
	@Given("The user is on Register page")
	public void the_user_is_on_register_page() {
	    LoggerLoad.info("User is already on Register age");
	}

	@When("The user clicks on Sign in link on Register Page")
	public void the_user_clicks_on_sign_in_link_on_register_page() {
	   LoggerLoad.info("User Clicks on Sign in link on Register Page");
	   signin.navigateToSignInLink();
	}

	@Then("The user is redirected to the Sign in page")
	public void the_user_is_redirected_to_the_sign_in_page() {
		LoggerLoad.info("User is redirected to the Sign in Page");
		String title = signin.verifyPageTitle();
		LoggerLoad.info("Titile of Current Page " + title);
		assertEquals(title, "Login", "Title do not match");
	}

	//@TC_Signin_03
	
	@Given("The user is on Sign in page")
	public void the_user_is_on_sign_in_page() {
	    LoggerLoad.info("User is on Sign in Page");
	}
	
	// invalid data from scenario outline
		@When("The user enter invalid {string} and {string}")
		public void the_user_enter_invalid_and(String username, String password) {
			LoggerLoad.info("User Enter username as \" " + username + " \" and Password as \" " + password + "\" ");
			isRequired = signin.doLogin(username, password);
			assertTrue(isRequired);
			LoggerLoad.info("Empty field value is validated");
		}

		@Then("click login button to verify")
		public void click_login_button_to_verify() {

			LoggerLoad.info("User clicks on login button");
			signin.loginButton();
		}
	
	
	
	//@TC_Signin_04
		
	// user read both invalid and valid data from excel
	@When("The user enter sheet {string} and {int}")
	public void the_user_enter_sheet_and(String sheetName, Integer rowNumber) throws IOException, InvalidFormatException {
		LoggerLoad.info("User Enter the sheet details");
		ExcelReader reader = new ExcelReader();
		LoggerLoad.info("Excel File Path in SD : " + excelfilepath);
		List<Map<String,String>> testData = reader.getData(excelfilepath, sheetName);
		 username = testData.get(rowNumber).get("username");
		 password = testData.get(rowNumber).get("password");
		 expectedMsg = testData.get(rowNumber).get("expected message");
		 
		 LoggerLoad.info("User Enter username as \" " + username + " \" Password as \" " + password + "\" ");
		 if(username != null || password != null) {
			 signin.doLogin(username, password);
		 }
		  
	}

	@Then("click login button")
	public void click_login_button() {
		
		LoggerLoad.info("User clicks login button");
		LoggerLoad.info("Expected Message - Excel Sheet :  " + expectedMsg);
		
		String msg = signin.clickLoginButton();	
		LoggerLoad.info("Actual Message :  " + msg);
		assertEquals(msg, expectedMsg);
		
	}
	
	//TC_Signin_05
	// User clicks on signout
		@Given("The user is on signin page with valid username {string} and password {string}")
		public void the_user_is_on_signin_page_with_valid_username_and_password(String string, String string2) {
//			signin.doLogin(username, password);
//			signin.clickLoginButton();
			LoggerLoad.info("User is on Sign in Page with Valid Credentials");
		}

		@When("The user click signout button")
		public void the_user_click_signout_button() {
			signin.signout();
			LoggerLoad.info("User Signed out ");
		}
		
		@Then("The user redirected to homepage")
		public void the_user_redirected_to_homepage() {
			String Title = signin.verifyPageTitle();
			LoggerLoad.info("Title of current page is" + Title);
			assertEquals(Title, "NumpyNinja", "Pass : Titles match");
		}
}
