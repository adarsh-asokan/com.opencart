package testCase;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegisterPage;
import testBase.BaseClass;

public class TS001_TC_RF_001_RegisterNewAccount extends BaseClass {

	@Test
	public void registerNewAccount() {
		
		HomePage home = new HomePage(driver);
		
		home.clickOnMyAccount();
		home.clickOnRegister();
		
		RegisterPage register = new RegisterPage(driver);
		
		String fName=randomName(5); 
		register.setFirstName(fName.toUpperCase());
		
		String lName=randomName(5);
		register.setLastName(lName.toUpperCase());
		
		register.setEmail(fName+lName+"@gmail.com".toLowerCase());
		
		register.setTelephone(randomeNumber(10));
		
		String password=randomPassword(10);
		
		System.out.println(password);
		
		register.setPassword(password);
		register.setConfirmPassword(password);
		
		
		
		register.acceptTerms();
		register.clickContinueButton();
		
		String confirmMsg= register.getConfirmMessage();
		
		assertEquals(confirmMsg, "Your Account Has Been Created!");
		
	}

}
