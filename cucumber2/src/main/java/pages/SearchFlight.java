package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import base.DriverInstance;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchFlight extends DriverInstance{

	@And("user clicks on the round trip")
	public void userClicksOnTheRoundTrip() throws InterruptedException {
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//p[text()='Round trip']")).click();
	  
	}
	@And("user enter the {string} info")
	public void userEnterTheInfo(String from) {
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//input[contains(@class,'field bw-1')])[1]")).sendKeys(from);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//p[text()='Dubai, AE - Dubai International Airport (DXB)']")).click();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@And("user should enter the {string} info")
	public void userShouldEnterTheInfo(String to) throws InterruptedException {
		driver.findElement(By.xpath("(//input[contains(@class,'field bw-1')])[2]")).sendKeys(to);
		   driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("(//p[contains(@class,'to-ellipsis o-hidden')])[2]")).click();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   
		  driver.findElement(By.xpath("//button[contains(@class,'flex flex-middle')]/following-sibling::button[1]")).click(); 
		  Thread.sleep(1000);
		 driver.findElement(By.xpath("(//div[text()='6'])[2]")).click();
		 Thread.sleep(1000);
	}
	@When("user clicks on the search flight")
	public void userClicksOnTheSearchFlight() {
	    driver.findElement(By.xpath("//button[text()='Search flights']")).click();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	}

	@Then("user should get the list of flight info")
	public void userShouldGetTheListOfFlightInfo() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.quit();
	   
	}
}
