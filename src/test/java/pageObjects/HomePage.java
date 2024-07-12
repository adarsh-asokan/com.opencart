package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[@class='dropdown-toggle'][1]")
	WebElement lnk_MyAccount;
	
	@FindBy(linkText = "Register")
	WebElement Lnk_Register;
	
	@FindBy(linkText = "Login")
	WebElement Lnk_Login;
	
	
	public void clickOnMyAccount() {
		lnk_MyAccount.click();
	}
	
	public void clickOnRegister() {
		Lnk_Register.click();
	}
	
	public void clickOnLogin() {
		Lnk_Login.click();
	}
}
