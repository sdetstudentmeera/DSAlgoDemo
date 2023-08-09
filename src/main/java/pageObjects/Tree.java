package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import factory.DriverFactory;
import utilities.ConfigReader;
import utilities.ElementsUtils;
public class Tree {
	public static WebDriver driver = DriverFactory.getdriver();
	String homeUrl = ConfigReader.getHomePage();
	String loginUrl = ConfigReader.getLoginPage();
	ElementsUtils elementUtil = new ElementsUtils();

	
	@FindBy(xpath = "//a[@class='nav-link dropdown-toggle']")WebElement dropdown_dataStructs;
	@FindBy(xpath = "//a[@href='/tree']")WebElement dropdown_tree;
	@FindBy(xpath = "//a[@href='overview-of-trees']")WebElement oVofTree;
	@FindBy(linkText = "Terminologies")WebElement terminologies;
	@FindBy(linkText = "Types of Trees")WebElement typesOfTrees;
	@FindBy(linkText = "Tree Traversals")WebElement treeTraversal;
	@FindBy(linkText = "Traversals-Illustration")WebElement traversalsIllus;
	@FindBy(linkText = "Binary Trees")WebElement binaryTrees;
	@FindBy(linkText = "Types of Binary Trees")WebElement typesOfBinary;
	@FindBy(linkText = "Implementation in Python")WebElement implementationInPython;
	@FindBy(linkText = "Binary Tree Traversals")WebElement binaryTreeTraversals;
	@FindBy(linkText = "Implementation of Binary Trees")WebElement implementationOfBinary;
	@FindBy(linkText = "Applications of Binary trees")WebElement appOfBinary;
	@FindBy(linkText = "Binary Search Trees")WebElement binarySearch;
	@FindBy(linkText = "Implementation Of BST")WebElement implementationOfBST;
	@FindBy(linkText = "Practice Questions")WebElement practice;
	
	
	public Tree() {
		PageFactory.initElements(driver, this);
	
	}
	
	public void dropdown() {
		dropdown_dataStructs.click();
	}
	
	public void tree() {
		dropdown_tree.click();
	}
	
	// Verify the title of the page
		public String verifyPageTitle() {
			String pageTitle = driver.getTitle();
			return pageTitle;
		}
		
		public void oVofTree() {
			oVofTree.click();
		}
		
		public void termino() {
			terminologies.click();
		}
		
		public void typesOfTrees() {
			typesOfTrees.click();
		}
		
		public void treeTraversal() {
			treeTraversal.click();
		}
		
		public void traversalsIllus() {
			traversalsIllus.click();
		}
		
		public void binaryTrees() {
			binaryTrees.click();
		}
		
		public void typesOfBinary() {
			typesOfBinary.click();
		}
		
		public void implementationInPython() {
			implementationInPython.click();
		}
		
		public void binaryTreeTraversals() {
			binaryTreeTraversals.click();
		}
		
		public void implementationOfBinary() {
			implementationOfBinary.click();
		}
		
		public void appOfBinary() {
			appOfBinary.click();
		}
		
		public void binarySearch() {
			binarySearch.click();
		}
		
		public void implementationOfBST() {
			implementationOfBST.click();
		}
		
		public void practice() {
			practice.click();
		}
}
