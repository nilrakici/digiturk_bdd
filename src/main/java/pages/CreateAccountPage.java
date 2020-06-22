package pages;

import java.security.SecureRandom;
import java.util.UUID;

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

	private static final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
	private static final String CHAR_UPPER = CHAR_LOWER.toUpperCase();
	private static final String NUMBER = "0123456789";
	private static final int length = 10;

	private static final String DATA_FOR_RANDOM_STRING = CHAR_LOWER + CHAR_UPPER + NUMBER;
	private static SecureRandom random = new SecureRandom();

	public boolean validatePage() {

		if (form.isDisplayed())
			return true;

		else
			return false;

	}

	public boolean validateCreateButton() {

		if (createbutton.isDisplayed())
			return true;

		else
			return false;

	}

	public String generatePassword() {
		if (length < 1)
			throw new IllegalArgumentException();

		StringBuilder sb = new StringBuilder(length);
		for (int i = 0; i < length; i++) {

			int rndCharAt = random.nextInt(DATA_FOR_RANDOM_STRING.length());
			char rndChar = DATA_FOR_RANDOM_STRING.charAt(rndCharAt);

			sb.append(rndChar);

		}

		return sb.toString();

	}

	public String generateMail() {

		return generatePassword() + "@example.com";

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
