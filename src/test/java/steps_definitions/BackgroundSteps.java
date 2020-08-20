package steps_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.*;

public class BackgroundSteps {

	WebDriver driver;
	
	@Given("^Open the browser$")
	public void open_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		
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
	   
	}

	@When("^I navigate to Facebook page$")
	public void i_navigate_to_Google_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://facebook.com/");
	}
}
