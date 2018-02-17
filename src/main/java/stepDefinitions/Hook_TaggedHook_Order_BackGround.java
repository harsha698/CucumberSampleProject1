package stepDefinitions;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Hook_TaggedHook_Order_BackGround {

	//Global hooks
		//these hooks will run before all the scenarios irrespective of their tag names
	@Before(order=0) //this will run 1st
	public void checkUserName() {
		System.out.println("check the logged in username");
	}
	
	@Before(order=1)//will run 2nd
	public void checkTimeStamp() {
		System.out.println("check the timeStamp");
	}
	
	//Local Hooks
	//this will run only before those scenarios which are having tag name as @CreateDeal
	@Before("@CreateDeal")
	public void createDealPage() {
		System.out.println("navigated to create Deal Page");
	}
	
	@Given("^I launch browser$") 
	public void launchBrowser(){
	System.out.println("Browser is launched");
	}
@And("^cleared caches$") 
	public void clearCache(){
	System.out.println("Caches are cleared");
	}

@When("^I entered Credentials$") 
	public void enterCredentials(DataTable table){
		
		List<Map<String, String>> map = table.asMaps(String.class, String.class);
			System.out.println("entered username is: " +map.get(0).get("username"));
			System.out.println("entered password is: " +map.get(0).get("password"));
		
	}

@And("^Clicked login$") 
		public void clickedLogin(){
				System.out.println("Login is clicked");
				}
@Then("^Home Page gets displayed$")

		public void homePageDisplayed(){
				System.out.println("Home Page is displayed");
				}

@Given("^I am on Deals Page$")
		public void navigateToDealPage(){
		System.out.println("Navigated to deals page");
		}	
		
@When("^I fill in all details$") 
public void fillInAllDealDetails(){
		System.out.println("Filled in all deal details");
		}	

@And("^click Sve$")
public void clickedOnSave(){
		System.out.println("clicked on save to create details");
		}	


@Then("^A new deal gets Created$") 
public void dealCreated(){
		System.out.println("Deal Gets created");
		}	

	//Local Hooks
		//this will run only after those scenarios which are having tag name as @CreateDeal
	@After("@CreateDeal")
	public void recordDealName() {
		System.out.println("Record the name of the created Deal");
	}
	
	///////////search
	
	
	//Local Hooks
		//this will run only before those scenarios which are having tag name as @SearchDeal
	@Before("@SearchDeal")
	public void searchDealPage() {
		System.out.println("COme to search Deal Page");
	}
	
	
	@Given("^I am on search deals page$") 
	public void navigateToSearchDealsPage(){
	System.out.println("Navigate to search deals page");
	}

	@When("^I enter \"(.*)\"$") 
	public void enterDealName(String dealName){
	System.out.println("Searched deal name is: "+dealName);
	}

	@And("^click Search$") 
	public void clickedOnSearch(){
	System.out.println("CLicked on search button");
	}

	@Then("^I get deal details$") 
	public void displayDealDetails(){
	System.out.println("Deal Details are displayed");
	}
	
	//Local Hooks
		//this will run only after those scenarios which are having tag name as @SearchDeal
	@After("@SearchDeal")
	public void recordSearchedDeal() {
		System.out.println("Record the name of searched ");
	}
	
	//Global hooks
	//these hooks will run after all the scenarios irrespective of their tag names
	@After(order=0) //this scenario will run first
	public void clickLogout() {
		System.out.println("clicked logout");
	}
	
	@After(order=1)//this scenario will run 2nd
	public void quitDriver() {
		System.out.println("driver is closed");
	}
	
	
	
}
