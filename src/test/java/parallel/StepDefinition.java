package parallel;


import context.TestContextUI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	TestContextUI testContextUI;

	
	public StepDefinition(TestContextUI testContextUI){
		this.testContextUI=testContextUI;
		
	
		
	}
	
  
	
	
	
	@Given("I launch the zoho {string}")
	public void i_launch_the_zoho(String url) {
	    // Write code here that turns the phrase above into concrete actions
		testContextUI.getDriver().get("https://www.zoho.com/");
	  
	}

	@Given("I clicked on signin link on  homepage")
	public void i_clicked_on_signin_link_on_homepage() {
	    // Write code here that turns the phrase above into concrete actions
		
		testContextUI.getHomepage().ClickOnSigninlink();
		
	   
	}

	@When("I enter email as {string}")
	public void i_enter_email_as(String email) {
	    // Write code here that turns the phrase above into concrete actions
		
		testContextUI.getLoginpage().ennteremail(email);
	   
	  
	}

	

	@When("In enter password as {string}")
	public void in_enter_password_as(String pwd) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		testContextUI.getLoginpage().enterPassword(pwd);
	   
	}


	@Then("Landing page should be displayed.")
	public void landing_page_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("pass");
	   
	    
	}


}
