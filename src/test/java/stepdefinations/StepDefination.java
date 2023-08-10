package stepdefinations;

import org.junit.validator.PublicClassValidator;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.AdminPage;

public class StepDefination extends Base {
	
		@Given("User Lanch Chrome Browser")
		public void user_lanch_chrome_browser() {
		  System.setProperty("webdriver.chrome.driver", "D:\\Selenium Software\\chromedriver_114\\chromedriver_win32\\chromedriver.exe");
		  
		    driver=new ChromeDriver();
		    
			
			//ChromeOptions chromeOptions = new ChromeOptions();
			//WebDriverManager.chromedriver().setup();
			//driver = new ChromeDriver(chromeOptions);
			
			//ChromeOptions chromeOptions1 = new ChromeOptions();
			//chromeOptions1.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		    

			driver = new ChromeDriver();
		  
		  ad=new AdminPage(driver);//create object of AdminPage JAva class
		}

		@When("User open url {string}")
		public void user_open_url(String url) throws Exception {
			 
		   driver.get(url);
	       Thread.sleep(2000);

		}

		@When("User enter Email as {string} and password as {string}")
		public void user_enter_email_as_and_password_as(String email, String password) throws Exception {
		    
			ad.setUsername(email);
			Thread.sleep(2000);

		   ad.setPassword(password);
			Thread.sleep(2000);

		}

		@When("User click on Login button")
		public void user_click_on_login_button() throws Exception {
		   ad.clickOnLogin();
			Thread.sleep(2000);

		}

		@Then("User verify page title should be {string}")
		public void user_verify_page_title_should_be(String string) {
		
		}

		@Then("close browser")
		public void close_browser() {
		   driver.close();
		}

	}






