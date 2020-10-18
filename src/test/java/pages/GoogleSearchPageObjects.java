package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {
	
	WebDriver driver;

	By searchTextBox = By.name("q");
	By searchButton = By.name("btnK");
	
	public GoogleSearchPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	public void searchText(String query) {
		driver.findElement(searchTextBox).sendKeys(query,Keys.RETURN);
	}
	
	public void searchButtonClick() {
		driver.findElement(searchButton).sendKeys(Keys.RETURN);
	}
	
}
