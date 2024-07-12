package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (linkText = "Change your password")
	WebElement msg_Confirm;
	
	public String confirmMessage() {
		return msg_Confirm.getText();
	}
	

}
