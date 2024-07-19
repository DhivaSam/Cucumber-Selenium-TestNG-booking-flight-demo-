package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.DriverInstance;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends DriverInstance {
	//WebDriver driver;
	

	
	@Given("user should navigate to the application info")
	public void usershouldNavigate() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abc\\Downloads\\driver\\chromedriver-win64\\chromedriver.exe");  
		driver=new ChromeDriver();
		driver.get("https://www.cleartrip.ae/flights");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	 @And("user clicks on the round trip icon") public void userClicksOnTheRoundTripIcon()
	 { driver.findElement(By.xpath("(//p[contains(@class,'fs-3 fw-600')])[2]")).
	 click();
	 
	  }
	/* * 
	 * @When("user clicks on the search flight") public void
	 * userClicksOnTheSearchFlight() {
	 * driver.findElement(By.xpath("//button[text()='Search flights']")).click();
	 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 * 
	 * }
	 * 
	 * @Then("user should get the list of flight info") public void
	 * userShouldGetTheListOfFlightInfo() {
	 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 * driver.quit();
	 * 
	 * }
	 */

	@Then("user should get not the list of flight info")
	public void userShouldGetNotTheListOfFlightInfo() {
		// Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.quit();

	}

	@Given("user enter the from info as {string}")
	public void userEnterTheFromInfoAs(String from) {
		driver.findElement(By.xpath("(//input[contains(@class,'field bw-1')])[1]")).sendKeys(from);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//p[text()='Dubai, AE - Dubai International Airport (DXB)']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("user enter the to info  as {string}")
	public void userEnterTheToInfoAs(String to) {
		driver.findElement(By.xpath("(//input[contains(@class,'field bw-1')])[2]")).sendKeys(to);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//p[contains(@class,'to-ellipsis o-hidden')])[2]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//button[contains(@class,'flex flex-middle')]/following-sibling::button)[1]"))
				.click();
		driver.findElement(By.xpath("(//div[text()='6'])[2]")).click();
	}

}
