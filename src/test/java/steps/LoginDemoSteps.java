package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemoSteps {

	WebDriver driver = null;
	
//	@Given("browser is open")
//	public void browser_is_open() {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("step: browser window is open");
//		String projectPath = System.getProperty("user.dir");
//		// project folder location
//		System.out.println("Project path is : " + projectPath);
//		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver");
//
//		driver = new ChromeDriver();
//
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//
//		// driver.manage().window().maximize();
//	}
//
//	@And("user is on main login page")
//	public void user_is_on_main_login_page() {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.navigate().to("https://example.testproject.io/web/");
//	}
//
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.id("name")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);
//		
//		Thread.sleep(2000);
//	}
//
//	@And("user clicks on login")
//	public void user_clicks_on_login() {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.id("login")).click();
//	}
//
//	@Then("user is navigated to the main home page")
//	public void user_is_navigated_to_the_main_home_page() throws InterruptedException {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.id("logout")).isDisplayed();
//		
//		Thread.sleep(2000);
//		driver.close();
//		driver.quit();
//	}
	
}
