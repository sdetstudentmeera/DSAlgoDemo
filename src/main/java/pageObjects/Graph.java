package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import factory.DriverFactory;
import utilities.ConfigReader;
import utilities.ElementsUtils;
public class Graph {
	public static WebDriver driver = DriverFactory.getdriver();
	String homeUrl = ConfigReader.getHomePage();
	String loginUrl = ConfigReader.getLoginPage();
	ElementsUtils elementUtil = new ElementsUtils();
	
	@FindBy(xpath = "//a[@class='nav-link dropdown-toggle']")WebElement dropdown_dataStructs;
	@FindBy(xpath = "//a[@href='/graph']")WebElement dropdown_graph;
	@FindBy(linkText = "Graph")WebElement graph;
	@FindBy(linkText = "Graph Representations")WebElement graphRep;
	@FindBy(xpath = "//a[@href='/graph/practice']")WebElement graphPracticeQuestions;
	
	public void PracticeQuestions() {
		graphPracticeQuestions.click();
	}
	
	public Graph() {
		PageFactory.initElements(driver, this);
	
	}
	public void dropdown() {
		dropdown_dataStructs.click();
	}
	
	public void graph() {
		dropdown_graph.click();
	}
	
	public void graphLink() {
		graph.click();
	}
	
	// Verify the title of the page
			public String verifyPageTitle() {
				String pageTitle = driver.getTitle();
				return pageTitle;
			}
			
			public void graphRep() {
				graphRep.click();
			}
}
