package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTestUsingExample {

	@Given("^User is on login page2$")
	public void login() {
		System.out.println("1");
	}
	
	@When ("^User enters \"(.*)\" and \"(.*)\" in app2$")
public void enterCredentials(String user, String pwd) {
		System.out.println(user);
		System.out.println(pwd);
	}
    @And ("^CLick on Login/Enter2$")
public void doLogin() {
    	System.out.println("3");
	}
    
    @Then ("^User will be logged into application2$")
public void loggedInto() {
    	System.out.println("4");
	}
    
    @And ("^able to seelanding page2$")
public void checkHomePage() {
    	System.out.println("5");
	}

	
	
}
