@DataStructure
Feature: User launch DSAlgo application and test Data Structure introduction page

@TC_DataStructure_01
  Scenario: The user is logged in to DS Algo portal
    Given The user is on Sign in page of DS Algo portal
    When The user enter valid "Numpysdet117" and "sdet117batch"
    And The user click on login button
    Then The user redirected to homepage

@TC_DataStructure_02
  Scenario: The user is able to navigate to Data Structure introduction page
    Given The user is on the "NumpyNinja" page after logged in
    When The user clicks the "Get Started" button in Data Structure Page introduction Panel
    Then The user should be redirected to "Data Structures-Introduction" page
    
    @TC_DataStructure_03
  Scenario: The user is able to navigate to Time Complexity page
    Given The user is on the "Data Structures-Introduction" page after logged in
    When The user clicks "Time Complexity" link
    Then The user should be redirected to "Time Complexity" page
    
     @TC_DataStructure_04
  Scenario: The user is able to navigate to a page having an tryEditor from Time Complexity page
    Given The user is on the "Time Complexity" page after logged in
    When The user clicks "Try here>>>" button on "Time Complexity" page
    Then The user should be redirected to "Assessment" page having an tryEditor with a Run button to test
    
    @TC_DataStructure_05
  Scenario Outline: The user is able run code in tryEditor for Time Complexity page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with Run result

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         0 |
    
    @TC_DataStructure_06
  Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Time Complexity page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with error message

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         1 |
    
    