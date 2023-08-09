package stepDefinitions;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DataStructures;
import pageObjects.Graph;

import pageObjects.SigninPage;
import utilities.ConfigReader;
import utilities.ElementsUtils;
import utilities.LoggerLoad;
public class GraphSD {

	SigninPage signin = new SigninPage();
	String excelfilepath = ConfigReader.getExcelFilePath();
	DataStructures data = new DataStructures();
    ElementsUtils elementUtil = new ElementsUtils();
	static String code;
	static String result;
	static String expectedResult;
	Graph graph = new Graph();

	
	@When("The user select Graph item from the drop down menu")
	public void the_user_select_graph_item_from_the_drop_down_menu() {
	    graph.dropdown();
	    graph.graph();
	}
	
	//@TC_Graph_03
	
	@Given("The user is on the Graph page after logged in")
	public void the_user_is_on_the_graph_page_after_logged_in() {
		String Title = graph.verifyPageTitle();
		LoggerLoad.info("Title of current page is " + Title);
		assertEquals(Title, "Graph", "Title do not match");
	}

	@When("The user clicks on the Graph link")
	public void the_user_clicks_on_the_graph_link() {
	    graph.graphLink();
	}

	@Then("The user should then be directed to Graph Page")
	public void the_user_should_then_be_directed_to_graph_page() {
		String Title = graph.verifyPageTitle();
		LoggerLoad.info("Title of current page is " + Title);
		assertEquals(Title, "Graph", "Title do not match");
	}
	
	//@TC_Graph_08
	
	@Given("The user is on the Graph page")
	public void the_user_is_on_the_graph_page() {
		String Title = graph.verifyPageTitle();
		LoggerLoad.info("Title of current page is " + Title);
		assertEquals(Title, "Graph", "Title do not match");
	}

	@When("The user clicks the Graph Representations link")
	public void the_user_clicks_the_graph_representations_link() {
	    graph.graphRep();
	}
	
	//@TC_Graph_13
	
	@Given("The user is on the Graph Representations page")
	public void the_user_is_on_the_graph_representations_page() {
		String Title = graph.verifyPageTitle();
		LoggerLoad.info("Title of current page is " + Title);
		assertEquals(Title, "Graph Representations", "Title do not match");
	}
	
}
