package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
WebDriver driver;
WebDriverWait wait;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 20);
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='email']") WebElement emailTextBox; // email text input
	@FindBy(how=How.XPATH,using="//input[@id='pass']") WebElement passwordTextBox; // password text input
	@FindBy(how=How.ID ,using="u_0_b") WebElement loginButton; // login button
	
	
	//writes the email in email input
	public void setEmail(String email) {
		emailTextBox.sendKeys(email);
	}
	
	
	//writes the password in password input
	public void setPassword(String password) {
		passwordTextBox.sendKeys(password);
	}
	
	
	//click on login button
	public void clickOnLoginButton() {
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("u_0_b")));
		loginButton.click();
	}
	


}
