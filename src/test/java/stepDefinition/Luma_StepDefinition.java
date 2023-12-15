package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Luma_StepDefinition {
	public WebDriver driver;

	@Given("I navigate to the Home Page")
	public void i_navigate_to_the_home_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
	}

	@Then("I navigate to the SignIn Page")
	public void i_navigate_to_the_sign_in_page() {
		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")).click();
	}

	@When("I enter the email address")
	public void i_enter_the_email_address() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("tharindamandakini@gmail.com");
	}

	@When("I enter the password")
	public void i_enter_the_password() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("str#2023HTM");
	}

	@When("I click the Login button")
	public void i_click_the_login_button() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
	}

	@Then("I navigate to the Cloths page")
	public void i_navigate_to_the_cloths_page() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[1]/a/span/span[2]")).click();
	}

	@Then("I selects short in size and color")
	public void i_selects_short_in_size_and_color() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[1]/div/div/div[3]/div[1]/div/div[2]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[1]/div/div/div[3]/div[2]/div/div[3]"))
				.click();
	}

	@Then("I clicks short Add to cart")
	public void i_clicks_short_add_to_cart() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[1]/div/div/div[4]/div/div[1]/form/button"))
				.click();
	}

	@Then("I selects tshirt in size and color")
	public void i_selects_tshirt_in_size_and_color() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[8]/div/div/div[2]/div[1]/div/div[3]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[8]/div/div/div[2]/div[2]/div/div[3]"))
				.click();
	}

	@Then("I clicks add to cart")
	public void i_clicks_add_to_cart() throws InterruptedException {
		Thread.sleep(6000);
		driver.findElement(
				By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[8]/div/div/div[3]/div/div[1]/form/button"))
				.click();
	}

	@Then("I clicks cart button")
	public void i_clicks_cart_button() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a")).click();
	}

	@Then("I clicks on Proceed to Checkout button")
	public void i_clicks_on_proceed_to_checkout_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/div/div/div/div[2]/div[3]/div/button"))
				.click();
	}

	@Then("I clicks Next button")
	public void i_clicks_next_button() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(
				By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button"))
				.click();
	}

	@Then("I clicks Place Order button")
	public void i_clicks_place_order_button() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath(
				"/html/body/div[3]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form/fieldset/div[1]/div/div/div[2]/div[2]/div[4]/div/button"))
				.click();
	}

	@Then("Verifies the order")
	public void verifies_the_order() throws InterruptedException {
		Thread.sleep(4000);
		if (driver.getPageSource().contains("Thank you for your purchase!")) {
			System.out.println("Purchased the Order!");
		} else {
			System.out.println("Order Failed!");
		}
	}

}
