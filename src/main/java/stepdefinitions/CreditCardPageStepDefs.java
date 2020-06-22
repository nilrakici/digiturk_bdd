package stepdefinitions;

import org.testng.Assert;

import base.TestBase;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CreditCardPage;

public class CreditCardPageStepDefs extends TestBase {

	CreditCardPage credit;

	public CreditCardPageStepDefs() {
		// TODO Auto-generated constructor stub
		super();
	}

	@Then("^user expects for a total charge of 1.00 since this is a free trial package$")
	public void user_Validates_Free_Charge() throws Throwable {
		credit = new CreditCardPage();
		Assert.assertEquals(credit.ValidateCharge(), "1.00 AUD");
	}

	@When("^user provides a test card data detail cardname (.*)  , card number (.*) , verification number (.*)  and confirm payment$")
	public void Fills_Credit_Card(String ccname, String ccno, String ccvno) throws Throwable {
		credit.fillCreditCard(ccname,ccno,ccvno);

	}

	@Then("^user displays a error text$")
	public void user_Displays_Error_Message() throws Throwable {
		Assert.assertEquals(credit.ErrorMessage(), "Card number incorrect or incompatible");
		driver.quit();

	}
}
