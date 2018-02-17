package stepDefinitions;

import cucumber.api.java.en.Given;

public class TagTesting {
	
	  @Given("^Successful Login$") 
	  public void meth1() {
		 System.out.println("1"); 
	  }
		@Given("^UnSuccessful Login$") 
		public void meth2() {
			System.out.println("2");  
		  }
		
		@Given("^Add Product to a Bag$") 
		public void meth3() {
			System.out.println("3"); 
		  }
		@Given("^Add multiple Product to a Bag$") 
		public void meth4() {
			System.out.println("4");  
		  }
		@Given("^Remove a Product to a Bag$") 
		public void meth5() {
			System.out.println("5");  
		  }
		@Given("^Remove all Product from a Bag$") 
		public void meth6() {
			System.out.println("6"); 
		  }
		@Given("^Increase product quantity$")
		public void meth7() {
			System.out.println("7"); 
		  }
	@Given("^Decrease product quantity$") 
	public void meth8() {
		System.out.println("8"); 
	  }
	@Given("^Making Payment using \"(.*)\"$")
	public void meth9(String mode) {
		System.out.println(mode +" "); 
	  }
	@Given("^Payment Decline$")  
	public void meth10() {
		System.out.println("10"); 
	  }
}
