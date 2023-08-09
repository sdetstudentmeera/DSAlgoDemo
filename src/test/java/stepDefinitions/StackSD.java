package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Array;
import pageObjects.DataStructures;
import pageObjects.Queue;
import pageObjects.Stack;
import utilities.LoggerLoad;

public class StackSD {
	Array arrayPage = new Array();
	Queue queuePage = new Queue();
	DataStructures dsIntro = new DataStructures();
	Stack stackpage= new Stack();
	

	@When("The user clicks the {string} button in Stack Panel")
	public void the_user_clicks_the_button_in_panel(String linkName) {
		LoggerLoad.info("User clicks on Get Started button in the Stack Panel");
		stackpage.clickStackGetStarted();
	}
	
	@When("The user clicks Operations in Stack link")
	public void the_user_clicks_operations_in_stack_link() {
	    stackpage.operationsInStack();
	}


	@When("The user clicks Implementation link")
	public void the_user_clicks_implementation_link() {
	   stackpage.navigateToImplementation();
	}

	@When("The user clicks Applications link")
	public void the_user_clicks_applications_link() {
	   stackpage.navigateToApplications();
	}
	
		@When("The user select Stack from the dropdown menu")
		public void the_user_select_stack_from_the_dropdown_menu() {
			stackpage.navigateToDropdownStack();
		}
	
}
