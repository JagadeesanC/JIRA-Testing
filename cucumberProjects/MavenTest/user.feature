Feature: User Certification
 
  Scenario: User is Passed
    Given that the user Vinod is given a task to clear Java certification exam
    When Vinod got 60 marks in examination
    Then Vinod is known as Java certified
    
  Scenario: User Login
    Given A "TestUser" want to login to an application
    When "TestUser" is entering "username" and "password" properly
    Then "TestUser" is redirected to "Home" page
    
	Scenario: TC Successful Login NextGen Internal Demo
		  Given a user "Aslak" with password "xyz"
		  And I am on the login page
		  And I fill in "User name" with "Aslak"
		  And I fill in "Password" with "xyz"
		  When I press "Log in"
		  Then I should see "Welcome, Aslak"   
		  
	Scenario: TC  Add two numbers V1
		       Given I have entered 50 into the calculator
		       And I have also entered 70 into the calculator
		       When I press add
		       Then the result should be 120 on the screen			   