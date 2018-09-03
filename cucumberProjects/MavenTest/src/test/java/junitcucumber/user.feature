Feature: User Certification
 
  Scenario: User is Passed
    Given that the user Vinod is given a task to clear Java certification exam
    When Vinod got 60 marks in examination
    Then Vinod is known as Java certified
    
  Scenario: User Login
    Given A "TestUser" want to login to an application
    When "TestUser" is entering "username" and "password" properly
    Then "TestUser" is redirected to "Home" page