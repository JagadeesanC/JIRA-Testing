package junitcucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\junitcucumber\\CCTestforResult.feature", format={"json:target/CCTestforResult.json"})
public class UserTest {
}
