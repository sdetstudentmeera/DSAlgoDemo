@Array
Feature: User launch DSAlgo application and test Array page

#		Scenario: The user is logged in to DS Algo portal
    #Given The user is on Sign in page of DS Algo portal
    #When The user enter valid "Numpysdet117" and "sdet117batch"
    #And The user click on login button
    #Then The user redirected to homepage
    
		@TC_Array_01
  	Scenario: The user is able to navigate to Array page
    Given The user is on home page
    When The user clicks the "Get Started" button in Array Panel
    Then The user should be redirected to "Array" page
    
  	@TC_Array_02
  	Scenario: The user is able to navigate to Arrays in Python page
    Given The user is on the "Array" page after logged in
    When The user clicks Arrays in Python link
    Then The user should be redirected to "Arrays in Python" page
    
  	@TC_Array_03
		Scenario: The user is able to navigate to a page having an tryEditor from Arrays in Python page
    Given The user is on the "Arrays in Python" page after logged in
    When The user clicks "Try here>>>" button on "Arrays in Python" page
    Then The user should be redirected to "Assessment" page having an tryEditor with a Run button to test
    
    @TC_Array_04
    Scenario Outline: The user is able run code in tryEditor for Arrays in Python page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with Run result

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         27 |
    
   	@TC_Array_05
  	Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Arrays in Python page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with error message

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         28 |
      
    @TC_array_06
 	 	Scenario: The user is able to navigate to "Arrays" Data Structure Page
    Given The user is on the "NumpyNinja" home page
    When The user select "Arrays" from the dropdown menu
    Then The user be redirected to "Array" Data Structure Page
      
    @TC_Array_07
 	 	Scenario: The user is able to navigate to Arrays Using List page
    Given The user is on the "Array" page after logged in
    When The user clicks Arrays Using List link
    Then The user should be redirected to "Arrays Using List" page
    
    @TC_Array_08
  	Scenario: The user is able to navigate to a page having an tryEditor from Arrays Using List page
    Given The user is on the "Arrays Using List" page after logged in
    When The user clicks "Try here>>>" button on "Arrays Using List" page
    Then The user should be redirected to "Assessment" page having an tryEditor with a Run button to test
    
    @TC_Array_09
    Scenario Outline: The user is able run code in tryEditor for Arrays Using List page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with Run result

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         29 |
    
    @TC_Array_10
  	Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Arrays Using List page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with error message

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         28 |


		@TC_Array_11
  	Scenario: The user is able to navigate to "Arrays" Data Structure Page
    Given The user is on the "NumpyNinja" home page
    When The user select "Arrays" from the dropdown menu
    Then The user be redirected to "Array" Data Structure Page
      
    @TC_Array_12
  	Scenario: The user is able to navigate to Basic Operations in Lists page
    Given The user is on the "Array" page after logged in
    When The user clicks Basic Operations in Lists link
    Then The user should be redirected to "Basic Operations in Lists" page
    
    @TC_Array_13
  	Scenario: The user is able to navigate to a page having an tryEditor from Basic Operations in Lists page
    Given The user is on the "Basic Operations in Lists" page after logged in
    When The user clicks "Try here>>>" button on "Basic Operations in Lists" page
    Then The user should be redirected to "Assessment" page having an tryEditor with a Run button to test
    
    @TC_Array_14
    Scenario Outline: The user is able run code in tryEditor for Basic Operations in Lists page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with Run result

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         30 |
    
    @TC_Array_15
  	Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Basic Operations in Lists page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with error message

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         28 |
      
    @TC_Array_16
  	Scenario: The user is able to navigate to "Arrays" Data Structure Page
    Given The user is on the "NumpyNinja" home page
    When The user select "Arrays" from the dropdown menu
    Then The user be redirected to "Array" Data Structure Page
      
    @TC_Array_17
  	Scenario: The user is able to navigate to Applications of Array page
    Given The user is on the "Array" page after logged in
    When The user clicks Applications of Array link
    Then The user should be redirected to "Applications of Array" page
    
    @TC_Array_18
  	Scenario: The user is able to navigate to a page having an tryEditor from Applications of Array page
    Given The user is on the "Applications of Array" page after logged in
    When The user clicks "Try here>>>" button on "Applications of Array" page
    Then The user should be redirected to "Assessment" page having an tryEditor with a Run button to test
    
    @TC_Array_19
    Scenario Outline: The user is able run code in tryEditor for Applications of Array page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with Run result

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         31 |
    
    @TC_Array_20
  	Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Applications of Array page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with error message

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         28 |
      
    @TC_Array_21
  	Scenario: The user clicks back to navigate to Applications of Array page
    Given The user is on the tryEditor "Assessment" page
    When The user clicks back from tryEditor to the previous "Applications of Array" page
    Then The user should be redirected to "Applications of Array" page
    
    @TC_Array_22
  	Scenario: The user is able to navigate to Practice Questions page
    Given The user is on the "Applications of Array" page
    When The user clicks Practice Questions link
    Then The user should be redirected to "Practice Questions" page
    
    @TC_Array_23
  	Scenario: The user is able to navigate to Question page from Search the array link
    Given The user is on the "Practice Questions" page
    When The user clicks Search the array link
    Then The user should be redirected to question page contains an tryEditor with Run and Submit buttons

    @TC_Array_24
    Scenario Outline: The user is able run code in tryEditor for Search the array page
    Given The user is in Question page of "Search the array" having an tryEditor with Run and Submit buttons to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> for the Question
    And The user clicks on run button
    Then The user should be presented with the Run result

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         32 |
      
   
      
    
    @TC_Array_25
 	 	Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Search the array link
    Given The user is in Question page of "Search the array" having an tryEditor with Run and Submit buttons to test
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with error message

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |        33 |
      
    @TC_array_26
  	Scenario Outline: The user is able to submit code in tryEditor for Search the array link
    Given The user is in Question page of "Search the array" having an tryEditor with Run and Submit buttons to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> for the Question
    And The user clicks on Submit button
    Then The user should be presented with successful submission message

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         34 |
         
    @TC_Array_27
  	Scenario: The user clicks back to navigate to Practice Questions page
    Given The user is on the tryEditor "Assessment" page
    When The user clicks back from tryEditor to the previous "Practice Questions" page
    Then The user should be redirected to "Practice Questions" page
    
    @TC_Array_28
  	Scenario: The user is able to navigate to Question page from Max Consecutive Ones link
    Given The user is on the "Practice Questions" page
    When The user clicks Max Consecutive Ones link
    Then The user should be redirected to question page contains an tryEditor with Run and Submit buttons
    
    @TC_Array_29
    Scenario Outline: The user is able run code in tryEditor for Max Consecutive Ones page
    Given The user is in Question page of "Max Consecutive Ones" having an tryEditor with Run and Submit buttons to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> for the Question
    And The user clicks on run button
    Then The user should be presented with the Run result

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         35 |
      
   
    @TC_Array_30
  	Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Max Consecutive Ones link
    Given The user is in Question page of "Max Consecutive Ones" having an tryEditor with Run and Submit buttons to test
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with error message

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         33 |
   
    @TC_array_31
  	Scenario Outline: The user is able to submit code in tryEditor for Max Consecutive Ones link
    Given The user is in Question page of "Max Consecutive Ones" having an tryEditor with Run and Submit buttons to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> for the Question
    And The user clicks on Submit button
    Then The user should be presented with successful submission message

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         34 |  
      
    @TC_Array_32
  	Scenario: The user clicks back to navigate to Practice Questions page
    Given The user is on the tryEditor "Assessment" page
    When The user clicks back from tryEditor to the previous "Practice Questions" page
    Then The user should be redirected to "Practice Questions" page
    
     @TC_Array_33
  	Scenario: The user is able to navigate to Question page from Find Numbers with Even Number of Digits link
     Given The user is on the "Practice Questions" page
    When The user clicks Find Numbers with Even Number of Digits link
    Then The user should be redirected to question page contains an tryEditor with Run and Submit buttons
    
    @TC_Array_34
    Scenario Outline: The user is able run code in tryEditor for Find Numbers with Even Number of Digits page
    Given The user is in Question page of "Find Numbers with Even Number of Digits" having an tryEditor with Run and Submit buttons to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> for the Question
    And The user clicks on run button
    Then The user should be presented with the Run result

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         36 |
    
    @TC_Array_35
  	Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Find Numbers with Even Number of Digits link
    Given The user is in Question page of "Find Numbers with Even Number of Digits" having an tryEditor with Run and Submit buttons to test
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with error message

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         33 |
       
    @TC_array_36
  	Scenario Outline: The user is able to submit code in tryEditor for Find Numbers with Even Number of Digits link
    Given The user is in Question page of "Find Numbers with Even Number of Digits" having an tryEditor with Run and Submit buttons to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> for the Question
    And The user clicks on Submit button
    Then The user should be presented with successful submission message

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         34 |
      
        
    @TC_Array_37
  	Scenario: The user clicks back to navigate to Practice Questions page
    Given The user is on the tryEditor "Assessment" page
    When The user clicks back from tryEditor to the previous "Practice Questions" page
    Then The user should be redirected to "Practice Questions" page
    
     @TC_Array_38
  	Scenario: The user is able to navigate to Question page from Squares of a Sorted Array link
     Given The user is on the "Practice Questions" page
    When The user clicks Squares of a Sorted Array link
    Then The user should be redirected to question page contains an tryEditor with Run and Submit buttons
    
    @TC_Array_39
    Scenario Outline: The user is able run code in tryEditor for Squares of a Sorted Array page
    Given The user is in Question page of "Squares of a Sorted Array" having an tryEditor with Run and Submit buttons to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> for the Question
    And The user clicks on run button
    Then The user should be presented with the Run result

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         37 |
  
    @TC_Array_40
  	Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Squares of a Sorted Array link
    Given The user is in Question page of "Squares of a Sorted Array" having an tryEditor with Run and Submit buttons to test
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with error message

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         33 |
      
          
    @TC_array_41
  	Scenario Outline: The user is able to submit code in tryEditor for Squares of a Sorted Array link
    Given The user is in Question page of "Squares of a Sorted Array" having an tryEditor with Run and Submit buttons to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> for the Question
    And The user clicks on Submit button
    Then The user should be presented with successful submission message

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         34 |
      
    
      
