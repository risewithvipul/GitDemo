package tests;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import testComponents.BaseClass;

public class HomePageTest extends BaseClass {
	
	
	
	@Test(priority=1)
public void homePageTest() {
	HomePage homepage=loginPage.login("3396", "Vipul", "Kallik@11");
		homepage.homeButtonClick();
		
		
	}
@Test(priority=0)
public void verifyTitle() {
	HomePage homepage=loginPage.login("3396", "Vipul", "Kallik@11");
	System.out.println(homepage.getHomePageTitle());
	Assert.assertEquals(homepage.getHomePageTitle(), "Artwork Management Solutions");
	//homePageTest();
}

}
