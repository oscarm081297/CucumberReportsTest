package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public MainPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 20);
	}
	
	
	@FindBy(how=How.XPATH ,using="//img[@class='_2qgu _7ql _1m6h img']") WebElement usernameBox; //contains picture and name of the user
	
	
	//Check if the username displayed on mainpage 
	// is equivalent to the one entered by parameter

	public boolean checkUserName(String username) {
		wait.until(ExpectedConditions.visibilityOf(usernameBox));
		
		if(usernameBox.getText().equals(username)) {
			return true;
		}else {
			return false;
		}
	}
	
	
	

}
