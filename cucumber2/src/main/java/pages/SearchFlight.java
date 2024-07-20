package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import base.DriverInstance;
import base.PageContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchFlight {
	PageContext context;
 public SearchFlight(PageContext context) {
	this.context=context;
}
	@And("user clicks on the round trip")
	public void userClicksOnTheRoundTrip() throws InterruptedException {
		Thread.sleep(1000);
		context.getDriver().findElement(By.xpath("//p[text()='Round trip']")).click();
	  
	}
	@And("user enter the {string} info")
	public void userEnterTheInfo(String from) {
		context.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		context.getDriver().findElement(By.xpath("(//input[contains(@class,'field bw-1')])[1]")).sendKeys(from);
		context.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		context.getDriver().findElement(By.xpath("//p[text()='Dubai, AE - Dubai International Airport (DXB)']")).click();
		context.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@And("user should enter the {string} info")
	public void userShouldEnterTheInfo(String to) throws InterruptedException {
		context.getDriver().findElement(By.xpath("(//input[contains(@class,'field bw-1')])[2]")).sendKeys(to);
		context.getDriver().manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		   Thread.sleep(1000);
		   context.getDriver().findElement(By.xpath("(//p[contains(@class,'to-ellipsis o-hidden')])[2]")).click();
		   context.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   
		   context.getDriver().findElement(By.xpath("//button[contains(@class,'flex flex-middle')]/following-sibling::button[1]")).click(); 
		  Thread.sleep(1000);
		  context.getDriver().findElement(By.xpath("(//div[text()='6'])[2]")).click();
		 Thread.sleep(1000);
	}
	@When("user clicks on the search flight")
	public void userClicksOnTheSearchFlight() {
		context.getDriver().findElement(By.xpath("//button[text()='Search flights']")).click();
		context.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	}

	@Then("user should get the list of flight info")
	public void userShouldGetTheListOfFlightInfo() {
		context.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.quit();
	   
	}
}
