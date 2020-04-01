package cucsdocker;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StepDefinitions {
	
	WebDriver driver;
	
	@Given("User on home page")
	public void user_on_home_page() {
	   System.out.println("This is from Given");
	   System.out.println(System.getProperty("user.dir"));
	   System.setProperty("webdriver.gecko.driver" ,  System.getProperty("user.dir") + "/src/test/resources/driver/geckodriver");
	   driver = new FirefoxDriver();
	   driver.get("http://newtours.demoaut.com/");
	}

	@When("User enter username and password")
	public void user_enter_username_and_password() {
		System.out.println("This is from When");
	   
	}

	@Then("Login page should be displayed")
	public void login_page_should_be_displayed() {
		System.out.println("This is from Then");
	}


}
