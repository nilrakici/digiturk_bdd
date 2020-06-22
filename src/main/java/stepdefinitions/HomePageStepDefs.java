package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

import base.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.testng.Assert;

import pages.HomePage;
import pages.SubscribePage;

public class HomePageStepDefs extends TestBase {

	HomePage homePage;
	SubscribePage subs;

	public HomePageStepDefs() {
		// TODO Auto-generated constructor stub
		super();
	}

	@Given("^user is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		initialization();
		homePage = new HomePage();
		Assert.assertEquals(homePage.ValidateTitle(), "Home - beIN SPORTS CONNECT");

	}

	@When("^user clicks Subscribe button$")
	public void user_Navigate_to_Subscribe_Page() throws Throwable {
		Assert.assertTrue(homePage.SubButtonVisible());
		subs = homePage.goToSubscribePage();

	}

}
