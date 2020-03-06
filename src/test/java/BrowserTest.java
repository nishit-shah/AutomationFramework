import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {
	static Utility utility = new Utility();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.getProperty("user.dir");
		//System.setProperty("webdriver.gecko.driver", "drivers/geckodriver/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.chrome.driver", "drivers/chromedriver/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.ie.driver", "drivers/iedriver/IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		//driver.manage().window().fullscreen();
		//driver.get("https://google.com");
		
		
		//driver.navigate().to("https://mail.yahoo.com");
	 
		//utility.pause(3000);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		utility.pause(5000);
		WebElement searchBox = driver.findElement(By.xpath("//input[@type='text'][@name='q']"));
		searchBox.sendKeys("Automation Testing",Keys.ENTER);
		
		
		driver.close();
		driver.quit();
		System.out.println("Execution completed");
		
		
	}

}
