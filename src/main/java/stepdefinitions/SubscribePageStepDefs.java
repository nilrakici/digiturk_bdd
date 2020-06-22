package stepdefinitions;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.TestBase;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CreateAccountPage;
import pages.SubscribePage;

public class SubscribePageStepDefs extends TestBase {

	SubscribePage subs;

	public SubscribePageStepDefs() {
		// TODO Auto-generated constructor stub
		super();
	}

	@Then("^user is directed to subscription page and displays package options$")
	public void user_Displays_Subscribe_Page() throws Throwable {
		subs = new SubscribePage();
		String title = subs.validateTitle();
		Assert.assertEquals("Subscription - beIN SPORTS CONNECT", title);

	}

	@When("^user chooses Monthly Plan with Two Week Free Trial and clicks Subscribe button$")
	public void user_Chooses_Monthly_Plan() throws Throwable {
		String detail = subs.validatePackageDetail();
		Assert.assertEquals(detail, "Monthly Plan with Two Week Free Trial");
		subs.clickMonthlyPlan();

	}

}
