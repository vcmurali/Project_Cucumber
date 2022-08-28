package steps;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ColorCheckPage;
import pages.TestBase;

public class ColorCheckStepDefinition extends TestBase{
	
	ColorCheckPage colorCheckPage;
	
	@Before
	public void methodName() {
	initDriver();  // TestBase.java
	colorCheckPage = PageFactory.initElements(driver,ColorCheckPage.class);
	}

//-------------------------------------------------------------------//
// Set to Skyblue background color
	@Given("^Set SkyBlue Background button exists$")
	public void set_skyblue_background() {
		driver.get("http://techfios.com/test/101/");
	}

	@When("^I click on the button$")
	public void click_on_the_button() throws InterruptedException {	
		//Thread.sleep(3000);
		colorCheckPage.setSkyBlueBackground();
	}

	@Then("^The background color will change to sky blue$")
	public void background_color_will_change_to_skyblue() {	
		System.out.println("Setting up skyblue background! ");
	}
//--------------------------------------------------------------//	
// Set to White background
	@Given("^Set White Background button exists$")
	public void set_SkyWhite_background() {
		driver.get("http://techfios.com/test/101/");
		colorCheckPage.SkyBlueBackground.click();
		System.out.println("Setting up White background! ");
	}

	@When("^I click on button$")
	public void click_white_background_button() throws InterruptedException {
		//Thread.sleep(3000);
		colorCheckPage.setWhiteBackground();
	}
	
	@Then("^The background color will change to white$")
	public void background_color_will_change_to_white() {		
		
	}
	
	
//------------------------------------------------------------------//	
	
	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
	
}