package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

import base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import pages.CreateAccountPage;
import pages.CreditCardPage;
import pages.HomePage;
import pages.PaymentMethodPage;
import pages.SubscribePage;

public class SubscriptionDefs extends TestBase {

	HomePage homePage;
	SubscribePage subs;
	CreateAccountPage register;
	PaymentMethodPage method;
	CreditCardPage credit;

	public SubscriptionDefs() {
		// TODO Auto-generated constructor stub
		super();
	}

	@Given("^user is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		initialization();
		homePage = new HomePage();

	}

	@When("^user clicks Subscribe button$")
	public void user_Navigate_to_Subscribe_Page() throws Throwable {
		Assert.assertTrue(homePage.SubButtonVisible());
		subs = homePage.goToSubscribePage();

	}

	@Then("^user is directed to subscription page and displays package options$")
	public void user_Displays_Subscribe_Page() throws Throwable {
		String title = subs.validateTitle();
		Assert.assertEquals("Subscription - beIN SPORTS CONNECT", title);

	}

	@When("^user chooses Monthly Plan with Two Week Free Trial and clicks Subscribe button$")
	public void user_Chooses_Monthly_Plan() throws Throwable {
		String detail = subs.validatePackageDetail();
		Assert.assertEquals(detail, "Monthly Plan with Two Week Free Trial");
		register = subs.clickMonthlyPlan();

	}

	@Then("^user is directed to Create Account screen$")
	public void user_Displays_Register_Page() throws Throwable {
		Assert.assertTrue(register.validatePage());

	}

	@When("^user fills Create Account form with first name, last name, password and a random email$")
	public void fill_Registration_Page() throws Throwable {
		register.FillRegisterForm("Nil", "Rakici", "1qwhalil9nbd21rk2c0i@hotmail.com", "2121039nil");

	}

	@And("^clicks Create Account button$")
	public void Create_Account() throws Throwable {
		method = register.CreateAccount();

	}

	@Then("^a new account is created and payment method screen is displayed$")
	public void user_Displays_Payment_Method() throws Throwable {
		Assert.assertTrue(method.PayNowVisible());

	}

	@And("^user validates the package price$")
	public void Validate_Amount() throws Throwable {
		String tamount = method.validateAmount();
		Assert.assertEquals("Total Amount : AU$19.99", tamount);

	}

	@When("^user makes payment with credit card$")
	public void makes_Payment_Credit_Card() throws Throwable {
		Assert.assertEquals(method.validatePaymentMethod(), "Credit/Debit Card");
		credit = method.GoMakePayment();

	}

	@Then("^user expects for a total charge of 1.00 since this is a free trial package$")
	public void user_Validates_Free_Charge() throws Throwable {
		Assert.assertEquals(credit.ValidateCharge(), "1.00 AUD");
	}

	@When("^user provides a test card data detail and confirm payment$")
	public void Fills_Credit_Card() throws Throwable {
		credit.fillCreditCard();

	}

	@Then("^user displays a error text$")
	public void user_Displays_Error_Message() throws Throwable {
		Assert.assertEquals(credit.ErrorMessage(), "Card number incorrect or incompatible");
		driver.quit();

	}

}