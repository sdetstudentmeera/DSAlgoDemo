package runner;


import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		plugin= {"pretty","html:target/CucumberReport/dsAlgoReport.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",}, // reporting purpose
		monochrome = false, // console output
		tags = "",// tags from feature file
		features = { "src/test/resources/features" }, // location of feature files
		glue = { "stepDefinitions", "hooks" }) // location of step definition files

public class TestRunner extends AbstractTestNGCucumberTests {
	@DataProvider(parallel = false)
	public Object[][] scenarios() {

		return super.scenarios();
	}
	//@BeforeTest
	//@Parameters("browser")
	//public void defineBrowser(String browser)throws throwable {
		//ConfigReader.setBrowserType(browser);
	}
/*
import org.testng.annotations.DataProvider;
 This line imports the DataProvider annotation from the TestNG library,
  which is used for supplying test data to test methods.

import io.cucumber.testng.AbstractTestNGCucumberTests;
 This line imports the AbstractTestNGCucumberTests class from the Cucumber TestNG integration,
  which allows you to run Cucumber scenarios using TestNG.

import io.cucumber.testng.CucumberOptions;:
 This line imports the CucumberOptions annotation from the Cucumber TestNG integration,
  which is used to configure Cucumber options.

@CucumberOptions(...): This is an annotation that configures various options for the Cucumber test execution. Let's break down the options specified:

plugin = { "pretty", "html:target/CucumberReport/dsAlgoReport.html" }:

 This sets up Cucumber to generate a pretty formatted console output and an HTML report in the specified directory.

monochrome = false: This determines whether the console output should be in monochrome (true) or with colors (false).

tags = "": This is where you can specify the tags from the feature files that you want to include or exclude 
during test execution. As it is currently set to an empty string, it means all scenarios will be executed.

features = { "src/test/resources/features" }:
 This sets the location of the Cucumber feature files, which define the scenarios to be tested.

glue = { "stepDefinitions", "myHooks" }:
 This sets the location of the step definition files and any additional hook classes 
 that provide the implementation of the Cucumber steps.

public class TestRunner extends AbstractTestNGCucumberTests: 

This line defines a TestRunner class that extends the AbstractTestNGCucumberTests class.
 This inheritance is required to integrate Cucumber with TestNG.

@DataProvider(parallel = false): 
This line is an annotation that defines a TestNG DataProvider. 
It is used to supply test data to the test methods.

public Object[][] scenarios() { ... }: 
This is the method called scenarios(), which serves as the TestNG DataProvider
. It returns a 2D array of Objects representing the test scenarios.

return super.scenarios();: This line calls the scenarios() method of the parent class (AbstractTestNGCucumberTests)
 using the super keyword. This method likely retrieves the scenarios that need to be executed as defined
  in the Cucumber feature files.

In summary, this Test Runner class is used to configure and execute Cucumber scenarios with TestNG.
 It sets up the location of feature files, step definitions, and any hooks, along with specifying the
  test data provider and Cucumber options for reporting and console output. 
  The scenarios will run sequentially (not in parallel) due to the parallel = false attribute in the DataProvider
   annotation.*/

