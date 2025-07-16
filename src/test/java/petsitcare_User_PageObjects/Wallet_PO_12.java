package petsitcare_User_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wallet_PO_12 {
	
	public static WebDriver driver;
	
	public Wallet_PO_12 (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=" //a[text()=' Wallet']")WebElement wallet;
//	@FindBy(xpath="//a[@aria-controls='wallet']")WebElement walletamount;
	@FindBy(xpath="//a[@aria-controls='redeem-request']")WebElement requesthistory;
	@FindBy(xpath="//button[@name='redeem_history']")WebElement redeemdelete;
    @FindBy(xpath="//a[@aria-controls='redeem-history']")WebElement redeemrequest;
    @FindBy(xpath="//input[@placeholder='Enter Amount']")WebElement redeemamount;
    @FindBy(xpath="//button[@class='small-btn marginbtm20']")WebElement redeemsend;
    @FindBy(xpath="//button[@class='close-btn marginbtm20']")WebElement redeemcancel;
    @FindBy(xpath="//a[@aria-controls='payment-history']")WebElement paymenthistory;
  
    
        public void wallett() {
    	    wallet.click();
    }
    
        public void history() throws InterruptedException {
	      requesthistory.click();
 	        Thread.sleep(3000);

    }
        
        public void deletet() throws InterruptedException {
	     redeemdelete.click();
	     driver.switchTo().alert().dismiss();
	        Thread.sleep(3000);

    }
        public void redeemrequest() {
        	redeemrequest.click();
        }
   
       public void request(String dollers) throws InterruptedException {
	     redeemamount.sendKeys(dollers);
	        Thread.sleep(3000);

    }
  
       public void submit(String click) throws InterruptedException {

	      if (click.equalsIgnoreCase("cancel")) {
	        	redeemsend.click();
	    } else {
	    	 redeemcancel.click();
	    }   
    	Thread.sleep(3000);
    	
     }
   
        public void payment() throws InterruptedException {
        	paymenthistory.click();
   	        Thread.sleep(3000);

        }
}
