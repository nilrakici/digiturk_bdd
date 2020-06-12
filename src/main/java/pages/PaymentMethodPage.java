package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class PaymentMethodPage extends TestBase {

	@FindBy(id = "lblTotalAmount")
	WebElement totalamount;

	@FindBy(name = "pay-now")
	WebElement paybutton;

	@FindBy(xpath = "//label[@for='checkTerms']")
	WebElement checkbox;

	@FindBy(id = "select2-drpPaymentMethod-container")
	WebElement pmethod;

	public PaymentMethodPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public String validateAmount() {

		return totalamount.getText();

	}

	public String validatePaymentMethod() {

		return pmethod.getText();
	}

	public CreditCardPage GoMakePayment() throws InterruptedException {

		checkbox.click();
		Thread.sleep(3000);
		paybutton.click();
		return new CreditCardPage();

	}

	public boolean PayNowVisible() {

		waitForVisibilityOf(By.name("pay-now"));

		if (paybutton.isDisplayed())
			return true;
		else
			return false;

	}

}
