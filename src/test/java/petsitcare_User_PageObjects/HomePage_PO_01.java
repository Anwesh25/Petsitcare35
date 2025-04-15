package petsitcare_User_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PO_01 {
	public static WebDriver driver;

	public HomePage_PO_01(WebDriver driver){

	this.driver=driver;
	PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@name='email']")WebElement EmailAddress;

	@FindBy(xpath="//input[@name='psw']")WebElement password;

	@FindBy(xpath="//button[@name='login']")WebElement login;


	public void username(String user) {
	EmailAddress.sendKeys(user);
	}

	public void password(String psd) {
	password.sendKeys(psd);
	}

	public void login() {
	login.click();
	}

	}


