package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPageFactoryObjects;
import pages.GoogleSearchPageObjects;

public class GoogleSearchPageFactoryTest {

	WebDriver driver;
	GoogleSearchPageFactoryObjects googleSearchObj;
	
	@BeforeClass
	public void setup() {
	
		
		WebDriverManager.chromedriver().setup();
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless");
		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void googleSearch() {
		
		
		googleSearchObj = new GoogleSearchPageFactoryObjects(driver);
		driver.get("https://google.com");
		googleSearchObj.searchQuery("Performance Testing");
		//driver.wait(5000);

	}
	
	@AfterClass
	public void teardown() {
		driver.close();
		driver.quit();
	}
	
	
}
