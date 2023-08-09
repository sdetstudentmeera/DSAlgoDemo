package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import factory.DriverFactory;
import utilities.ConfigReader;
import utilities.ElementsUtils;
public class LinkedList {
	public static WebDriver driver = DriverFactory.getdriver();
	String homeUrl = ConfigReader.getHomePage();
	String loginUrl = ConfigReader.getLoginPage();
	ElementsUtils elementUtil = new ElementsUtils();
	
	@FindBy(xpath = "//a[@href='linked-list']")WebElement getstarted_linkedlist;
	@FindBy(xpath = "//a[@href ='introduction']")WebElement intro;
	//@FindBy(xpath = "//a[@href ='/linked-list/creating-linked-list']")WebElement create_LL;
	@FindBy(linkText = "Creating Linked LIst")WebElement create_LL;
	//@FindBy(xpath = "//a[@href ='/linked-list/types-of-linked-list']")WebElement typesOf_LL;
	@FindBy(linkText = "Types of Linked List")WebElement typesOf_LL;
	//@FindBy(xpath = "//a[@href ='/linked-list/implement-linked-list-in-python']")WebElement implement_LL;
	@FindBy(linkText = "Implement Linked List in Python")WebElement implement_LL;
	//@FindBy(xpath = "//a[@href ='/linked-list/traversal']")WebElement traversal;
	@FindBy(linkText = "Traversal")WebElement traversal;
	//@FindBy(xpath = "//a[@href ='/linked-list/insertion-in-linked-list']")WebElement insertion;
	@FindBy(linkText = "Insertion")WebElement insertion;
	//@FindBy(xpath = "//a[@href ='/linked-list/deletion-in-linked-list']")WebElement deletion;
	@FindBy(linkText = "Deletion")WebElement deletion;
	@FindBy(xpath = "//a[@href='/tryEditor']")WebElement tryHere;
	@FindBy(xpath="//button [@type = 'button']")WebElement run;
	@FindBy(xpath="//pre [@ class = ' CodeMirror-line ']")WebElement tryEditor;
	@FindBy(xpath="//pre[@id='output']")WebElement output;
	
	public LinkedList() {
		PageFactory.initElements(driver, this);
	
	}
	public void getStarted(String string) {
		getstarted_linkedlist.click();
		
	}
	
	// Verify the title of the page
	public String verifyPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}
	
	public void intro() {
		intro.click();
	}
	
	public void createLL() {
		create_LL.click();
	}
	
	public void typesOfLL() {
		typesOf_LL.click();
	}
	
	public void implementLL() {
		implement_LL.click();
	}
	
	public void traversal() {
		traversal.click();
	}
	
	public void insertion() {
		insertion.click();
	}
	
	public void deletion() {
		deletion.click();
	}
	
	public void tryHere() {
		tryHere.click();
	}
	
	public void run() {
		run.click();
	}
	
	public void clickBack() {
		driver.navigate().back();
	}
	
	
}
