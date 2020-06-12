package pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class SubscribePage extends TestBase {

	@FindBy(xpath = "//a[@class='btn-type-2 mt-20-plus bc-subscribe border-none add-card']")
	List<WebElement> sbuttons;

	@FindBy(xpath = "//span[@class='name detail fz-16 mb-10-plus']")
	WebElement detailcheck;

	public SubscribePage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public String validateTitle() {
		return driver.getTitle();

	}

	public String validatePackageDetail() {

		String detail=detailcheck.getText();

		return detail;
	}

	public CreateAccountPage clickMonthlyPlan() {

		sbuttons.get(0).click();

		return new CreateAccountPage();

	}

	public CreateAccountPage clickYearlyPlan() {

		sbuttons.get(1).click();

		return new CreateAccountPage();

	}

}
