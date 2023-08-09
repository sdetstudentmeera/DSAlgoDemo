package stepDefinitions;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DataStructures;
import pageObjects.LinkedList;
import pageObjects.SigninPage;
import pageObjects.Tree;
import utilities.ConfigReader;
import utilities.ElementsUtils;
import utilities.LoggerLoad;
public class TreeSD {
	SigninPage signin = new SigninPage();
	String excelfilepath = ConfigReader.getExcelFilePath();
	DataStructures data = new DataStructures();
    ElementsUtils elementUtil = new ElementsUtils();
	static String code;
	static String result;
	static String expectedResult;
	Tree tree = new Tree();
	
	//@TC_Tree_02
	
	@When("The user select Tree item from the drop down menu")
	public void the_user_select_tree_item_from_the_drop_down_menu() {
	    tree.dropdown();
	    tree.tree();
	}
	//@TC_Tree_03
	
	@Given("The user is on the Tree page after logged in")
	public void the_user_is_on_the_tree_page_after_logged_in() {
		String Title = tree.verifyPageTitle();
		LoggerLoad.info("Title of current page is " + Title);
		assertEquals(Title, "Tree", "Title do not match");
	}

	@When("The user clicks on the Overview of Trees link")
	public void the_user_clicks_on_the_overview_of_trees_link() {
	    tree.oVofTree();
	}

	@Then("The user should then be directed to Overview of Trees Page")
	public void the_user_should_then_be_directed_to_overview_of_trees_page() {
		String Title = tree.verifyPageTitle();
		LoggerLoad.info("Title of current page is " + Title);
		assertEquals(Title, "Overview of Trees", "Title do not match");
	}
	 //@TC_Tree_08
	@Given("The user is on the Overview of Trees page")
	public void the_user_is_on_the_overview_of_trees_page() {
		String Title = tree.verifyPageTitle();
		LoggerLoad.info("Title of current page is " + Title);
		assertEquals(Title, "Overview of Trees", "Title do not match");
	}

	@When("The user clicks the Terminologies link")
	public void the_user_clicks_the_terminologies_link() {
	    tree.termino();
	}
	
	@Given("The user is on the Terminologies page")
	public void the_user_is_on_the_terminologies_page() {
		String Title = tree.verifyPageTitle();
		LoggerLoad.info("Title of current page is " + Title);
		assertEquals(Title, "Terminologies", "Title do not match");
	}

	@When("The user clicks the Types of Trees link")
	public void the_user_clicks_the_types_of_trees_link() {
	    tree.typesOfTrees();
	}
	//@TC_Tree_18
	
	@Given("The user is on the Types of Trees page")
	public void the_user_is_on_the_types_of_trees_page() {
		String Title = tree.verifyPageTitle();
		LoggerLoad.info("Title of current page is " + Title);
		assertEquals(Title, "Types of Trees", "Title do not match");
	}

	@When("The user clicks the Tree Traversals")
	public void the_user_clicks_the_tree_traversals() {
		tree.treeTraversal();
	    
	}
	
	@Given("The user is on the Tree Traversals page")
	public void the_user_is_on_the_tree_traversals_page() {
		String Title = tree.verifyPageTitle();
		LoggerLoad.info("Title of current page is " + Title);
		assertEquals(Title, "Tree Traversals", "Title do not match");
	}

	@When("The user clicks the Traversals-Illustration")
	public void the_user_clicks_the_traversals_illustration() {
	    tree.traversalsIllus();
	}
	
	//@TC_Tree_28
	
	@Given("The user is on the Traversals-Illustration page")
	public void the_user_is_on_the_traversals_illustration_page() {
		String Title = tree.verifyPageTitle();
		LoggerLoad.info("Title of current page is " + Title);
		assertEquals(Title, "Traversals-Illustration", "Title do not match");  
	}

	@When("The user clicks the Binary Trees link")
	public void the_user_clicks_the_binary_trees_link() {
	   tree.binaryTrees(); 
	}
	
	//@TC_Tree_33
	
	@Given("The user is on the Binary Trees page")
	public void the_user_is_on_the_binary_trees_page() {
		String Title = tree.verifyPageTitle();
		LoggerLoad.info("Title of current page is " + Title);
		assertEquals(Title, "Binary Trees", "Title do not match");
	}

	@When("The user clicks the Types of Binary Trees link")
	public void the_user_clicks_the_types_of_binary_trees_link() {
	    tree.typesOfBinary();
	}
	
	//@TC_Tree_38
	
	@Given("The user is on the Types of Binary Trees page")
	public void the_user_is_on_the_types_of_binary_trees_page() {
		String Title = tree.verifyPageTitle();
		LoggerLoad.info("Title of current page is " + Title);
		assertEquals(Title, "Types of Binary Trees", "Title do not match");
	}

	@When("The user clicks the Implementation in Python link")
	public void the_user_clicks_the_implementation_in_python_link() {
	    tree.implementationInPython();
	}
	
	//@TC_Tree_43
	
	@Given("The user is on the Implementation in Python page")
	public void the_user_is_on_the_implementation_in_python_page() {
		String Title = tree.verifyPageTitle();
		LoggerLoad.info("Title of current page is " + Title);
		assertEquals(Title, "Implementation in Python", "Title do not match");
	}

	@When("The user clicks the Binary Tree Traversals link")
	public void the_user_clicks_the_binary_tree_traversals_link() {
	    tree.binaryTreeTraversals();
	}
	
	@Given("The user is on the Binary Tree Traversals page")
	public void the_user_is_on_the_binary_tree_traversals_page() {
		String Title = tree.verifyPageTitle();
		LoggerLoad.info("Title of current page is " + Title);
		assertEquals(Title, "Binary Tree Traversals", "Title do not match");
	}

	@When("The user clicks the Implementation of Binary Trees link")
	public void the_user_clicks_the_implementation_of_binary_trees_link() {
	    tree.implementationOfBinary();
	}
	
	//@TC_Tree_53
	
	@Given("The user is on the Implementation of Binary Trees page")
	public void the_user_is_on_the_implementation_of_binary_trees_page() {
		String Title = tree.verifyPageTitle();
		LoggerLoad.info("Title of current page is " + Title);
		assertEquals(Title, "Implementation of Binary Trees", "Title do not match");
	}

	@When("The user clicks the Applications of Binary trees link")
	public void the_user_clicks_the_applications_of_binary_trees_link() {
	    tree.appOfBinary();
	}

	//@TC_Tree_58
	
	@Given("The user is on the Applications of Binary trees page")
	public void the_user_is_on_the_applications_of_binary_trees_page() {
		String Title = tree.verifyPageTitle();
		LoggerLoad.info("Title of current page is " + Title);
		assertEquals(Title, "Applications of Binary trees", "Title do not match");
	}

	@When("The user clicks the Binary Search Trees link")
	public void the_user_clicks_the_binary_search_trees_link() {
	    tree.binarySearch();
	}

	//@TC_Tree_63
	
	@Given("The user is on the Binary Search Trees page")
	public void the_user_is_on_the_binary_search_trees_page() {
		String Title = tree.verifyPageTitle();
		LoggerLoad.info("Title of current page is " + Title);
		assertEquals(Title, "Binary Search Trees", "Title do not match");
	}

	@When("The user clicks the Implementation Of BST link")
	public void the_user_clicks_the_implementation_of_bst_link() {
	    tree.implementationOfBST();
	}
	
	//@TC_Tree_68
	
	@Given("The user is on the Implementation Of BST page")
	public void the_user_is_on_the_implementation_of_bst_page() {
		String Title = tree.verifyPageTitle();
		LoggerLoad.info("Title of current page is " + Title);
		assertEquals(Title, "Implementation Of BST", "Title do not match");
	}

	@When("The user clicks the Practice Questions link")
	public void the_user_clicks_the_practice_questions_link() {
	    tree.practice();
	}

}
