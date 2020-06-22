package base;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.StreamSupport;

import org.apache.commons.logging.impl.Log4JLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {

	public static WebDriver driver;

	public TestBase() {

	}

	final static Logger logger = Logger.getAnonymousLogger();

	public static void initialization() {

		// initialization
		System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver");

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://connect-au.beinsports.com/en");

	}

	public static void isClickable(WebElement webe) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.elementToBeClickable(webe));

		} catch (Exception e) {
			logger.log(Level.SEVERE, "Element Not Interactable", e);

		}
	}

	public void waitforClick(WebElement element) {

		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();

	}

	public void waitForVisibilityOf(By locator) {
		int attempts = 0;
		while (attempts < 2) {
			try {
				waitFor(ExpectedConditions.visibilityOfElementLocated(locator), 20);
			} catch (NullPointerException e) {
				logger.log(Level.SEVERE, "program attempts to use an object reference that has the null value.", e);

			}

			attempts++;

		}
	}

	private void waitFor(ExpectedCondition<WebElement> condition, Integer timeoutInSeconds) {
		timeoutInSeconds = timeoutInSeconds != null ? timeoutInSeconds : 30;
		WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
		wait.until(condition);

	}

	public void MouseHover(WebElement element) {

		Actions action = new Actions(driver);

		try {
			action.moveToElement(element).build().perform();
		}

		catch (MoveTargetOutOfBoundsException e) {
			logger.log(Level.SEVERE,
					"the target provided to the actions move() method is invalid - outside of the size of the window.",
					e);
		}

	}

	public void ScrollUp() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-350)", "");
	}

	public void ScrollDown() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
	}

}
