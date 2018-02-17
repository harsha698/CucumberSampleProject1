package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogOut {
	

	@When("^User clicks on Logout$")
	public void clickLogout() throws Throwable {
	    System.out.println("clicked logout");
	}

	@Then("^User will be logged out$")
	public void successfulLogout() throws Throwable {
	   System.out.println("Successful logout");
	}



}
