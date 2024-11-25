package testComponents;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pages.HomePage;
import pages.LoginPage;

public class BaseClass {
	protected static WebDriver driver;
	public LoginPage loginPage;
	public HomePage homepage;
	protected Date d;
	
	public WebDriver setup() {
		 driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://qa.kallik.net");
		 return driver;
	}
	
	public void takeScreenshot(String methodName) {
		d=new Date();
		String date_time=d.toGMTString().replace(':', '_').replace(' ', '_');
		System.out.println(date_time);
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File file=new File(System.getProperty("user.dir") + "//reports//" + methodName +"_"+date_time+ ".png");
		System.out.println(file);
		try {
			FileUtils.copyFile(source, file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@BeforeMethod(alwaysRun=true)
	public LoginPage launchApplication() {
		driver=setup();
		loginPage=new LoginPage(driver);
		return loginPage;
	}
	
	@AfterMethod
	public void closeApplication() {
		driver.close();
	}

	

}
