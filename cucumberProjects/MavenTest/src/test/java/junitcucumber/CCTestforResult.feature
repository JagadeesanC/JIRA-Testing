Feature: 

	
	@TTM-8 @TTM-10
	Scenario: User Login
				    Given A "TestUser" want to login to an application
				    When "TestUser" is entering "username" and "password" properly
				    Then "TestUser" is redirected to "Home" page	

	
	@TTM-9 @TTM-10
	Scenario: TC Add two numbers
			       Given I have entered 50 into the calculator 
				   And I have also entered 70 into the calculator 
				   When I press add 
				   Then the result should be 120 on the screen		

	
	@TTM-7 @TTM-10
	Scenario: User is Passed
				    Given that the user Vinod is given a task to clear Java certification exam
				    When Vinod got 60 marks in examination
				    Then Vinod is known as Java certified	