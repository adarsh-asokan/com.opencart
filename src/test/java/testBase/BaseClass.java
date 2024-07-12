package testBase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	public WebDriver driver;

	@BeforeClass()
	@Parameters("driver")
	public void setup(String browser) {

		switch (browser.toLowerCase()) {

		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new EdgeDriver();
			break;

		}

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
