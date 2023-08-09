package utilities;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import factory.DriverFactory;

public class ElementsUtils {

	public static WebDriver driver = DriverFactory.getdriver();
	String excelfilepath = ConfigReader.getExcelFilePath();
	String code;
	String result;
	Actions action = new Actions(driver);
	
	//get python code from excel sheet
	public String getCodeFromExcel(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException {
		LoggerLoad.info("User Enter the sheet details");
		ExcelReader reader = new ExcelReader();
		LoggerLoad.info("Excel File Path in SD : " + excelfilepath);
		List<Map<String,String>> testData = reader.getData(excelfilepath, sheetName);
		 code = testData.get(rowNumber).get("Code");
		 result = testData.get(rowNumber).get("Result");
		 LoggerLoad.info("User enters the Python Code from the excel sheet as " + code + " and the result be " + result );
		return code;
		
	}
	
	//enter the python code using actions(typing it on the screen)
	public void enterCode(String code, WebElement editorTextarea) {
		
		action.sendKeys(editorTextarea).keyDown(Keys.CONTROL).sendKeys("a").sendKeys(Keys.DELETE).keyUp(Keys.CONTROL).perform();
		action.sendKeys(editorTextarea,code).perform();
	}
	
	//get the result from the excel sheet
	public String getResultfromExcel(String sheetName, int rowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData(excelfilepath, sheetName);
		result = testdata.get(rowNumber).get("Result");
		LoggerLoad.info("Expected result from Excel sheetname " + sheetName + " and " + rowNumber + " : " + result);
		return result;
	}
	
	//
	public void WaitForElement(WebElement output) {
		new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(output));
		}
	
//	public void enterPracticeQuestsCode(String code, WebElement editorTextarea) {
//		new Actions(driver).keyDown(Keys.COMMAND).sendKeys("a").sendKeys(Keys.DELETE).keyUp(Keys.COMMAND).perform();
//		String[] splitCode = code.split("\n");
//		for (int i = 0; i < splitCode.length; i++) {
//			System.out.println(splitCode.length);
//			if (splitCode[i].equalsIgnoreCase("\\b")) {
//				editorTextarea.sendKeys(Keys.BACK_SPACE);
//			} else {
//				editorTextarea.sendKeys(splitCode[i]);
//				editorTextarea.sendKeys(Keys.RETURN);
//			}
//		}
//	}
}
