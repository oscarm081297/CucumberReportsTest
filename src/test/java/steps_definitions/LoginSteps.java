package steps_definitions;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;
import pages.MainPage;


public class LoginSteps {
	
	WebDriver driver;
	LoginPage loginpage;
	MainPage mainpage;

	
	//Init driver and navigate to loginpage
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
try {
			
			String browser = System.getProperty("browser");
			String env = System.getProperty("environment");
				 
		 if(browser.equals("firefox")) {
			 System.setProperty("webdriver.gecko.driver", "C:\\Users\\oscar\\Documents\\selenium\\geckodriver\\geckodriver.exe");
				driver = new FirefoxDriver();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				//driver.get("https://facebook.com/");
				System.out.println("++++ENV++++ : " +env.toString());
		 }else if(browser.equals("chrome")) {
			 	System.setProperty("webdriver.chrome.driver", "C:\\Users\\oscar\\Documents\\selenium\\chromedriver\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				//driver.get("https://facebook.com/");
				System.out.println("++++ENV++++ : " +env.toString());
		 }else {
			 throw new Exception();
		 }
		 
		}catch(Exception e) {
			e.printStackTrace();
			throw new Exception("Some error configuring webdriver browser");
		
		}
		driver.get("https://facebook.com/");
	   
	}

	//writes email and password
	@When("^Enter valid user name and password$")
	public void enter_valid_user_name_and_password() throws Throwable {
	    
		loginpage = new LoginPage(driver);
		loginpage.setEmail("oca0812@gmail.com");
		loginpage.setPassword("oscarm0812");
	    
	}

	
	//clicked on login button
	@And("^clicked on login button$")
	public void clicked_on_login_button() throws Throwable {
	   
		loginpage.clickOnLoginButton();
	}
	

	//redirected to mainpage and check if the user displayed is the correct
	@Then("^User redirected to mainpage$")
	public void user_redirected_to_inbox() throws Throwable {
		mainpage = new MainPage(driver);
		mainpage.checkUserName("Oscar");
	    
	}


}
