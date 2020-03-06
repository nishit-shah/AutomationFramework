package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchHome {
	private static WebElement element;
	
	public static WebElement searchBox(WebDriver driver) {
		return element = driver.findElement(By.xpath("//input[@type='text'][@name='q']"));
	}
}
