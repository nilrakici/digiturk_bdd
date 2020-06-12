package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class CreateAccountPage extends TestBase {

	@FindBy(name = "FirstName")
	WebElement firstname;

	@FindBy(name = "LastName")
	WebElement lastname;

	@FindBy(name = "EmailOrPhone")
	WebElement email;

	@FindBy(name = "Password")
	WebElement password;

	@FindBy(id = "chkAllow")
	WebElement checkbox;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement createbutton;

	@FindBy(id = "form-register")
	WebElement form;

	public CreateAccountPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public boolean validatePage() {

		if (form.isDisplayed())
			return true;

		else
			return false;

	}

	public void FillRegisterForm(String name, String lname, String mail, String pwd) {

		firstname.sendKeys(name);
		lastname.sendKeys(lname);
		email.sendKeys(mail);
		password.sendKeys(pwd);
		ScrollDown();

	}

	public PaymentMethodPage CreateAccount() throws InterruptedException {

		isClickable(createbutton);
		createbutton.click();

		return new PaymentMethodPage();
	}
}
