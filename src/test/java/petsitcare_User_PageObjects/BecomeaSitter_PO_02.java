package petsitcare_User_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BecomeaSitter_PO_02 {
	WebDriver driver;
	public BecomeaSitter_PO_02(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Become a Sitter']")WebElement BecomeaSitter;
	@FindBy(xpath="//input[@name='firstname']")WebElement Firstname;
	@FindBy(xpath="//input[@name='lastname']")WebElement Lastname;
	@FindBy(xpath="//input[@placeholder='Enter Email Address']")WebElement Email;
	@FindBy(xpath="//input[@name='psw']")WebElement password;
	@FindBy(xpath="//input[@name='confirm_password']")WebElement cpassword;
	@FindBy(xpath="//div[@class='recaptcha-checkbox-border']")WebElement captcha;
	@FindBy(xpath="//iframe[@title='reCAPTCHA']")WebElement captcha1;
	@FindBy(xpath="//button[@name='register']")WebElement signup;
	
	public void BecomeaSitter() throws InterruptedException {
		BecomeaSitter.click();
    	Thread.sleep(3000);
    }	
	public void Firstname(String firstname) throws InterruptedException {
		Firstname.sendKeys(firstname);
    	Thread.sleep(3000);
    }	
	public void Lastname(String lastname) throws InterruptedException {
		Lastname.sendKeys(lastname);
    	Thread.sleep(3000);
    }
	public void Email(String email) throws InterruptedException {
		Email.sendKeys(email);
    	Thread.sleep(3000);
    }
	public void password(String passwrd) throws InterruptedException {
		password.sendKeys(passwrd);
    	Thread.sleep(3000);
    }
	public void cpassword(String confirmpasswrd) throws InterruptedException {
		cpassword.sendKeys(confirmpasswrd);
    	Thread.sleep(3000);
	}
	public void captcha() throws InterruptedException {
		driver.switchTo().frame(captcha1);
		captcha.click();
    	Thread.sleep(5000);  
    	driver.switchTo().defaultContent();
    	}
		
	public void signup() throws InterruptedException {
		signup.click();
    	Thread.sleep(3000);
	}
}

