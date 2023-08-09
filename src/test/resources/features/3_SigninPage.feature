
@SignIn

Feature: User Validates the Signin page in DS Algo
  

 
 @TS_Signin_01
  Scenario: Verify the register link
    Given The user opens Signin page
    When The user clicks on Register link on signin page
    Then The user redirected to Registration page from signin page
    
    @TC_Signin_02
  Scenario: The user is able to navigate to Signin Page from Register Page
    Given The user is on Register page
    When The user clicks on Sign in link on Register Page
    Then The user is redirected to the Sign in page
    
    @TC_signin_03
  Scenario Outline: User on login page and login with the fields empty "<username>" and "<password>"
    Given The user is on Sign in page
    When The user enter invalid "<username>" and "<password>"
    Then click login button to verify

    Examples: 
      | username | password |
      |      		 |          |
      | user     |          |
      |          | passowrd |
    

  @TC_Signin_04
  Scenario Outline: User on login page and login with invalid and valid inputs from Excel "<Sheetname>" and <RowNumber>
    Given The user is on Sign in page
    When The user enter sheet "<Sheetname>" and <RowNumber>
    Then click login button

    Examples: 
      | Sheetname 		 | RowNumber |
      | Userdetails    |         0 |
      | Userdetails    |         1 |
      | Userdetails    |         2 |
      | Userdetails    |         3 |
     
     @TC_Signin_05
  Scenario: Verifying signout link
    Given The user is on signin page with valid username "Numpy@sdet117_14" and password "RT56YU@78"
    When The user click signout button
    Then The user redirected to homepage
 
  