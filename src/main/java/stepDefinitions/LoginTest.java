package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	
	
	@Given("^User is on login page$")
	public void navigateToLoginPage() throws Throwable {
	    System.out.println("Land to login page");
	}

	@When("^User enters \"(.*)\" and \"(.*)\"$")
	// \"(.*)\"
	public void enterUsernamePassword(String user, String password) throws Throwable {
	    System.out.println("username is: " +user);
	    System.out.println("username is: " +password);
	}

	@And("^CLick on Login/Enter$")
	public void clickLogin() throws Throwable {
	    System.out.println("click Login");
	}

	@Then("^User will be logged into the application1$")
	public void successfulLogin() throws Throwable {
	   System.out.println("Successful login");
	}

	@And("^able to seelanding page$")
	public void navigateToLandingPage() throws Throwable {
	    System.out.println("come to landing page");
	}



}
