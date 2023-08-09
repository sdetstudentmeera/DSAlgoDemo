package pageObjects;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import factory.DriverFactory;
import utilities.ConfigReader;
import utilities.ElementsUtils;
import utilities.LoggerLoad;


public class Array {
	public static WebDriver driver = DriverFactory.getdriver();
	String homeUrl = ConfigReader.getHomePage();
	ElementsUtils elementUtil = new ElementsUtils();

	@FindBy(xpath = "//a[@href='array']")
	WebElement array_getStarted;
	@FindBy(xpath = "//a[@href='arrays-in-python']")
	WebElement arraysInPython;
	@FindBy(xpath = "//a[@class='nav-link dropdown-toggle']")
	WebElement dropdown_dataStructs;
	@FindBy(xpath = "//a[@href='/array']")
	WebElement dropdown_array;
	@FindBy(xpath = "//a[@href='arrays-using-list']")
	WebElement arraysUsingList;
	@FindBy(xpath = "//a[@href='basic-operations-in-lists']")
	WebElement basicOperationsinLists;
	@FindBy(xpath = "//a[@href='applications-of-array']")
	WebElement applicationsofArray;
	@FindBy(xpath = "//a[@href='/array/practice']")
	WebElement practiceQuests;
	@FindBy(xpath = "//a[@href='/question/1']")
	WebElement searchofArray;
	@FindBy(xpath = "//a[@href='/question/2']")
	WebElement maxConsecutiveOnes;
	@FindBy(xpath = "//a[@href='/question/3']")
	WebElement findNosWithEvenNosofDigits;
	@FindBy(xpath = "//a[@href='/question/4']")
	WebElement squaresofSortedArray;
	@FindBy(xpath = "//textarea[@tabindex='0']")
	WebElement editorTextarea;
	@FindBy(xpath = "//pre[@id='output']")
	WebElement output;
	@FindBy(xpath = "//*[@id='answer_form']")
	WebElement answerForm;
	@FindBy(xpath = "//*[@class='button']")
	WebElement submit;

	public Array() {
		PageFactory.initElements(driver, this);
	}

	// Verify the title of the page
	public String verifyPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;

	}

	// navigate to home page
	public void navigateToHomePage() {
		driver.get(homeUrl);
	}

	// to click get started in array panel
	public void clickArrayGetStarted() {
		array_getStarted.click();
	}

	// navigate to Arrays in Python
	public void navigateToArraysinPython() {
		arraysInPython.click();
	}

	// navigate to the dropdown array
	public void navigateToDropdownArray() {

		dropdown_dataStructs.click();
		LoggerLoad.info("Click " + dropdown_dataStructs.getText() + "on the dropdown");
		dropdown_array.click();
		LoggerLoad.info("Click " + dropdown_array.getText() + "from the Data Structures dropdown");
	}

	// navigate to Arrays Using List
	public void navigateToArraysUsingList() {
		arraysUsingList.click();
	}

	// navigate to Basic Operations in List
	public void navigateToBasicOperationsinList() {
		basicOperationsinLists.click();
	}

	// navigate to Applications of Array
	public void navigateToApplicationsofArray() {
		applicationsofArray.click();
	}

	// click "back" to navigate to the previous page
	public void clickBack() {
		driver.navigate().back();
	}

// navigate to Practice Questions
	public void navigateToPracticeQuestions() {
		practiceQuests.click();
	}

	// navigate to Search the array
	public void navigateToSearchtheArray() {
		searchofArray.click();
	}

	// click submit button in the tryEditor
	public void clickSubmitButton() {
		LoggerLoad.info("Click on Submit button");
		submit.click();
	}

	public String getActualResult() {
		elementUtil.WaitForElement(output);
		return output.getText();
	}

	// enter the practice question python code using the getCodeFromExcel method
	// from ElementsUtils
	public void enterPracticeQuestsPythonCode(String sheetName, Integer rowNumber)
			throws InvalidFormatException, IOException {
		//elementUtil.WaitForElement(answerForm);

		String code = elementUtil.getCodeFromExcel(sheetName, rowNumber);
		elementUtil.enterCode(code, editorTextarea);

	}

	// navigate to Max Consecutive Ones
	public void navigateToMaxConsecutiveOnes() {
		maxConsecutiveOnes.click();

	}

	// navigate to Find Numbers with Even Number of Digits
	public void navigateToFindNoswithEvenNosofDigits() {
		findNosWithEvenNosofDigits.click();
	}

	// navigate to Squares of a Sorted Array
	public void navigateToSquaresofSortedArray() {
		squaresofSortedArray.click();

	}

}
