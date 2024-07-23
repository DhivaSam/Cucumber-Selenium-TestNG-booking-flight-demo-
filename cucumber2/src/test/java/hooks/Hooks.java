package hooks;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.DriverInstance;
import base.PageContext;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;

public class Hooks  {
	PageContext context;
	public Hooks(PageContext context) {
		this.context=context;
	}
	@BeforeStep
	public void beforeSteps(Scenario sc) {
		sc.write("Started- Dhiva");
	
	}
	
	@AfterStep
	public void afterSteps(Scenario sc) {
		sc.write("finished- Dhiva");
	
	}
	
	@Before
	public void beforeScenario(Scenario sc) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver directory");  
		WebDriver driver=new ChromeDriver();
		context.setDriver(driver);
		context.getDriver().get("https://www.cleartrip.ae/flights");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
public void afterScenario(Scenario sc) {
		boolean failed=sc.isFailed();
		System.out.println("Is Failed:" +failed);
		
		if(failed) {
		byte[] screenshot=((RemoteWebDriver) context.getDriver()).getScreenshotAs(OutputType.BYTES);
		sc.embed(screenshot, "image/png");}
		context.getDriver().quit();
}
}
