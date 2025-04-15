package petsitcare_Admin_PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard_PO_01 {
	
	public static WebDriver driver;
	public Dashboard_PO_01(WebDriver driver) { 
	this.driver=driver; 
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Sign in']")WebElement Signin;

    @FindBy(xpath="//input[@placeholder='Enter Email Address']")WebElement Email;
	
	@FindBy(xpath="//input[@type='password']")WebElement password;
	
	@FindBy(xpath="//button[@name='login']")WebElement login;
	
	public void signin() throws InterruptedException {
		Signin.click();
		Thread.sleep(3000);

	}
	
	public void username(String user) throws InterruptedException  {
		Email.sendKeys(user);
		Thread.sleep(3000);
	}
	
	public void password(String psd) throws InterruptedException  {
		password.sendKeys(psd);
		Thread.sleep(3000);

	}
	
	public void login() {
		login.click();

	}
}
