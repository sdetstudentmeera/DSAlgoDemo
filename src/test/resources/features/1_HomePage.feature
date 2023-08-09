
@DSAlgo
Feature: User launch the dsalgo portal link and test the home page

  @TC_01
  Scenario: User launch home page of an dsalgo project
    Given The user opens DS Algo portal link
    When The user clicks the "Get Started" button
    Then The user should be redirected to the home page

  @TC_02
  Scenario Outline: User is on Home page and click getstarted link "<option>" on home page without sign in	
    Given The user is on home page
    When The user clicks on Get Started link on homepage "<option>" without login
    Then The user get warning message "You are not logged in"
    
    Examples: 
      | option         |
      | Datastructures |
      | Arrays         |
      | Linkedlist     |
      | Stack          |
      | Queue          |
      | Tree           |
      | Graph          |

 	@TC_03
  Scenario Outline: User is on Home page and click on dropdown without sign in 
    
    When The user clicks on dropdown "<option>" without login
    Then The user get warning message "You are not logged in"
        
    Examples: 
      | option     |
      | Arrays     |
      | Linkedlist |
      | Stack      |
      | Queue      |
      | Tree       |
      | Graph      |
    
  @TC_04
  Scenario: User is on Home page and click on sign in
    Given The user opens Home Page
    When The user clicks Sign in link
    Then The user should be redirected to Sign in page
    
  @TC_05
  Scenario:  User is on Home page and click on Register
    Given The user opens Home Page
    When The user clicks Register link
    Then The user should be redirected to Register form
    
    
    
  
   
   
  
  
  
  

   
