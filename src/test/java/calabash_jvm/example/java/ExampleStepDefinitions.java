package calabash_jvm.example.java;

import static calabash_jvm.API.*;
import static calabash_jvm.example.java.QueryBuilder.view;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;


public class ExampleStepDefinitions {

	@Given("^I go to the table$")
	public void I_go_to_the_table()
	{
		touch(view("UITabBarButton").marked("Third"), null);
		
		waitForExists(view("UITableViewCell").with("text", "Cell '2"), null);
		
	}
	
	@Then("^I should see \"([^\"]*)\"$")
	public void I_should_see(String text) throws Throwable {
		
	   query(view("UIView").marked(text), null);
	   
	   screenshot(null);
	
	}
}
