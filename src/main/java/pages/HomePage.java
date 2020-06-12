package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {

	@FindBy(name = "Subscribe")
	WebElement subscribebutton;

	public HomePage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);

	}

	public boolean SubButtonVisible() {

		if (subscribebutton.isDisplayed())
			return true;
		else
			return false;

	}

	public SubscribePage goToSubscribePage() {

		subscribebutton.click();
		return new SubscribePage();

	}

	public String ValidateTitle() {
		// TODO Auto-generated method stub
		return null;
	}

}
