package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPageFactoryObjects {

	WebDriver driver;
	
	@FindBy(name="q")
	WebElement searchTextBox;
	
	
	public GoogleSearchPageFactoryObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void searchQuery(String query) {
		searchTextBox.sendKeys(query,Keys.ENTER);
	}
	
}
