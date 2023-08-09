@Queue
Feature: User launch DSAlgo application and test Queue page

#		Scenario: The user is logged in to DS Algo portal
    #Given The user is on Sign in page of DS Algo portal
    #When The user enter valid "Numpysdet117" and "sdet117batch"
    #And The user click on login button
    #Then The user redirected to homepage
    
		@TC_Queue_01
  	Scenario: The user is able to navigate to Queue page
    Given The user is on home page
    When The user clicks the "Get Started" button in Queue Panel
    Then The user should be redirected to "Queue" page
    
  	@TC_Queue_02
  	Scenario: The user is able to navigate to Implementation of Queue in Python page
    Given The user is on the "Queue" page after logged in
    When The user clicks Implementation of Queue in Python link
    Then The user should be redirected to "Implementation of Queue in Python" page
    
    @TC_Queue_03
		Scenario: The user is able to navigate to a page having an tryEditor from Implementation of Queue in Python page
    Given The user is on the "Implementation of Queue in Python" page after logged in
    When The user clicks "Try here>>>" button on "Implementation of Queue in Python" page
    Then The user should be redirected to "Assessment" page having an tryEditor with a Run button to test
    
    @TC_Queue_04
    Scenario Outline: The user is able run code in tryEditor for Implementation of Queue in Python page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with Run result

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         38 |
    
   	 @TC_Queue_05
  	Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Implementation of Queue in Python page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with error message

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         39 |
      
    @TC_Queue_06
 	 	Scenario: The user is able to navigate to "Queue" Data Structure Page
    Given The user is on the "NumpyNinja" home page
    When The user select Queue from the dropdown menu
    Then The user be redirected to "Queue" Data Structure Page
    
    @TC_Queue_07
  	Scenario: The user is able to navigate to Implementation using collections.deque page
    Given The user is on the "Queue" page after logged in
    When The user clicks Implementation using collections.deque link
    Then The user should be redirected to "Implementation using collections.deque" page
    
    @TC_Queue_08
		Scenario: The user is able to navigate to a page having an tryEditor from Implementation using collections.deque page
    Given The user is on the "Implementation using collections.deque" page after logged in
    When The user clicks "Try here>>>" button on "Implementation using collections.deque" page
    Then The user should be redirected to "Assessment" page having an tryEditor with a Run button to test
    
    @TC_Queue_09
    Scenario Outline: The user is able run code in tryEditor for Implementation using collections.deque page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with Run result

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         40 |
    
   	 @TC_Queue_10
  	Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Implementation using collections.deque page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with error message

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         39 |
      
      
       @TC_Queue_11
 	 	Scenario: The user is able to navigate to "Queue" Data Structure Page
    Given The user is on the "NumpyNinja" home page
    When The user select Queue from the dropdown menu
    Then The user be redirected to "Queue" Data Structure Page
    
    @TC_Queue_12
  	Scenario: The user is able to navigate to Implementation using array page
    Given The user is on the "Queue" page after logged in
    When The user clicks Implementation using array link
    Then The user should be redirected to "Implementation using array" page
    
    @TC_Queue_13
		Scenario: The user is able to navigate to a page having an tryEditor from Implementation using array page
    Given The user is on the "Implementation using array" page after logged in
    When The user clicks "Try here>>>" button on "Implementation using array" page
    Then The user should be redirected to "Assessment" page having an tryEditor with a Run button to test
    
    @TC_Queue_14
    Scenario Outline: The user is able run code in tryEditor for Implementation using array page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with Run result

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         41 |
    
   	 @TC_Queue_15
  	Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Implementation using array page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with error message

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         39 |
    
    
       @TC_Queue_16
 	 	Scenario: The user is able to navigate to "Queue" Data Structure Page
    Given The user is on the "NumpyNinja" home page
    When The user select Queue from the dropdown menu
    Then The user be redirected to "Queue" Data Structure Page
    
    @TC_Queue_17
  	Scenario: The user is able to navigate to Queue Operations page
    Given The user is on the "Queue" page after logged in
    When The user clicks Queue Operations link
    Then The user should be redirected to "Queue Operations" page
    
    @TC_Queue_18
		Scenario: The user is able to navigate to a page having an tryEditor from Queue Operations page
    Given The user is on the "Queue Operations" page after logged in
    When The user clicks "Try here>>>" button on "Queue Operations" page
    Then The user should be redirected to "Assessment" page having an tryEditor with a Run button to test
    
    @TC_Queue_19
    Scenario Outline: The user is able run code in tryEditor for Queue Operations page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with Run result

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         42 |
    
   	 @TC_Queue_20
  	Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Queue Operations page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with error message

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         39 |
      
    