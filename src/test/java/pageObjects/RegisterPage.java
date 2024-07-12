package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegisterPage extends BasePage{
	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "input-firstname")
	WebElement tb_FirstName;
	
	@FindBy(id = "input-lastname")
	WebElement tb_LastName;
	
	@FindBy(id = "input-email")
	WebElement tb_Email;
	
	@FindBy(id = "input-password")
	WebElement tb_Password;
	
	@FindBy(name = "agree")
	WebElement cb_terms;
	
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement bu_Continue;
	
	@FindBy(xpath = "//div[@id='content']/h1")
	WebElement txt_ConfirmMsg;
	
	@FindBy(xpath="//input[@id='input-telephone']") 
	WebElement txtTelephone;

	@FindBy(xpath="//input[@id='input-password']") 
	WebElement txtPassword;

	@FindBy(xpath="//input[@id='input-confirm']") 
	WebElement txtConfirmPassword;
	
		
	public void setFirstName(String fName) {
		tb_FirstName.sendKeys(fName);
	}
	
	public void setLastName(String lName) {
		tb_LastName.sendKeys(lName);
	}
	
	public void setEmail(String email) {
		tb_Email.sendKeys(email);
		
	}
	
	public void setTelephone(String tel) {
		txtTelephone.sendKeys(tel);

	}
	
	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
		
	}
	
	public void setConfirmPassword(String pwd) {
		txtConfirmPassword.sendKeys(pwd);

	}
	
	public void acceptTerms() {
		cb_terms.click();
	}
	
	public void clickContinueButton() {
		bu_Continue.click();
	}
	
	public String getConfirmMessage() {
		return txt_ConfirmMsg.getText();
	}
	
}

