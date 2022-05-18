package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class successfulLogin {
	WebDriver driver;
	@Given("an application")
	public void an_application() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
	}
	@When("user launches login page & enter the details")
	public void user_launches_login_page_enter_the_details() {
		driver.findElement(By.linkText("Log in")).click();
		 driver.findElement(By.id("Email")).sendKeys("ajayronaldo23@gmail.com");
		 driver.findElement(By.id("Password")).sendKeys("Ajay@1999");
		 driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
	}
	@Then("Home Screen should be get displayed")
	public void home_screen_should_be_get_displayed() {
	    boolean displayed = driver.findElement(By.linkText("ajayronaldo23@gmail.com")).isDisplayed();
	    Assert.assertTrue(displayed);
	}
}
