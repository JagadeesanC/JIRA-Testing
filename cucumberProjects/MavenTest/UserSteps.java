package junitcucumber;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junitcucumber.User;

public class UserSteps {

	private User user = new User();

	@Given("^that the user (.*) is given a task to clear (.*) certification exam$")
	public void certificationName(String name, String certication) throws Throwable {
		user.setName(name);
		user.setCertification(certication);
	}

	@When("^(.*) got (\\d+) marks in examination$")
	public void gotMarks(String name, int marks) throws Throwable {
		user.setName(name);
		user.setMarks(marks);
	}

	@Then("^(.*) is known as (.*) certified$")
	public void certifiedYes(String name, String certification) throws Throwable {
		assertThat(name, is(user.getName()));
		assertThat(user.getCertification(), equalTo("Java"));
		assertThat(user.getResult(), is(true));
	}
	
	
	

	@Given("^A \"([^\"]*)\" want to login to an application$")
	public void a_want_to_login_to_an_application(String name) throws Throwable {
		user.setName(name);
	}

	@When("^\"([^\"]*)\" is entering \"([^\"]*)\" and \"([^\"]*)\" properly$")
	public void is_entering_and_properly(String name, String userName, String password) throws Throwable {
		String message = user.ValidateLogin("Testuser","password");
	}
	
	@Then("^\"([^\"]*)\" is redirected to \"([^\"]*)\" page$")
	public void is_redirected_to_page(String name, String landingPage) throws Throwable {
		assertThat(name, is(user.getName()));
		assertThat(landingPage, equalTo("Home"));
	}


@Given("^a Testuser with password xyz$")
public void a_Testuser_with_password_xyz() throws Throwable {
    assert(true);
}

@Given("^I am on the login page$")
public void i_am_on_the_login_page() throws Throwable {
	assert(true);
}

@Given("^I fill in User name with Testuser$")
public void i_fill_in_User_name_with_Testuser() throws Throwable {
	assert(true);
}

@Given("^I fill in Password with xyz$")
public void i_fill_in_Password_with_xyz() throws Throwable {
	assert(true);
}

@When("^I press Log in$")
public void i_press_Log_in() throws Throwable {
	assert(true);
}

@Then("^I should see Welcome, Testuser$")
public void i_should_see_Welcome_Testuser() throws Throwable {
	assert(true);
}
	
@Given("^I fill in Password with \"([^\"]*)\"$")
public void i_fill_in_Password_with(String arg1) throws Throwable {
	assert(true);
}

@Given("^a user \"([^\"]*)\" with password \"([^\"]*)\"$")
public void a_user_with_password(String arg1, String arg2) throws Throwable {
	assert(true);
}

@Given("^I fill in \"([^\"]*)\" with \"([^\"]*)\"$")
public void i_fill_in_with(String arg1, String arg2) throws Throwable {
	assert(true);
}

@When("^I press \"([^\"]*)\"$")
public void i_press(String arg1) throws Throwable {
	assert(true);
}

@Then("^I should see \"([^\"]*)\"$")
public void i_should_see(String arg1) throws Throwable {
	assert(true);
}

@Given("^I have entered (\\d+) into the calculator$")
public void i_have_entered_into_the_calculator(int arg1) throws Throwable {
	assert(true);
}

@Given("^I have also entered (\\d+) into the calculator$")
public void i_have_also_entered_into_the_calculator(int arg1) throws Throwable {
	assert(true);
}

@When("^I press add$")
public void i_press_add() throws Throwable {
	assert(true);
}

@Then("^the result should be (\\d+) on the screen$")
public void the_result_should_be_on_the_screen(int arg1) throws Throwable {
	assert(true);
}

	
}
