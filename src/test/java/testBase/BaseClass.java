package testBase;
import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public WebDriver driver;
	
	@BeforeClass
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/");
			
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	static public String randomName(int value) {
		return RandomStringUtils.randomAlphabetic(value);
	}
	
	static public String randomPassword(int value) {
		return RandomStringUtils.randomAlphanumeric(value);
	}
	
	static public String randomeNumber(int value) {
		return RandomStringUtils.randomNumeric(10);
	}
}
