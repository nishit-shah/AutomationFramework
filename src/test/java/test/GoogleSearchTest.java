package test;


import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.reporter.ExtentAventReporter;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import listeners.*;
import pages.GoogleSearchHome;
import pages.GoogleSearchPageObjects;

//@Listeners(listeners.TestNGListeners.class)
public class GoogleSearchTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
	
		
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless");
		driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void googleSearch() throws InterruptedException {
		
		GoogleSearchPageObjects googleSearch = new GoogleSearchPageObjects(driver);
		driver.get("https://www.google.com");
		//Thread.sleep(5000);
		googleSearch.searchText("Automation Testing");
		//googleSearch.searchButtonClick();
		//GoogleSearchHome.searchBox(driver).sendKeys("Automation Testing",Keys.ENTER);
		//driver.wait(5000);
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
		driver.quit();
	}
	
}
