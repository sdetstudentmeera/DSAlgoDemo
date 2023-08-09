@Tree
Feature: User Validates the Tree module in DS Algo 
  

 #
  #@TC_Tree_01
  #Scenario: The user redirected to homepage
#
    #Given The user is on Signin page of DS Algo portal
    #When The user enters valid username "Numpysdet117" and password "sdet117batch"
    #And The user clicks on login button
    #Then The user redirected to homepage

  #@TC_Tree_02
  #Scenario: User navigated to Tree page
#
    #Given The user is on the "NumpyNinja" after logged in
    #When The user select Tree item from the drop down menu
    #Then The user should be redirected to the "Tree" page 
    
    @TC_Tree_02
  Scenario: User navigated to Tree page

    Given The user is on home page
    When The user select Tree item from the drop down menu
    Then The user should be redirected to "Tree" page 
    
  @TC_Tree_03
  Scenario: The user is able to navigate to "Overview of Trees" page


    Given The user is on the "Tree" page after logged in
    When The user clicks on the Overview of Trees link
    Then The user should then be directed to Overview of Trees Page
    
    
  @TC_Tree_04
  Scenario: The user is able to navigate to a page having an tryEditor


    Given The user is on the "Overview of Trees" page after logged in
    When The user clicks "Try Here" button on "Overview of Trees" page
    Then The user should be redirected to "Assessment" page


   @TC_Tree_05
    Scenario Outline:  The user run the code in tryEditor with the valid input  

    Given The user is in a page having an tryEditor with a Run button to test
    When  The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And   The user clicks on run button
    Then  The user should be presented with Run result
    
    Examples: 
      | Sheetname        | RowNumber |
      |  PythonCode      |        10 |
      
      
   @TC_Tree_06
    Scenario Outline: The user is presented with error message for code with the invalid syntax in tryEditor 
     
    Given The user is in a page having an tryEditor with a Run button to test
    When  The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And   The user clicks on run button
    Then  The user should be presented with error message
    
    Examples: 
      | Sheetname        | RowNumber |
      |  PythonCode      |        11 |
      
      
    @TC_Tree_07
    Scenario: User navigated to Introduction page
    
    Given The user is on the try editor after validating the python code
    When The user clicks back to the previous page from try editor
    Then The user should be redirected to "Overview of Trees" page
    
    
    @TC_Tree_08
     Scenario:  User navigated to Terminologies page

    Given The user is on the Overview of Trees page
    When The user clicks the Terminologies link
    Then The user should be redirected to "Terminologies" page
    
    
    @TC_Tree_09
  Scenario: The user is able to navigate to a page having an tryEditor


    Given The user is on the "Terminologies" page after logged in
    When The user clicks "Try Here" button on "Terminologies" page
    Then The user should be redirected to "Assessment" page


   @TC_Tree_10
    Scenario Outline:  The user run the code in tryEditor with the valid input  

    Given The user is in a page having an tryEditor with a Run button to test
    When  The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And   The user clicks on run button
    Then  The user should be presented with Run result
    
    Examples: 
      | Sheetname        | RowNumber |
      |  PythonCode      |        12 |
      
      
   @TC_Tree_11
    Scenario Outline: The user is presented with error message for code with the invalid syntax in tryEditor 
     
    Given The user is in a page having an tryEditor with a Run button to test
    When  The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And   The user clicks on run button
    Then  The user should be presented with error message
    
    Examples: 
      | Sheetname        | RowNumber |
      |  PythonCode      |        11 |
      
      
    @TC_Tree_12
    Scenario: User navigated to Terminologies page
    
    Given The user is on the try editor after validating the python code
    When The user clicks back to the previous page from try editor
    Then The user should be redirected to "Terminologies" page
    
    
    @TC_Tree_13
     Scenario:  User navigated to Types of Trees page

    Given The user is on the Terminologies page
    When The user clicks the Types of Trees link
    Then The user should be redirected to "Types of Trees" page
    
     @TC_Tree_14
  Scenario: The user is able to navigate to a page having an tryEditor


    Given The user is on the "Types of Trees" page after logged in
    When The user clicks "Try Here" button on "Types of Trees" page
    Then The user should be redirected to "Assessment" page


   @TC_Tree_15
    Scenario Outline:  The user run the code in tryEditor with the valid input  

    Given The user is in a page having an tryEditor with a Run button to test
    When  The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And   The user clicks on run button
    Then  The user should be presented with Run result
    
    Examples: 
      | Sheetname        | RowNumber |
      |  PythonCode      |        13 |
      
      
   @TC_Tree_16
    Scenario Outline: The user is presented with error message for code with the invalid syntax in tryEditor 
     
    Given The user is in a page having an tryEditor with a Run button to test
    When  The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And   The user clicks on run button
    Then  The user should be presented with error message
    
    Examples: 
      | Sheetname        | RowNumber |
      |  PythonCode      |        11 |
      
      
    @TC_Tree_17
    Scenario: User navigated to Types of Trees page
    
    Given The user is on the try editor after validating the python code
    When The user clicks back to the previous page from try editor
    Then The user should be redirected to "Types of Trees" page
    
      
     @TC_Tree_18
     Scenario:  User navigated to Tree Traversals page

    Given The user is on the Types of Trees page
    When The user clicks the Tree Traversals
    Then The user should be redirected to "Tree Traversals" page
    
    @TC_Tree_19
  Scenario: The user is able to navigate to a page having an tryEditor


    Given The user is on the "Tree Traversals" page after logged in
    When The user clicks "Try Here" button on "Tree Traversals" page
    Then The user should be redirected to "Assessment" page


   @TC_Tree_20
    Scenario Outline:  The user run the code in tryEditor with the valid input  

    Given The user is in a page having an tryEditor with a Run button to test
    When  The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And   The user clicks on run button
    Then  The user should be presented with Run result
    
    Examples: 
      | Sheetname        | RowNumber |
      |  PythonCode      |        14 |
      
      
   @TC_Tree_21
    Scenario Outline: The user is presented with error message for code with the invalid syntax in tryEditor 
     
    Given The user is in a page having an tryEditor with a Run button to test
    When  The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And   The user clicks on run button
    Then  The user should be presented with error message
    
    Examples: 
      | Sheetname        | RowNumber |
      |  PythonCode      |        11 |
      
      
     @TC_Tree_22
    Scenario: User navigated to Tree Traversals page
    
    Given The user is on the try editor after validating the python code
    When The user clicks back to the previous page from try editor
    Then The user should be redirected to "Tree Traversals" page
    
    
    @TC_Tree_23
     Scenario:  User navigated to Traversals-Illustration page

    Given The user is on the Tree Traversals page
    When The user clicks the Traversals-Illustration
    Then The user should be redirected to "Traversals-Illustration" page
    
    @TC_Tree_24
  Scenario: The user is able to navigate to a page having an tryEditor


    Given The user is on the "Traversals-Illustration" page after logged in
    When The user clicks "Try Here" button on "Traversals-Illustration" page
    Then The user should be redirected to "Assessment" page


   @TC_Tree_25
    Scenario Outline:  The user run the code in tryEditor with the valid input  

    Given The user is in a page having an tryEditor with a Run button to test
    When  The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And   The user clicks on run button
    Then  The user should be presented with Run result
    
    Examples: 
      | Sheetname        | RowNumber |
      |  PythonCode      |        15 |
      
      
   @TC_Tree_26
    Scenario Outline: The user is presented with error message for code with the invalid syntax in tryEditor 
     
    Given The user is in a page having an tryEditor with a Run button to test
    When  The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And   The user clicks on run button
    Then  The user should be presented with error message
    
    Examples: 
      | Sheetname        | RowNumber |
      |  PythonCode      |        11 |
      
    @TC_Tree_27
    Scenario: User navigated to Traversals-Illustration page
    
    Given The user is on the try editor after validating the python code
    When The user clicks back to the previous page from try editor
    Then The user should be redirected to "Traversals-Illustration" page
      
    @TC_Tree_28
     Scenario:  User navigated to Binary Trees page

    Given The user is on the Traversals-Illustration page
    When The user clicks the Binary Trees link
    Then The user should be redirected to "Binary Trees" page
    
    @TC_Tree_29
  Scenario: The user is able to navigate to a page having an tryEditor


    Given The user is on the "Binary Trees" page after logged in
    When The user clicks "Try Here" button on "Binary Trees" page
    Then The user should be redirected to "Assessment" page


   @TC_Tree_30
    Scenario Outline:  The user run the code in tryEditor with the valid input  

    Given The user is in a page having an tryEditor with a Run button to test
    When  The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And   The user clicks on run button
    Then  The user should be presented with Run result
    
    Examples: 
      | Sheetname        | RowNumber |
      |  PythonCode      |        16 |
      
      
   @TC_Tree_31
    Scenario Outline: The user is presented with error message for code with the invalid syntax in tryEditor 
     
    Given The user is in a page having an tryEditor with a Run button to test
    When  The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And   The user clicks on run button
    Then  The user should be presented with error message
    
    Examples: 
      | Sheetname        | RowNumber |
      |  PythonCode      |        11 |
      
      @TC_Tree_32
    Scenario: User navigated to Binary Trees page
    
    Given The user is on the try editor after validating the python code
    When The user clicks back to the previous page from try editor
    Then The user should be redirected to "Binary Trees" page
      
    @TC_Tree_33
     Scenario:  User navigated to Types of Binary Trees page

    Given The user is on the Binary Trees page
    When The user clicks the Types of Binary Trees link
    Then The user should be redirected to "Types of Binary Trees" page
    
    @TC_Tree_34
  Scenario: The user is able to navigate to a page having an tryEditor


    Given The user is on the "Types of Binary Trees" page after logged in
    When The user clicks "Try Here" button on "Types of Binary Trees" page
    Then The user should be redirected to "Assessment" page


   @TC_Tree_35
    Scenario Outline:  The user run the code in tryEditor with the valid input  

    Given The user is in a page having an tryEditor with a Run button to test
    When  The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And   The user clicks on run button
    Then  The user should be presented with Run result
    
    Examples: 
      | Sheetname        | RowNumber |
      |  PythonCode      |        17 |
      
      
   @TC_Tree_36
    Scenario Outline: The user is presented with error message for code with the invalid syntax in tryEditor 
     
    Given The user is in a page having an tryEditor with a Run button to test
    When  The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And   The user clicks on run button
    Then  The user should be presented with error message
    
    Examples: 
      | Sheetname        | RowNumber |
      |  PythonCode      |        11 |
      
      
    @TC_Tree_37
    Scenario: User navigated to Types of Binary Trees page
    
    Given The user is on the try editor after validating the python code
    When The user clicks back to the previous page from try editor
    Then The user should be redirected to "Types of Binary Trees" page
      
    @TC_Tree_38
     Scenario:  User navigated to Implementation in Python page

    Given The user is on the Types of Binary Trees page
    When The user clicks the Implementation in Python link
    Then The user should be redirected to "Implementation in Python" page
    
    @TC_Tree_39
  Scenario: The user is able to navigate to a page having an tryEditor


    Given The user is on the "Implementation in Python" page after logged in
    When The user clicks "Try Here" button on "Implementation in Python" page
    Then The user should be redirected to "Assessment" page


   @TC_Tree_40
    Scenario Outline:  The user run the code in tryEditor with the valid input  

    Given The user is in a page having an tryEditor with a Run button to test
    When  The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And   The user clicks on run button
    Then  The user should be presented with Run result
    
    Examples: 
      | Sheetname        | RowNumber |
      |  PythonCode      |        18 |
      
      
   @TC_Tree_41
    Scenario Outline: The user is presented with error message for code with the invalid syntax in tryEditor 
     
    Given The user is in a page having an tryEditor with a Run button to test
    When  The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And   The user clicks on run button
    Then  The user should be presented with error message
    
    Examples: 
      | Sheetname        | RowNumber |
      |  PythonCode      |        11 |
      
    
    @TC_Tree_42
    Scenario: User navigated to Implementation in Python page
    
    Given The user is on the try editor after validating the python code
    When The user clicks back to the previous page from try editor
    Then The user should be redirected to "Implementation in Python" page
      
    @TC_Tree_43
     Scenario:  User navigated to Implementation in Python page

    Given The user is on the Implementation in Python page
    When The user clicks the Binary Tree Traversals link
    Then The user should be redirected to "Binary Tree Traversals" page
    
      
    
    @TC_Tree_44
  Scenario: The user is able to navigate to a page having an tryEditor


    Given The user is on the "Binary Tree Traversals" page after logged in
    When The user clicks "Try Here" button on "Binary Tree Traversals" page
    Then The user should be redirected to "Assessment" page


   @TC_Tree_45
    Scenario Outline:  The user run the code in tryEditor with the valid input  

    Given The user is in a page having an tryEditor with a Run button to test
    When  The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And   The user clicks on run button
    Then  The user should be presented with Run result
    
    Examples: 
      | Sheetname        | RowNumber |
      |  PythonCode      |        19 |
      
      
   @TC_Tree_46
    Scenario Outline: The user is presented with error message for code with the invalid syntax in tryEditor 
     
    Given The user is in a page having an tryEditor with a Run button to test
    When  The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And   The user clicks on run button
    Then  The user should be presented with error message
    
    Examples: 
      | Sheetname        | RowNumber |
      |  PythonCode      |        11 |
      
     @TC_Tree_47
    Scenario: User navigated to Binary Tree Traversals page
    
    Given The user is on the try editor after validating the python code
    When The user clicks back to the previous page from try editor
    Then The user should be redirected to "Binary Tree Traversals" page
      
    @TC_Tree_48
     Scenario:  User navigated to Implementation of Binary Trees page

    Given The user is on the Binary Tree Traversals page
    When The user clicks the Implementation of Binary Trees link
    Then The user should be redirected to "Implementation of Binary Trees" page
    
      
    @TC_Tree_49
  Scenario: The user is able to navigate to a page having an tryEditor


    Given The user is on the "Implementation of Binary Trees" page after logged in
    When The user clicks "Try Here" button on "Implementation of Binary Trees" page
    Then The user should be redirected to "Assessment" page


   @TC_Tree_50
    Scenario Outline:  The user run the code in tryEditor with the valid input  

    Given The user is in a page having an tryEditor with a Run button to test
    When  The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And   The user clicks on run button
    Then  The user should be presented with Run result
    
    Examples: 
      | Sheetname        | RowNumber |
      |  PythonCode      |        20 |
      
      
   @TC_Tree_51
    Scenario Outline: The user is presented with error message for code with the invalid syntax in tryEditor 
     
    Given The user is in a page having an tryEditor with a Run button to test
    When  The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And   The user clicks on run button
    Then  The user should be presented with error message
    
    Examples: 
      | Sheetname        | RowNumber |
      |  PythonCode      |        11 |
      
      
     @TC_Tree_52
    Scenario: User navigated to Implementation of Binary Trees page
    
    Given The user is on the try editor after validating the python code
    When The user clicks back to the previous page from try editor
    Then The user should be redirected to "Implementation of Binary Trees" page
      
    @TC_Tree_53
     Scenario:  User navigated to Applications of Binary trees page

    Given The user is on the Implementation of Binary Trees page
    When The user clicks the Applications of Binary trees link
    Then The user should be redirected to "Applications of Binary trees" page
    
    
    @TC_Tree_54
  Scenario: The user is able to navigate to a page having an tryEditor


    Given The user is on the "Applications of Binary trees" page after logged in
    When The user clicks "Try Here" button on "Applications of Binary trees" page
    Then The user should be redirected to "Assessment" page


   @TC_Tree_55
    Scenario Outline:  The user run the code in tryEditor with the valid input  

    Given The user is in a page having an tryEditor with a Run button to test
    When  The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And   The user clicks on run button
    Then  The user should be presented with Run result
    
    Examples: 
      | Sheetname        | RowNumber |
      |  PythonCode      |        21 |
      
      
   @TC_Tree_56
    Scenario Outline: The user is presented with error message for code with the invalid syntax in tryEditor 
     
    Given The user is in a page having an tryEditor with a Run button to test
    When  The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And   The user clicks on run button
    Then  The user should be presented with error message
    
    Examples: 
      | Sheetname        | RowNumber |
      |  PythonCode      |        11 |
      
    
    @TC_Tree_57
    Scenario: User navigated to Applications of Binary trees page
    
    Given The user is on the try editor after validating the python code
    When The user clicks back to the previous page from try editor
    Then The user should be redirected to "Applications of Binary trees" page
      
    @TC_Tree_58
     Scenario:  User navigated to Binary Search Trees page

    Given The user is on the Applications of Binary trees page
    When The user clicks the Binary Search Trees link
    Then The user should be redirected to "Binary Search Trees" page
    
    
    @TC_Tree_59
  Scenario: The user is able to navigate to a page having an tryEditor


    Given The user is on the "Binary Search Trees" page after logged in
    When The user clicks "Try Here" button on "Binary Search Trees" page
    Then The user should be redirected to "Assessment" page


   @TC_Tree_60
    Scenario Outline:  The user run the code in tryEditor with the valid input  

    Given The user is in a page having an tryEditor with a Run button to test
    When  The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And   The user clicks on run button
    Then  The user should be presented with Run result
    
    Examples: 
      | Sheetname        | RowNumber |
      |  PythonCode      |        22 |
      
      
   @TC_Tree_61
    Scenario Outline: The user is presented with error message for code with the invalid syntax in tryEditor 
     
    Given The user is in a page having an tryEditor with a Run button to test
    When  The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And   The user clicks on run button
    Then  The user should be presented with error message
    
    Examples: 
      | Sheetname        | RowNumber |
      |  PythonCode      |        11 |
   
   @TC_Tree_62
    Scenario: User navigated to Binary Search Trees page
    
    Given The user is on the try editor after validating the python code
    When The user clicks back to the previous page from try editor
    Then The user should be redirected to "Binary Search Trees" page
      
    @TC_Tree_63
     Scenario:  User navigated to Binary Search Trees page

    Given The user is on the Binary Search Trees page
    When The user clicks the Implementation Of BST link
    Then The user should be redirected to "Implementation Of BST" page
     
    
    @TC_Tree_64
  Scenario: The user is able to navigate to a page having an tryEditor


    Given The user is on the "Implementation Of BST" page after logged in
    When The user clicks "Try Here" button on "Implementation Of BST" page
    Then The user should be redirected to "Assessment" page


   @TC_Tree_65
    Scenario Outline:  The user run the code in tryEditor with the valid input  

    Given The user is in a page having an tryEditor with a Run button to test
    When  The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And   The user clicks on run button
    Then  The user should be presented with Run result
    
    Examples: 
      | Sheetname        | RowNumber |
      |  PythonCode      |        23 |
      
      
   @TC_Tree_66
    Scenario Outline: The user is presented with error message for code with the invalid syntax in tryEditor 
     
    Given The user is in a page having an tryEditor with a Run button to test
    When  The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And   The user clicks on run button
    Then  The user should be presented with error message
    
    Examples: 
      | Sheetname        | RowNumber |
      |  PythonCode      |        11 |
      
     @TC_Tree_67
    Scenario: User navigated to Implementation Of BST page
    
    Given The user is on the try editor after validating the python code
    When The user clicks back to the previous page from try editor
    Then The user should be redirected to "Implementation Of BST" page
    
    @TC_Tree_68
     Scenario:  User navigated to Practice Questions page

    Given The user is on the Implementation Of BST page
    When The user clicks the Practice Questions link
    Then The user should be redirected to "Practice Questions" page
   