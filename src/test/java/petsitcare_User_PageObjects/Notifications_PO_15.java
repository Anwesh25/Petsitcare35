package petsitcare_User_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Notifications_PO_15 {
	
    public static WebDriver driver;

        public Notifications_PO_15(WebDriver driver) {
	       this.driver=driver;
     	PageFactory.initElements(driver, this);
        
        }
        
     	@FindBy(xpath="//a[text()=' Notifications ']")WebElement linkedtext;
     	
     	@FindBy(xpath="(//label[@class='switch'])[1]")WebElement accept;
     	@FindBy(xpath="(//label[@class='switch'])[2]")WebElement reject;
     	@FindBy(xpath="(//label[@class='switch'])[3]")WebElement acceptservice;
     	@FindBy(xpath="(//label[@class='switch'])[4]")WebElement servicebooked;
     	
     	@FindBy(xpath="(//label[@class='switch'])[5]")WebElement wallet;
     	@FindBy(xpath="(//label[@class='switch'])[6]")WebElement servicesomplete;
     	@FindBy(xpath="(//label[@class='switch'])[7]")WebElement closeservice;
     	@FindBy(xpath="(//label[@class='switch'])[8]")WebElement passwordchange;
     	
        @FindBy(xpath="(//label[@class='switch'])[9]")WebElement sendmsg;
     	@FindBy(xpath="(//label[@class='switch'])[10]")WebElement service;
     	@FindBy(xpath="(//label[@class='switch'])[11]")WebElement makepayment;
     	@FindBy(xpath="(//label[@class='switch'])[12]")WebElement cancel;
     	@FindBy(xpath="(//label[@class='switch'])[13]")WebElement rating;
     	@FindBy(xpath="(//label[@class='switch'])[14]")WebElement added;
     	@FindBy(xpath="(//label[@class='switch'])[15]")WebElement adminaccept;
     	@FindBy(xpath="(//label[@class='switch'])[16]")WebElement password;


      public void Notification() throws InterruptedException {
    	  linkedtext.click();
    	  Thread.sleep(2000);
    	  
      }
        
      public void acceptrequest() throws InterruptedException {
    	  accept.click();
    	  Thread.sleep(2000);
    	  
      }
      public void rejectrequest() throws InterruptedException {
    	  reject.click();
    	  Thread.sleep(2000);

      }
      public void acceptservice() throws InterruptedException {
    	  acceptservice.click();
    	  Thread.sleep(2000);

      }
      
      public void servicebooked() throws InterruptedException {
    	  servicebooked.click();
    	  Thread.sleep(2000);

      } 
      
      public void wallet() throws InterruptedException {
    	  wallet.click();
    	  Thread.sleep(2000);

      } 
      
      public void servicesomplete() throws InterruptedException {
    	  servicesomplete.click();
    	  Thread.sleep(2000);

      }
      
      public void closeservice() throws InterruptedException {
    	  closeservice.click();
    	  Thread.sleep(2000);

      } 
      
      public void passwordchange() throws InterruptedException {
    	  passwordchange.click();
    	  Thread.sleep(2000);

      }
      
      public void sendmsg() throws InterruptedException {
    	  sendmsg.click();
    	  Thread.sleep(2000);

      }
      
      public void service() throws InterruptedException {
    	  service.click();
    	  Thread.sleep(2000);

      }
      
      public void makepayment() throws InterruptedException {
    	  makepayment.click();
    	  Thread.sleep(2000);

      }
      
      public void cancel() throws InterruptedException {
    	  cancel.click();
    	  Thread.sleep(2000);

      }
      
      public void rating() throws InterruptedException {
    	  rating.click();
    	  Thread.sleep(2000);

      }
      
      public void added() throws InterruptedException {
    	  added.click();
    	  Thread.sleep(2000);

      }
      
      public void adminaccept() throws InterruptedException {
    	  adminaccept.click();
    	  Thread.sleep(2000);

      }
      
      public void password() throws InterruptedException {
    	  password.click();
    	  Thread.sleep(2000);

      }
}