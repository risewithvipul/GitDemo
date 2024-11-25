package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver driver;
	By home_button=By.cssSelector("li[class='menu-item active'] span[class='menu_caption']");
	By launch=By.xpath("//span[normalize-space()='Launch']");
	By content=By.xpath("//span[normalize-space()='Content']");
	By explore_assets=By.xpath("//a[normalize-space()='Explore Assets']");
	By explore_phrases=By.xpath("//a[normalize-space()='Explore Phrases']");
	By batch_button=By.xpath("//span[normalize-space()='Batch']");
	By approve_button=By.xpath("//span[normalize-space()='Approve']");
	By factory_print=By.xpath("//span[normalize-space()='Factory Print']");
	By title_element=By.xpath("");
	
	
	HomePage hp;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void homeButtonClick() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(home_button));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", driver.findElement(home_button));
		wait.until(ExpectedConditions.visibilityOfElementLocated(home_button));
		//driver.findElement(home_button).click();
	}
	
	public String getHomePageTitle() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(home_button));
		System.out.println(driver.getTitle());
		return driver.getTitle();
		
	}
	
	

}
