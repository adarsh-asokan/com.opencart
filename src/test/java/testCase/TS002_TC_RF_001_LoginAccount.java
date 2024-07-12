package testCase;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TS002_TC_RF_001_LoginAccount extends BaseClass {
	
	@Test
	public void LoginAccount() throws IOException {
		HomePage home = new HomePage(driver);
		home.clickOnMyAccount();
		home.clickOnLogin();
		
		Properties pro = new Properties();
		FileInputStream file = new FileInputStream("./src//test//java/utilities/config.properties");
		pro.load(file);
		String email=pro.getProperty("email");
		String password = pro.getProperty("password");
		
		LoginPage login = new LoginPage(driver);
		login.setEmail(email);
		login.setPassword(password);
		
		login.clickLoginButton();
		
		MyAccountPage myAccount = new MyAccountPage(driver);
		String confirmMessage = myAccount.confirmMessage();
		
		assertEquals(confirmMessage,"Change your password");
		
		
	}
	
}
