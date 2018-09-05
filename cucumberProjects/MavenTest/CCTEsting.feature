@NEX-33
Feature: 

	
	@NEX-32 @NEX-31	
		Scenario: TC Add two numbers V1 
		       Given I have entered 50 into the calculator 
		       And I have also entered 70 into the calculator 
		       When I press add 
		       Then the result should be 120 on the screen	

	#Login with invalid credentials
	@NEX-3 @NEX-5 @NEX-14
	Scenario: User Login
		    Given A "TestUser" want to login to an application
		    When "TestUser" is entering "username" and "password" properly
		    Then "TestUser" is redirected to "Home" page	

	#User is Passed
	@NEX-7 @NEX-5
	Scenario: User is Passed
		    Given that the user Vinod is given a task to clear Java certification exam
		    When Vinod got 60 marks in examination
		    Then Vinod is known as Java certified