package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

	WebDriver driver;
	public String title;

	@Given("^User is already on Login Page$")
	public void user_already_on_login_page() {

		System.setProperty("webdriver.gecko.driver", "/Users/loyoladsouza/Desktop/QA/SeleniumJars/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com");
		driver.findElement(By.xpath("//span[contains(text(), 'Log In')]")).click();
	}

	@When("^Title of login page is Free CRM$")
	public void title_of_login_page() {
		title = driver.getTitle();
		Assert.assertEquals(title, "Cogmento CRM");
	}

	@Then("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_password(String username, String password) {
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("^User clicks on login button$")
	public void user_clicks_login_button() {
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//		wait.until(ExpectedConditions
//				.visibilityOf(driver.findElement(By.xpath("//a[contains(@href, 'contacts')]//parent::div"))));
	}

	@Then("^User is on home page$")
	public void user_on_homepage() {
		title = driver.getTitle();
		Assert.assertEquals(title, "Cogmento CRM");
	}

	@When("^User clicks on Add Contact button$")
	public void user_clicks_on_add_contact_button() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[contains(@href, 'contacts')]//parent::div"))).click().build()
				.perform();
		// driver.findElement(By.xpath("//a[contains(@href,
		// 'contacts')]//parent::div")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href = '/contacts/new']")).click();
	}

	@Then("^user move to new contact page$")
	public void user_is_on_contact_page() {
		String pageHeader = driver.findElement(By.xpath("//div[contains(@class, 'light-black')]//span")).getText();
		Assert.assertEquals(pageHeader, "Create New Contact");
	}

	@Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void user_enter_firstname_lastname_and_company_name(String fName, String lName, String cName) {
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(fName);
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(lName);
		driver.findElement(By.xpath("//input[@class='search'][1]")).sendKeys(cName);

	}

	@Then("^user clicks on Save button$")
	public void user_clicks_on_save_button() {
		driver.findElement(By.xpath("//button[contains(@class, 'linkedin')]")).click();
	}

	@Then("^close browser$")
	public void close_browser() {
		driver.quit();
	}
}
