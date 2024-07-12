package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy (id = "input-email")
	WebElement tb_Email;
	
	@FindBy (id = "input-password")
	WebElement tb_Pwd;
	
	@FindBy (xpath = "//input[@value='Login']")
	WebElement bu_login;
	
	
	
	public void setEmail(String email) {
		tb_Email.sendKeys(email);
	}
	
	public void setPassword(String password) {
		tb_Pwd.sendKeys(password);
	}
	
	public void clickLoginButton() {
		bu_login.click();
	}
	
}
