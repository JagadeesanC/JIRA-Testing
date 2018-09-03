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


	
	
	
}
