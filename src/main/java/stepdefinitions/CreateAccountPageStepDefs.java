package stepdefinitions;

import org.testng.Assert;

import base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CreateAccountPage;
import pages.CreditCardPage;
import pages.HomePage;
import pages.PaymentMethodPage;
import pages.SubscribePage;

public class CreateAccountPageStepDefs extends TestBase {

	CreateAccountPage register;
	

	public CreateAccountPageStepDefs() {
		// TODO Auto-generated constructor stub
		super();
	}

	@Then("^user is directed to Create Account screen$")
	public void user_Displays_Register_Page() throws Throwable {
		register = new CreateAccountPage();
		Assert.assertTrue(register.validatePage());

	}

	@When("^user fills Create Account form with first name (.*) ,lastname (.*) ,password and a random email$")
	public void fill_Registration_Page(String firstn, String lastn) throws Throwable {
		register.FillRegisterForm(firstn, lastn, register.generateMail(), register.generatePassword());

	}

	@And("^clicks Create Account button$")
	public void Create_Account() throws Throwable {
		Assert.assertTrue(register.validateCreateButton());
		register.CreateAccount();

	}

}
