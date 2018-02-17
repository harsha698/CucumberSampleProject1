package stepDefinitions;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableWithHashMap {
	
	@Given ("^This is HashMap Datatable Prequisite$")
	public void meth1() {
		System.out.println("***********");
	}
    @When ("^User is entering hashmap data using Datatables$")
		public void meth2(DataTable data) {
			List<Map<Integer, String>> mp = data.asMaps(Integer.class, String.class);
			
			for(Map<Integer, String> map: mp ) {
				System.out.println(map.get(1));
				System.out.println(map.get(2));
			}
			
			
			
			}
    @Then ("^HashMap Datatable Usage will be understood$")
		    
		public void meth3() {
			System.out.println("^^^^^^^^^^^^^^^^^^");	
			}
}
