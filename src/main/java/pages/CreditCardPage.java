package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;

public class CreditCardPage extends TestBase {

	@FindBy(id = "Ecom_Payment_Card_Name")
	WebElement cardname;

	@FindBy(id = "Ecom_Payment_Card_Number")
	WebElement cardno;

	@FindBy(id = "Ecom_Payment_Card_Verification")
	WebElement verno;

	@FindBy(id = "submit3")
	WebElement confirm;

	@FindBy(id = "Ecom_Payment_Card_ExpDate_Month")
	WebElement month;

	@FindBy(id = "Ecom_Payment_Card_ExpDate_Year")
	WebElement year;

	@FindBy(xpath = "//*[@id=\"ncol_ref\"]/tbody/tr[2]/td[2]/small")
	WebElement charge;

	@FindBy(xpath = "//td[@class='ncoltxtc']")
	WebElement error;

	public CreditCardPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public String ValidateCharge() {
		return charge.getText();

	}

	public String ErrorMessage() {

		waitForVisibilityOf(By.xpath("//td[@class='ncoltxtc']"));

		return error.getText();

	}

	public void fillCreditCard(String cnames, String cno, String vno) throws InterruptedException {

		Thread.sleep(4000);
		cardname.sendKeys(cnames);
		Thread.sleep(2000);
		cardno.sendKeys(cno);

		Select monthd = new Select(month);
		monthd.selectByIndex(4);
		Select yeard = new Select(year);
		yeard.selectByIndex(2);

		verno.sendKeys(vno);
		confirm.click();

	}

}
