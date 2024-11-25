package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import testComponents.BaseClass;
import utils.ExcelUtils;

public class LoginTest extends BaseClass {
	//private static WebDriver driver=null;
	

	/*
	 * WebDriver driver; public LoginTest(WebDriver driver) { super(driver);
	 * this.driver=driver; // TODO Auto-generated constructor stub }
	 */
	static String projectPath=System.getProperty("user.dir");
	static String sheetName="Sheet1";
	ExcelUtils exc=new ExcelUtils(projectPath+"/data/data.xlsx",sheetName);
	int company=(int) exc.getCellDataNumericValue(1, 0);
	String company_Number=String.valueOf(company);
	String user_name=exc.getCellDataString(1, 1);
	String password=exc.getCellDataString(1, 2);
	
@Test
	public void loginToHomePage() throws InterruptedException {
		 
			/*
			 * driver=new FirefoxDriver(); driver.get("https://qa.kallik.net");
			 * driver.manage().window().maximize();
			 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 */
		
			/*
			 * LoginPage lp=new LoginPage(driver);
			 * lp.enterTextInCompanyTextArea(company_Number);
			 * lp.enterTextInUserNameTextArea(user_name);
			 * lp.enterTextInPasswordTextArea(password); lp.clickSignInButton();
			 */
	HomePage homepage=loginPage.login(company_Number, user_name, password);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		//System.out.println(driver.getTitle());
		//wait.until(ExpectedConditions.visibilityOfElementLocated(null));
		
	}

}
