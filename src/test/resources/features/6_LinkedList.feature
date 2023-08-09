@LinkedList
Feature: User Validates the Linked List module in DS Algo 
  
  #@TC_LL_01
  #Scenario: The user redirected to homepage
#
    #Given The user is on Signin page of DS Algo portal
    #When The user enters valid username "Numpysdet117" and password "sdet117batch"
    #And The user clicks on login button
    #Then The user redirected to homepage

#@TC_LL_02
  #Scenario: User navigated to "linked list" page
#
    #Given The user is on the "NumpyNinja" page after logged in
    #When The user clicks the "Get Started" button under Linked List
    #Then The user should be redirected to "Linked List" page 
    
    
  @TC_LL_02
  Scenario: User navigated to "linked list" page

    Given The user is on home page
    When The user clicks the "Get Started" button under Linked List
    Then The user should be redirected to "Linked List" page 
    
    
    @TC_LL_03
    Scenario: User navigated to "Introduction" page

    Given The user is on the "Linked List" page after logged in
    When The user clicks Introduction link
    Then The user should be redirected to "Introduction" page
    
    @TC_LL_04
    Scenario:  User navigated to tryEditor page with Run button from Introduction page

    Given The user is on the "Introduction" page after logged in
    When The user clicks "Try Here" button on "Introduction" page 
    Then The user should be redirected to "Assessment" page
    
    
    @TC_LL_05
    Scenario Outline:  The user run the code in tryEditor with the valid input  

    Given The user is in a page having an tryEditor with a Run button to test
    When  The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And   The user clicks on run button
    Then  The user should be presented with Run result
    
    Examples: 
      | Sheetname        | RowNumber |
      |  PythonCode      |         2 |
      
      
    @TC_LL_06
    Scenario Outline: The user is presented with error message for code with the invalid syntax in tryEditor 
     
    Given The user is in a page having an tryEditor with a Run button to test
    When  The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And   The user clicks on run button
    Then  The user should be presented with error message
    
    Examples: 
      | Sheetname        | RowNumber |
      |  PythonCode      |         3 |
      
      
    @TC_LL_07
    Scenario: User navigated to Introduction page
    Given The user is on the try editor after validating the python code
    When The user clicks back to the previous page from try editor
    Then The user should be redirected to "Introduction" page
    
     @TC_LL_08
     Scenario:  User navigated to "Creating Linked LIst" page

    Given The user is on the Introduction page
    When The user clicks the Creating Linked List link
    Then The user should be redirected to "Creating Linked LIst" page


     @TC_LL_09
     Scenario:  User navigated to tryEditor page with Run button from Creating Linked List page

    Given The user is on the "Creating Linked LIst" page after logged in
    When The user clicks "Try Here" button on "Creating Linked LIst" page
    Then The user should be redirected to "Assessment" page
    
    
    @TC_LL_10
    Scenario Outline:  The user run the code in tryEditor with the valid input 

    Given The user is in a page having an tryEditor with a Run button to test
    When  The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And   The user clicks on run button
    Then  The user should be presented with Run result
    
    Examples: 
      | Sheetname        | RowNumber |
      | PythonCode       |         4 |
      
      
    @TC_LL_11
    Scenario Outline: The user is presented with error message for code with the invalid syntax in tryEditor 
     
    Given The user is in a page having an tryEditor with a Run button to test
    When  The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And   The user clicks on run button
    Then  The user should be presented with error message
    
    Examples: 
      | Sheetname        | RowNumber |
      |  PythonCode      |         3 |
      
      
     @TC_LL_12
    Scenario: User navigated to Creating Linked List page
    Given The user is on the try editor after validating the python code
    When The user clicks back to the previous page from try editor
    Then The user should be redirected to "Creating Linked LIst" page
      
     @TC_LL_13
     Scenario:  User navigated to "Types of linked List" page


    Given The user is in the "Creating Linked LIst" page
    When The user clicks the Types of Linked List link
    Then The user should be redirected to "Types of Linked List" page


     @TC_LL_14
     Scenario:  User navigated to tryEditor page with Run button from Types of Linked List page


    Given The user is in the "Types of Linked List" page 
    When The user clicks "Try Here" button on "Types of Linked List" page
    Then The user should be redirected to "Assessment" page


    @TC_LL_15
    Scenario Outline:  The user run the code in tryEditor with the valid input

    Given The user is in a page having an tryEditor with a Run button to test
    When  The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And   The user clicks on run button
    Then  The user should be presented with Run result
    
    Examples: 
      | Sheetname        | RowNumber |
      |  PythonCode      |         5 |
      
      
    @TC_LL_16
    Scenario Outline: The user is presented with error message for code with the invalid syntax in tryEditor 
     
    Given The user is in a page having an tryEditor with a Run button to test
    When  The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And   The user clicks on run button
    Then  The user should be presented with error message
    
    Examples: 
      | Sheetname        | RowNumber |
      | PythonCode       |         3 |
      
      
      
     @TC_LL_17
    Scenario: User navigated to Types of Linked List
    Given The user is on the try editor after validating the python code
    When The user clicks back to the previous page from try editor
    Then The user should be redirected to "Types of Linked List" page
      
      
      
      
     @TC_LL_18
     Scenario:  user navigated to "Implement linked list in python" page



    Given The user is in the "Types of Linked List" page 
    When The user clicks the Implement Linked List in Python link
    Then The user should be redirected to "Implement Linked List in Python" page


     @TC_LL_19
     Scenario:  User navigated to tryEditor page with Run button from Implement Linked List in Python


    Given The user is in the "Implement Linked List in Python" page
    When The user clicks "Try Here" button on "implement linked list in python" page
    Then The user should be redirected to "Assessment" page

      
    @TC_LL_20
    Scenario Outline:  The user run the code in tryEditor with the valid input

    Given The user is in a page having an tryEditor with a Run button to test
    When  The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And   The user clicks on run button
    Then  The user should be presented with Run result
    
    Examples: 
      | Sheetname        | RowNumber |
      |  PythonCode      |          6|
      
      
    @TC_LL_21
    Scenario Outline: The user is presented with error message for code with the invalid syntax in tryEditor 
     
    Given The user is in a page having an tryEditor with a Run button to test
    When  The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And   The user clicks on run button
    Then  The user should be presented with error message
    
    Examples: 
      | Sheetname        | RowNumber |
      |  PythonCode      |         3 |
      
     @TC_LL_22
    Scenario: User navigated to Implement Linked List in Python
    Given The user is on the try editor after validating the python code
    When The user clicks back to the previous page from try editor
    Then The user should be redirected to "Implement Linked List in Python" page
      
      
    @TC_LL_23
    Scenario:  user navigated to "Traversal" page

    Given The user is in the "Implement Linked List in Python" page
    When The user clicks the Traversal link
    Then The user should be redirected to "Traversal" page

    @TC_LL_24
    Scenario:  User navigated to tryEditor page with Run button from Traversal


    Given The user is in the "Traversal" page
    When The user clicks "Try Here" button on "Traversal" page
    Then The user should be redirected to "Assessment" page
      
       
    @TC_LL_25
    Scenario Outline:  The user run the code in tryEditor with the valid input

    Given The user is in a page having an tryEditor with a Run button to test
    When  The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And   The user clicks on run button
    Then  The user should be presented with Run result
    
    Examples: 
      | Sheetname        | RowNumber |
      |  PythonCode      |        7  |
      
      
    @TC_LL_26
    Scenario Outline: The user is presented with error message for code with the invalid syntax in tryEditor 
     
    Given The user is in a page having an tryEditor with a Run button to test
    When  The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And   The user clicks on run button
    Then  The user should be presented with error message
    
    Examples: 
      | Sheetname        | RowNumber |
      |  PythonCode      |        3  |
       
       
     @TC_LL_27
    Scenario: User navigated to Traversal
    Given The user is on the try editor after validating the python code
    When The user clicks back to the previous page from try editor
    Then The user should be redirected to "Traversal" page
       
       
    @TC_LL_28
    Scenario:  user navigated to "Insertion" page

    Given The user is in the "Traversal" page 
    When The user clicks the Insertion link
    Then The user should be redirected to "Insertion" page


    @TC_LL_29
    Scenario:  User navigated to tryEditor page with Run button from Insertion page


    Given The user is in the "Insertion" page
    When The user clicks "Try Here" button on "Insertion" page
    Then The user should be redirected to "Assessment" page
      
    
   @TC_LL_30
    Scenario Outline:  The user run the code in tryEditor with the valid input

    Given The user is in a page having an tryEditor with a Run button to test
    When  The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And   The user clicks on run button
    Then  The user should be presented with Run result
    
    Examples: 
      | Sheetname        | RowNumber |
      |  PythonCode      |        8  |
      
      
    @TC_LL_31
    Scenario Outline: The user is presented with error message for code with the invalid syntax in tryEditor 
     
    Given The user is in a page having an tryEditor with a Run button to test
    When  The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And   The user clicks on run button
    Then  The user should be presented with error message
    
    Examples: 
      | Sheetname        | RowNumber |
      |  PythonCode      |         3 |
    
    
    @TC_LL_32
    Scenario: User navigated to Insertion
    Given The user is on the try editor after validating the python code
    When The user clicks back to the previous page from try editor
    Then The user should be redirected to "Insertion" page
    
    
     @TC_LL_33
    Scenario:  user navigated to "Deletion" page

    Given The user is in the "Insertion" page 
    When The user clicks the Deletion link
    Then The user should be redirected to "Deletion" page


    @TC_LL_34
    Scenario:  User navigated to tryEditor page with Run button from Deletion page


    Given The user is in the "Deletion" page
    When The user clicks "Try Here" button on "Deletion" page
    Then The user should be redirected to "Assessment" page
      
    
   @TC_LL_35
    Scenario Outline:  The user run the code in tryEditor with the valid input

    Given The user is in a page having an tryEditor with a Run button to test
    When  The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And   The user clicks on run button
    Then  The user should be presented with Run result
    
    Examples: 
      | Sheetname        | RowNumber |
      |  PythonCode      |        9  |
      
      
    @TC_LL_36
    Scenario Outline: The user is presented with error message for code with the invalid syntax in tryEditor 
     
    Given The user is in a page having an tryEditor with a Run button to test
    When  The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And   The user clicks on run button
    Then  The user should be presented with error message
    
    Examples: 
      | Sheetname        | RowNumber |
      |  PythonCode      |        3  |
    
     

   
