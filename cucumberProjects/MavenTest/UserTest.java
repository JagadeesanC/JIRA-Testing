package junitcucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\junitcucumber\\CCTesting.feature", format={"json:target/Cucumber.json"})
public class UserTest {
}