package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {

	WebDriver driver = null;

	@Given("browser window is open")
	public void browser_window_is_open() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("step: browser window is open");
		String projectPath = System.getProperty("user.dir");
		// project folder location
		System.out.println("Project path is : " + projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		// driver.manage().window().maximize();
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("step: user is on google search page");
		driver.navigate().to("https://google.com");
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("step: user enters a text in search box");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		Thread.sleep(2000);
	}

	@And("hits enter")
	public void hits_enter() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("step: hits enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("step: user is navigated to search results");
		driver.getPageSource().contains("Online Courses");

		driver.close();
		driver.quit();
	}

}
