package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	By company_text_area=By.id("company");
	By userName_text_area=By.id("username");
	By password_text_area=By.id("password");
	By sign_in_button=By.id("signInId");
	By continue_button=By.xpath("//input[@name='Continue']");
	 
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void enterTextInCompanyTextArea(String comapny) {
		
		driver.findElement(company_text_area).sendKeys(comapny);
	}
	
	public void enterTextInUserNameTextArea(String username) {
		driver.findElement(userName_text_area).sendKeys(username);
	}
	
	public void enterTextInPasswordTextArea(String password) {
		driver.findElement(password_text_area).sendKeys(password);
	}
	public void clickSignInButton() {
		driver.findElement(sign_in_button).click();
		if(driver.findElement(continue_button).isDisplayed()) {
			driver.findElement(continue_button).click();
		}
	}
	
	public HomePage login(String company_Number,String user_name,String password) {
		enterTextInCompanyTextArea(company_Number);
		enterTextInUserNameTextArea(user_name);
		enterTextInPasswordTextArea(password);
		clickSignInButton();
		HomePage homePage= new HomePage(driver);
		return homePage;
	}
	

}
