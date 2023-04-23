//package stepDefinitions;
//
//import java.time.Duration;
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class DealStepDefinition {
//
//	WebDriver driver;
//	public String title;
//
//	@Given("^User is already on Login Page$")
//	public void user_already_on_login_page() {
//
//		System.setProperty("webdriver.gecko.driver", "/Users/loyoladsouza/Desktop/QA/SeleniumJars/geckodriver");
//		driver = new FirefoxDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.freecrm.com");
//		driver.findElement(By.xpath("//span[contains(text(), 'Log In')]")).click();
//	}
//
//	@When("^Title of login page is Free CRM$")
//	public void title_of_login_page() {
//		title = driver.getTitle();
//		Assert.assertEquals(title, "Cogmento CRM");
//	}
//
//	@Then("^User enters username and password$")
//	public void user_enters_username_password(DataTable credentials) {
//		List<List<String>> data = credentials.cells();
//		driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));
//		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
//	}
//
//	@Then("^User clicks on login button$")
//	public void user_clicks_login_button() {
//		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
////		WebDriverWait wait = new WebDriverWait(driver, 20);
////		wait.until(ExpectedConditions
////				.visibilityOf(driver.findElement(By.xpath("//a[contains(@href, 'contacts')]//parent::div"))));
//	}
//
//	@Then("^User is on home page$")
//	public void user_on_homepage() {
//		title = driver.getTitle();
//		Assert.assertEquals(title, "Cogmento CRM");
//	}
//
//	@Then("^User clicks on Deals button$")
//	public void user_click_on_deals() {
//
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Actions a = new Actions(driver);
//		a.moveToElement(driver.findElement(By.xpath("//a[@href='/deals']"))).click().build().perform();
//		driver.findElement(By.xpath("//a[@href='/deals/new']/button")).click();
//	}
//
//	@Then("^user enters deal details$")
//	public void user_enters_deal_details(DataTable deals) {
//		List<List<String>> data = deals.cells();
//		driver.findElement(By.name("title")).sendKeys(data.get(0).get(0));
//		driver.findElement(By.name("amount")).sendKeys(data.get(0).get(1));
//		driver.findElement(By.name("commission")).sendKeys(data.get(0).get(2));
//		driver.findElement(By.name("probability")).sendKeys(data.get(0).get(3));
//	}
//
//	@Then("^user clicks on Save button$")
//	public void user_clicks_on_save_button() {
//		driver.findElement(By.xpath("//button[contains(@class, 'ui linkedin button')]")).click();
//	}
//
//	@Then("^close browser$")
//	public void close_browser() {
//		driver.quit();
//	}
//
//}
