package stepdefinitions;

import org.testng.Assert;

import base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CreditCardPage;
import pages.PaymentMethodPage;

public class PaymentMethodPageStepDefs extends TestBase {

	PaymentMethodPage method;
	

	public PaymentMethodPageStepDefs() {
		// TODO Auto-generated constructor stub
		super();
	}

	@Then("^a new account is created and payment method screen is displayed$")
	public void user_Displays_Payment_Method() throws Throwable {
		method = new PaymentMethodPage();
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
	    method.GoMakePayment();

	}

}
