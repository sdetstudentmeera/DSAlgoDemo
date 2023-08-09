package stepDefinitions;
import io.cucumber.java.en.When;
import pageObjects.Array;
import pageObjects.DataStructures;
import pageObjects.Queue;
import utilities.LoggerLoad;
public class QueueSD {
	Array arrayPage = new Array();
	Queue queuePage = new Queue();
	DataStructures dsIntro = new DataStructures();

	// @TC_Queue_01
	@When("The user clicks the {string} button in Queue Panel")
	public void the_user_clicks_the_button_in_panel(String linkName) {
		LoggerLoad.info("User clicks on Get Started button in the Array Panel");
		queuePage.clickQueueGetStarted();
	}

	// @TC_Queue_02
	@When("The user clicks Implementation of Queue in Python link")
	public void the_user_clicks_implementation_of_queue_in_python_link() {
		LoggerLoad.info("User clicks on Implementation of Queue in Python link");
		queuePage.navigateToImpleQueueinPython();
	}

	// @TC_Queue_06
	@When("The user select Queue from the dropdown menu")
	public void the_user_select_queue_from_the_dropdown_menu() {
		queuePage.navigateToDropdownQueue();
	}

	// @TC_Queue_07
	@When("The user clicks Implementation using collections.deque link")
	public void the_user_clicks_implementation_using_collections_deque_link() {
		LoggerLoad.info("User clicks on Implementation using collections.deque link");
		queuePage.navigateToImpleUsingCollections();
	}

	// @TC_Queue_12
	@When("The user clicks Implementation using array link")
	public void the_user_clicks_implementation_using_array_link() {
		LoggerLoad.info("User clicks on Implementation using array link");
		queuePage.navigateToImpleUsingArray();
	}

	// @TC_Queue_17
	@When("The user clicks Queue Operations link")
	public void the_user_clicks_queue_operations_link() {
		LoggerLoad.info("User clicks on Queue Operations link");
		queuePage.navigateToQueueOperations();
	}
}
