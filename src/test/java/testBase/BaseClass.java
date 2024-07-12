package testBase;

import java.io.File;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

@Listeners(utilities.ExtentReportManager.class)
public class BaseClass {
	static public WebDriver driver;

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
	
	public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
				
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timeStamp + ".png";
		File targetFile=new File(targetFilePath);
		
		sourceFile.renameTo(targetFile);
			
		return targetFilePath;

	}
}
