
@Register
Feature: User Validates the register page in DS Algo
@TC_Register_01
  Scenario: User launch home page of an dsalgo project
    Given The user opens DS Algo portal link
    When The user clicks the "Get Started" button
    Then The user should be redirected to the home page
    
  @TC_Register_02
  Scenario: The user is presented with error message for empty fields below Username textbox
    Given The user opens Register Page
    When The user clicks "Register" button with all fields empty
    Then It should display an error "Please fill out this field." below Username textbox

  @TC_Register_03
  Scenario: The user is presented with error message for empty fields below Password textbox
    Given The user opens Register Page
    When  The user clicks "Register" button after entering username with other fields empty
			 | username        |
			 | Numpy@sdet117_1 |
    Then It should display an error "Please fill out this field." below Password textbox
    
  
 	@TC_Register_04
  Scenario: The user is presented with error message for empty fields below Password Confirmation textbox
   	Given The user opens Register Page
    When The user clicks "Register" button after entering "username" and "password" with Password Confirmation field empty
			 | 	 username      | password     |
			 | Numpy@sdet117_1 | testpassword |
    Then It should display an error "Please fill out this field." below Password Confirmation textbox
        
  
  @TC_Register_05
  Scenario: The user is presented with error message for invalid username
    Given The user opens Register Page
    When The user enters a "username" with characters other than Letters, digits and "@/./+/-/_"
				| username | password     | password confirmation |
				| &**&**&  | testpassword | testpassword          |
    Then It should display an error message "Please enter a valid username"
    
  @TC_Register_06
  Scenario:  The user is presented with error message for username already exists
    Given The user opens Register Page
    When The user enters a valid existing "username" with "password" and "password confirmation"
	      | username     		| password  | password confirmation |
	      | Numpy@sdet117_1 | RT56YUabc | RT56YUabc  							|
    Then It should display an error message "Username already exists"
    
    @TC_Register_07
  Scenario:  The user is presented with error message for password mismatch
    Given The user opens Register Page
    When The user clicks "Register" button after entering valid "username" and different passwords in "password" and "password confirmation" fields
	      | username     		| password     | password confirmation |
	      | Numpy@sdet117_1 | testpassword | testpassword1   | 
    Then It should display an error message "password_mismatch:The two password fields didn’t match."
    
    @TC_Register_08
  Scenario:  The user is presented with error message for password with characters less than 8
    Given The user opens Register Page
    When he user enters a valid "username" and "password" with characters less than 8
	      | username     		| password | password confirmation |
	      | Numpy@sdet117_1 | a1b2c3d  | a1b2c3d            |
    Then It should display an error message "Password should contain at least 8 characters"
    
    @TC_Register_09
  Scenario:  The user is presented with error message for password with only numbers
    Given The user opens Register Page
    When The user enters a valid "username" and "password" with only numbers
      | username     	 	| password | password confirmation |
      | Numpy@sdet117_1 | 12345678 |              12345678 |
    Then It should display an error message "Password can’t be entirely numeric."
    
     @TC_Register_10
  Scenario:  The user is presented with error message for password too similar to your other personal information
    Given The user opens Register Page
    When The user enters a valid "username" and "password" similar to username
      | username     		| password   	| password confirmation |
      | Numpy@sdet117_1 | testsdet117 | testsdet117         |
    Then It should display an error message "password can’t be too similar to your other personal information."
    
    
     @TC_Register_11
  Scenario:  The user is presented with error message for commonly used password
    Given The user opens Register Page
    When The user enters a valid "username" and commonly used password "password"
      | username     	| password 	 | password confirmation |
      | Numpy@sdet117_1 | Welcome1 | Welcome1          |
    Then It should display an error message "Password can’t be commonly used password"
    
    
     @TC_Register_12
  Scenario:  The user is succesfully able to register 
    Given The user opens Register Page
    When The user enters a valid "username" and "password" and "password confirmation"
      | username     | password  | password confirmation |
      | Numpy@sdet117_166| RT56YU@78 | RT56YU@78       |
    Then The user should be redirected to Homepage with the message "New Account Created. You are logged in as Numpy@sdet117_166"
   		
    
     @TC_Register_13
  Scenario Outline:  The user is able to signout from the registered page
    Given The user is in the Sign in page
    When The user clicks the "Sign Out" link
    Then The user should be redirected to the homepage with the message "Logged out successfully"
   
    #
     #@TC_Register_14
  #Scenario Outline:  The user is able to signin with registered credential
    #Given The user is in the Sign in page
    #When The user enters a valid "<username>" and "<password>"
    #Then click login button to verify
    #
    #Examples: 
      #| username   			| password  |
      #| Numpy@sdet117_15 | RT56YU@78 |
 
    
    
    