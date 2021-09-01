package parallel;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import context.TestContextUI;
import io.cucumber.java.en.When;

public class StepDefinition2 {
	
	TestContextUI testContextUI;

	

	public StepDefinition2(TestContextUI testContextUI){
		this.testContextUI=testContextUI;
		
		 		
	}
	
	@When("I click on Nex button")
	public void i_click_on_nex_button() {
	    // Write code here that turns the phrase above into concrete actions
		testContextUI.getLoginpage().clickOnNextButton();
	  
	}

}
