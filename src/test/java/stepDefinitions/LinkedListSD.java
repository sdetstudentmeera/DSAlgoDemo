package stepDefinitions;
import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;
import pageObjects.DataStructures;
import pageObjects.LinkedList;

import pageObjects.SigninPage;
import utilities.ConfigReader;
import utilities.ElementsUtils;
import utilities.LoggerLoad;
public class LinkedListSD {
	SigninPage signin = new SigninPage();
	String excelfilepath = ConfigReader.getExcelFilePath();
	DataStructures data = new DataStructures();
    ElementsUtils elementUtil = new ElementsUtils();
	static String code;
	static String result;
	static String expectedResult;
	LinkedList list = new LinkedList();
	
	//@TC_LL_02
	@When("The user clicks the {string} button under Linked List")
	public void the_user_clicks_the_button_under_linked_list(String string) {
		LoggerLoad.info("User clicks on Get Started button in the Linked List Panel");
	    list.getStarted(string);
	}
	

	@When("The user clicks Introduction link")
	public void the_user_clicks_introduction_link() {
		list.intro();
	    
	}
	
	@Given("The user is on the Introduction page")
	public void the_user_is_on_the_introduction_page() {
		
		String Title = list.verifyPageTitle();
		LoggerLoad.info("Title of current page is " + Title);
		assertEquals(Title, "Introduction", "Title do not match");
	}
	    
	@Given("The user is on the try editor after validating the python code")
	public void the_user_is_on_the_try_editor_after_validating_the_python_code() {
		String Title = list.verifyPageTitle();
		LoggerLoad.info("Title of current page is " + Title);
		assertEquals(Title, "Assessment", "Title do not match");
	}
	
	@When("The user clicks back to the previous page from try editor")
	public void the_user_clicks_back_to_the_previous_page_from_try_editor() {
		list.clickBack();
	}
	
	
	//@TC_LL_07
	@When("The user clicks the Creating Linked List link")
	public void the_user_clicks_the_creating_linked_list_link() {
		list.createLL();
	    
	}
	
	@Given("The user is in the {string} page")
	public void the_user_is_in_the_page1(String pageName) {
		String Title = list.verifyPageTitle();
		LoggerLoad.info("Title of current page is " + Title);
		assertEquals(Title, pageName, "Title do not match");
	}
	
	@When("The user clicks the Types of Linked List link")
	public void the_user_clicks_the_types_of_linked_list_link() {
	    list.typesOfLL();
	}

	
	

	

	@When("The user clicks the Implement Linked List in Python link")
	public void the_user_clicks_the_implement_linked_list_in_python_link() {
	    list.implementLL();
	}

	
	@When("The user clicks the Traversal link")
	public void the_user_clicks_the_traversal_link() {
	    list.traversal();
	}

	

	@When("The user clicks the Insertion link")
	public void the_user_clicks_the_insertion_link() {
	    list.insertion();
	}
	
	

	@When("The user clicks the Deletion link")
	public void the_user_clicks_the_deletion_link() {
	    list.deletion();
	}
}
