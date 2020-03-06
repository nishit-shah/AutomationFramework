package test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.reporter.ExtentAventReporter;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchHome;
import pages.GoogleSearchPageObjects;
import listeners.*;

@Listeners(listeners.TestNGListeners.class)
public class GoogleSearchTest {
	
	private static WebDriver driver;
	
	@BeforeTest
	public void setup() {
	
		
		WebDriverManager.chromedriver().setup();
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless");
		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void googleSearch() {
		
		GoogleSearchPageObjects googleSearch = new GoogleSearchPageObjects(driver);
		driver.get("https://google.com");
		googleSearch.searchText("Automation Testing");
		googleSearch.searchButtonClick();
		//GoogleSearchHome.searchBox(driver).sendKeys("Automation Testing",Keys.ENTER);
		//driver.wait(5000);

	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		driver.quit();
	}
	
}
