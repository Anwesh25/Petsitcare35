package petsitcare_Admin_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
public static WebDriver driver;
	
	public LoginPage(WebDriver driver){
	
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//input[@name='uName']")WebElement username;
	
	@FindBy(xpath="//input[@name='uPass']")WebElement password;
	
	@FindBy(xpath="//button[@name='submitLogin']")WebElement login;
	
	
	public void username(String user) {
		username.sendKeys(user);
	}
	
	public void password(String psd) {
		password.sendKeys(psd);
	}
	
	public void login() {
		login.click();
	}

}
	

	



