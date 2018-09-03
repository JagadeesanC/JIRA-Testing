Feature: 

	#Login with invalid credentials
	@NEX-3 @NEX-5
	Scenario: User Login
		    Given A "TestUser" want to login to an application
		    When "TestUser" is entering "username" and "password" properly
		    Then "TestUser" is redirected to "Home" page