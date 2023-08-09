package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Array;
import pageObjects.DataStructures;
import utilities.LoggerLoad;

public class ArraySD {
	Array arrayPage = new Array();

	DataStructures dsIntro = new DataStructures();
	static String expectedMsg;

	// Rest of the steps other than the below steps from all the scenarios are used from DataStructuresSD class
	// file(due to similar steps)
	
	
	// @TC_Array_01
	@When("The user clicks the {string} button in Array Panel")
	public void the_user_clicks_the_button_in_panel(String linkName) {
		LoggerLoad.info("User clicks on Get Started button in the Array Panel");
		arrayPage.clickArrayGetStarted();
	}

	// @TC_Array_02
	@When("The user clicks Arrays in Python link")
	public void the_user_clicks_arrays_in_python_link() {
		LoggerLoad.info("User clicks on Arrays in Python link");
		arrayPage.navigateToArraysinPython();
	}

	// TC_Array_06

	@Given("The user is on the {string} home page")
	public void the_user_is_on_the_home_page(String pageName) {
		LoggerLoad.info("User is on the home page");
		arrayPage.navigateToHomePage();
		String Title = arrayPage.verifyPageTitle();
		LoggerLoad.info("Title of current page is : " + Title);
		assertEquals(Title, pageName, "Title do not match");
	}

	@When("The user select {string} from the dropdown menu")
	public void the_user_select_from_the_dropdown_menu(String string) {
		arrayPage.navigateToDropdownArray();
	}

	@Then("The user be redirected to {string} Data Structure Page")
	public void the_user_be_redirected_to_data_structure_page(String pageName) {
		String Title = arrayPage.verifyPageTitle();
		LoggerLoad.info("Title of current page is : " + Title);
		assertEquals(Title, pageName, "Title do not match");
	}

	// @TC_Array_07
	@When("The user clicks Arrays Using List link")
	public void the_user_clicks_arrays_using_list_link() {
		LoggerLoad.info("User clicks on Arrays Using List link");
		arrayPage.navigateToArraysUsingList();

	}

	// @TC_Array_12
	@When("The user clicks Basic Operations in Lists link")
	public void the_user_clicks_basic_operations_in_lists_link() {
		LoggerLoad.info("User clicks on Basic Operations in Lists link");
		arrayPage.navigateToBasicOperationsinList();
	}

	// @TC_Array_17
	@When("The user clicks Applications of Array link")
	public void the_user_clicks_applications_of_array_link() {
		LoggerLoad.info("User clicks on Applications of Array link");
		arrayPage.navigateToApplicationsofArray();
	}

	// @TC_Array_21
	@Given("The user is on the tryEditor {string} page")
	public void the_user_is_on_the_tryeditor_page(String pageName) {
		LoggerLoad.info("User is on Assessment page");
		String Title = arrayPage.verifyPageTitle();
		LoggerLoad.info("Title of current page is : " + Title);
		assertEquals(Title, pageName, "Title do not match");
	}

	@When("The user clicks back from tryEditor to the previous {string} page")
	public void the_user_clicks_back_from_tryeditor_to_the_previous_page(String pgName) {
		LoggerLoad.info("User clicks back from tryEditor to the previous Applications of Array page");
		arrayPage.clickBack();
	}

	// @TC_Array_22
	@Given("The user is on the {string} page")
	public void the_user_is_on_the_page(String pageName) {
		LoggerLoad.info("User is on " + pageName + " page");
		String Title = arrayPage.verifyPageTitle();
		LoggerLoad.info("Title of current page is : " + Title);
		assertEquals(Title, pageName, "Title do not match");
	}

	@When("The user clicks Practice Questions link")
	public void the_user_clicks_practice_questions_link() {
		LoggerLoad.info("User clicks on Practice Questions link");
		arrayPage.navigateToPracticeQuestions();
	}

	// @TC_Array_23
	@When("The user clicks Search the array link")
	public void the_user_clicks_search_the_array_link() {
		LoggerLoad.info("User clicks on Search the array link");
		arrayPage.navigateToSearchtheArray();
	}

	@Then("The user should be redirected to question page contains an tryEditor with Run and Submit buttons")
	public void the_user_should_be_redirected_to_question_page_contains_an_tryEditor_with_run_and_submit_buttons() {
		String Title = arrayPage.verifyPageTitle();
		LoggerLoad.info("Title of current page is " + Title);
		assertEquals(Title, "Assessment", "Title do not match");
	}

	// @TC_Array_24
	@Given("The user is in Question page of {string} having an tryEditor with Run and Submit buttons to test")
	public void the_user_is_in_question_page_of_having_an_tryEditor_with_run_and_submit_buttons_to_test(String pgName) {

		LoggerLoad.info("The user is in Question page of " + pgName
				+ "having an tryEditor with Run and Submit buttons to test");

	}

	@When("The user enter valid python code in tryEditor from sheet {string} and {int} for the Question")
	public void the_user_enter_valid_python_code_in_try_editor_from_sheet_and_for_the_question(String sheetName,
			Integer rowNumber) throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException {
		LoggerLoad.info("The user enter valid python code in tryEditor from sheetname :" + sheetName
				+ " and row number :" + rowNumber);
		arrayPage.enterPracticeQuestsPythonCode(sheetName, rowNumber);
		expectedMsg = dsIntro.getExpectedResult(sheetName, rowNumber);

	}
	
	@Then("The user should be presented with the Run result")
	public void the_user_should_be_presented_with_the_run_result() {
		LoggerLoad.info("User should be presented with run result");
		LoggerLoad.info("Expected result  : " + expectedMsg);
	    String actualMsg = arrayPage.getActualResult();
	    LoggerLoad.info("Actual result  : " + actualMsg);
	    assertEquals(actualMsg, expectedMsg, "Result do not match");
	}

	// @TC_Array_26
	@When("The user clicks on Submit button")
	public void the_user_clicks_on_submit_button() {
		arrayPage.clickSubmitButton();
	}

	@Then("The user should be presented with successful submission message")
	public void the_user_should_be_presented_with_successful_submission_message() throws InterruptedException {
		String actualMsg = arrayPage.getActualResult();
		LoggerLoad.info("Actual result of successful submission message :" + actualMsg);
		assertEquals(actualMsg, expectedMsg, "Result do not match");
	}

	// @TC_Array_28
	@When("The user clicks Max Consecutive Ones link")
	public void the_user_clicks_max_consecutive_ones_link() {
		LoggerLoad.info("User clicks on Max Consecutive Ones link");
		arrayPage.navigateToMaxConsecutiveOnes();
	}

	// @TC_Array_33
	@When("The user clicks Find Numbers with Even Number of Digits link")
	public void the_user_clicks_find_numbers_with_even_number_of_digits_link() {
		LoggerLoad.info("User clicks on Find Numbers with Even Number of Digits link");
		arrayPage.navigateToFindNoswithEvenNosofDigits();
	}

	// @TC_Array_38
	@When("The user clicks Squares of a Sorted Array link")
	public void the_user_clicks_squares_of_A_sorted_array_link() {
		LoggerLoad.info("User clicks on Squares of a Sorted Array link");
		arrayPage.navigateToSquaresofSortedArray();
	}
}
