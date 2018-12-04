@NEX-47
Feature: 

	
	@NEX-50
	Scenario: User is Passed V2
		    Given that the user Vinod is given a task to clear Java certification exam
		    When Vinod got 60 marks in examination
		    Then Vinod is known as Java certified	

	
	@NEX-49
	Scenario: User Login V2
		    Given A "TestUser" want to login to an application
		    When "TestUser" is entering "username" and "password" properly
		    Then "TestUser" is redirected to "Home" page		

	
	@NEX-48
	Scenario: TC Add two numbers V2
		       Given I have entered 50 into the calculator 
		       And I have also entered 70 into the calculator 
		       When I press add 
		       Then the result should be 120 on the screen	
