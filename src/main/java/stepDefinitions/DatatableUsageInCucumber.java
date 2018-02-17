package stepDefinitions;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DatatableUsageInCucumber {
	
	@Given ("^This is Datatable Prequisite$")
	public void meth1() {
		System.out.println("meth1");
	}
    @When ("^User is entering data using Datatables$")
		public void meth2(DataTable data) {
				List<List<String>> list = data.raw();
				
				for(List<String> l: list) {
					System.out.println(l.get(0));
					System.out.println(l.get(1));
				}
				
				/*System.out.println(
						list.get(0).get(0)
						+" "
						+list.get(0).get(1)
						+" "
						+list.get(1).get(0)
						+" "
						+list.get(1).get(1)
						+" "
						+list.get(2).get(0)
						+" "
						+list.get(2).get(1)
						+" "
						+list.get(3).get(0)
						+" "
						+list.get(3).get(1)
						
						);*/
				
			}
    @Then ("^Datatable Usage will be understood$")
		public void meth3() {
				System.out.println("meth3");
			}
}
