package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.lang.ProcessHandle.Info;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DataStructures;
import pageObjects.SigninPage;
import utilities.ConfigReader;
import utilities.ElementsUtils;
import utilities.LoggerLoad;

public class DataStructuresSD {
	SigninPage signin = new SigninPage();
	DataStructures dsIntro = new DataStructures();
	String excelfilepath = ConfigReader.getExcelFilePath();
	ElementsUtils elementUtil = new ElementsUtils();
	static String code;
	static String result;
	static String expectedMsg;

	// @TC_DataStructure_01
	@Given("The user is on Sign in page of DS Algo portal")
	public void the_user_is_on_sign_in_page_of_ds_algo_portal() {
		LoggerLoad.info("The user is on Sign in page of DS Algo portal");
		signin.getLoginPage();

	}

	@When("The user enter valid {string} and {string}")
	public void the_user_enter_valid_and(String username, String password) {
		LoggerLoad.info("User enters Username as " + username + "Password as " + password);
		signin.doLogin(username, password);
	}

	@When("The user click on login button")
	public void the_user_click_on_login_button() {
		LoggerLoad.info("User clicks on login button");
		signin.clickLoginButton();
	}

//@TC_DataStructure_02
	@Given("The user is on the {string} page after logged in")
	public void the_user_is_on_the_page_after_logged_in(String pageName) {
		String Title = dsIntro.verifyPageTitle();
		LoggerLoad.info("Title of current page is " + Title);
		assertEquals(Title, pageName, "Title do not match");
	}

	@When("The user clicks the {string} button in Data Structure Page introduction Panel")
	public void the_user_clicks_the_button_in_data_structure_page_introduction_panel(String string) {
		LoggerLoad.info("User clicks on Get Started button in Data Structure Page introduction");
		dsIntro.clickDSIntroGetStarted();
	}

	@Then("The user should be redirected to {string} page")
	public void the_user_should_be_redirected_to_page(String pageName) {
		String Title = dsIntro.verifyPageTitle();
		LoggerLoad.info("Title of current page is " + Title);
		assertEquals(Title, pageName, "Title do not match");
	}

//@TC_DataStructure_03

	@When("The user clicks {string} link")
	public void the_user_clicks_link(String string) {
		LoggerLoad.info("User clicks on Time Complexity Link in Data Structure Page");
		dsIntro.navigateToTimeComplexity();
	}

//@TC_DataStructure_04

	@When("The user clicks {string} button on {string} page")
	public void the_user_clicks_button_on_page(String tryHere, String pageName) {
		LoggerLoad.info("User clicks " + tryHere + "button on " + pageName + "page");
		dsIntro.clickTryEditor();
	}

	@Then("The user should be redirected to {string} page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test(
			String pageName) {
		String Title = dsIntro.verifyPageTitle();
		LoggerLoad.info("Title of current page is" + Title);
		assertEquals(Title, pageName, "Title do not match");

	}

//@TC_DataStructure_05
	@Given("The user is in a page having an tryEditor with a Run button to test")
	public void the_user_is_in_a_page_having_an_try_editor_with_a_run_button_to_test() {
		LoggerLoad.info("User is in a page having an tryEditor with a Run button to test");
		String Title = dsIntro.verifyPageTitle();
		LoggerLoad.info("Title of current page is" + Title);
		assertEquals(Title, "Assessment", "Title do not match");
	}

	@When("The user enter valid python code in tryEditor from sheet {string} and {int}")
	public void the_user_enter_valid_python_code_in_try_editor_from_sheet_and(String sheetName, Integer rowNumber)
			throws InvalidFormatException, IOException {
		LoggerLoad.info("User enters valid python code in tryEditor from sheetname :" + sheetName + " and row number : "
				+ rowNumber);
		dsIntro.enterPythonCode(sheetName, rowNumber);
		expectedMsg = dsIntro.getExpectedResult(sheetName, rowNumber);

	}

	@When("The user clicks on run button")
	public void the_user_clicks_on_run_button() {
		LoggerLoad.info("User clicks on run button");
		dsIntro.clickRunButton();
	}

	@Then("The user should be presented with Run result")
	public void the_user_should_be_presented_with_run_result() {
		LoggerLoad.info("User should be presented with run result");
		LoggerLoad.info("Expected result  : " + expectedMsg);
		String actualMsg = dsIntro.getActualResult();
		LoggerLoad.info("Actual result  : " + actualMsg);
		assertEquals(actualMsg, expectedMsg, "Result do not match");
	}

//@TC_DataStructure_06
	@When("The user enter python code with invalid syntax in tryEditor from sheet {string} and {int}")
	public void the_user_enter_python_code_with_invalid_syntax_in_try_editor_from_sheet_and(String sheetName,
			Integer rowNumber) throws InvalidFormatException, IOException {
		LoggerLoad.info("User enters invalid python code in tryEditor from sheetname :" + sheetName
				+ " and row number : " + rowNumber);
		dsIntro.enterPythonCode(sheetName, rowNumber);
		expectedMsg = dsIntro.getExpectedResult(sheetName, rowNumber);
	}

	@Then("The user should be presented with error message")
	public void the_user_should_be_presented_with_error_message() {
		LoggerLoad.info("User should be presented with error message");
		LoggerLoad.info("Expected result  : " + expectedMsg);
		String actualErrorMsg = dsIntro.getAlertErrorText();
		LoggerLoad.info("Actual Error Message  : " + actualErrorMsg);
		assertEquals(actualErrorMsg, expectedMsg, "Result do not match");
	}

}
