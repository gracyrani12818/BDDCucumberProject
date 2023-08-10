package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {

	public WebDriver driver;

	public AdminPage(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(rdriver,this);		
	}
	@FindBy(xpath = "//input[@id='Email']")
	WebElement txtEmail;

	@FindBy(xpath = "//input[@id='Password']")
	WebElement txtPasswword;

	@FindBy(xpath = "//button[text()='Log in']")
	WebElement btnLogin;

	public void setUsername(String uname) {
		txtEmail.clear();
		txtEmail.sendKeys(uname);
	}

	public void setPassword(String pwd) {
		txtPasswword.clear();
		txtPasswword.sendKeys(pwd);
	}

	public void clickOnLogin() {
		btnLogin.click();
	}

}
