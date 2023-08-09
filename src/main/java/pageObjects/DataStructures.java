package pageObjects;

import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import factory.DriverFactory;


import utilities.ElementsUtils;


public class DataStructures {
	
	public static WebDriver driver=DriverFactory.getdriver();
	ElementsUtils elementUtil = new ElementsUtils();
	Actions action = new Actions(driver);
		
		@FindBy (xpath="//a[@href='data-structures-introduction']")WebElement ds_getStarted;
		@FindBy (xpath="//a[@href='time-complexity']")WebElement ds_timeComplexity;
		@FindBy (xpath="//a[@href='/tryEditor']")WebElement tryEditor;
		@FindBy(xpath ="//textarea[@tabindex='0']")WebElement editorTextarea;
		@FindBy(xpath="//button[@onclick='runit()']")WebElement runButton;
		@FindBy(xpath="//pre[@id='output']")WebElement output;
		
		
		public DataStructures() {
			PageFactory.initElements(driver, this);

		}
		
		// Verify the title of the page
			public String verifyPageTitle() {
				String pageTitle = driver.getTitle();
				return pageTitle;

			}
			
		public void clickDSIntroGetStarted() {
			ds_getStarted.click();
		}
		
		
		public void navigateToTimeComplexity(){
			ds_timeComplexity.click();
		}
		
		public void clickTryEditor(){
			tryEditor.click();
		}
		
		//enter the python code using the getCodeFromExcel method from ElementsUtils
		public void enterPythonCode(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException {	
			String code = elementUtil.getCodeFromExcel(sheetName, rowNumber);
			//editorTextarea.sendKeys(code);
			//editorTextarea.clear();
			elementUtil.enterCode(code, editorTextarea);
			
		}
		
		public void clickRunButton() {
			runButton.click();
		}
		
		//enter the result using the getExpectedResult method from ElementsUtils
		public String getExpectedResult(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException {
			 String expectedResult = elementUtil.getResultfromExcel(sheetName, rowNumber);
			 return expectedResult;	 		 
		}
		
		public String getActualResult() {
			elementUtil.WaitForElement(output);
			return output.getText();
		}
		
		public String getAlertErrorText() {
			String errorMsg = driver.switchTo().alert().getText();
			driver.switchTo().alert().accept();
			return errorMsg;

		}
		
		
		
	}

