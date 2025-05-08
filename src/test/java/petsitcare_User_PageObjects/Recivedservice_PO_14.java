package petsitcare_User_PageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Recivedservice_PO_14 {
	public static WebDriver driver;
	
	public Recivedservice_PO_14(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath=" //a[text()=' Received Services Request ']")WebElement recivedservice;
	
	@FindBy(xpath="//input[@placeholder='Enter search keyword']")WebElement search;
	
	@FindBy(xpath="//a[@class='search_icon']")WebElement servicesearch;
	
	@FindBy(xpath="(//i[@class='fa fa-envelope-o'])[4]")WebElement message;
    @FindBy(xpath="//textarea[@id='message']")WebElement sendmessage;
	@FindBy(xpath="//input[@class='small-btn']")WebElement save;
	@FindBy(xpath="(//button[@data-dismiss='modal'])[2]")WebElement cancel;
	@FindBy(xpath="(//button[@data-dismiss='modal'])[1]")WebElement close;
    @FindBy(xpath="(//h4[text()='House sitting'])[1]")WebElement serviceprofile;
	@FindBy(xpath="//a[@class='user-pic']")WebElement profile;
    @FindBy(xpath="(//h4[@class='panel-title'])[1]")WebElement pricing;
	@FindBy(xpath="(//h4[@class='panel-title'])[2]")WebElement servicetype;
	@FindBy(xpath="(//h4[@class='panel-title'])[3]")WebElement location;
    @FindBy(xpath="(//h4[@class='panel-title'])[4]")WebElement time;
	@FindBy(xpath="(//h4[@class='panel-title'])[5]")WebElement policy;
	@FindBy(xpath="//div[@id='prev-btn']")WebElement picprevious;
	@FindBy(xpath="//div[@id='next-btn']")WebElement picnext;
	@FindBy(xpath="//a[@class='clickPage']")List<WebElement> pagenum;
	@FindBy(xpath="//a[@data-action='accept']")List<WebElement> acceptservice;
	@FindBy(xpath="//a[@data-action='reject']")List<WebElement> rejectservice;
	@FindBy(xpath="//textarea[@name='reason']")WebElement servicereason;

	@FindBy(xpath="(//input[@class='small-btn'])[2]")WebElement submitservice;
	@FindBy(xpath="(//button[@class='close-btn marginleft20'])[2]")WebElement cancelservice;
	@FindBy(xpath="(//span[@aria-hidden='true'])[4]")WebElement closeservice;
	
	@FindBy(xpath="//a[@id='viewAnswers']")List<WebElement> viewanswer;
	@FindBy(xpath="(//button[@class='close'])[2]")WebElement answerclose;
	@FindBy(xpath="//a[@aria-label='Previous']")WebElement Previous;
	@FindBy(xpath="//a[@aria-label='Next']")WebElement Next;





	
	
	public void recivedservice() {
		 recivedservice.click();
	}
	
	   public void profilepic() throws InterruptedException {
	    	serviceprofile.click();
	       	Thread.sleep(3000);
	    	profile.click();
	    	driver.navigate().back();
	       	Thread.sleep(3000);
	    	pricing.click();
	       	Thread.sleep(3000);
	    	servicetype.click();
	       	Thread.sleep(3000);
	    	location.click();
	       	Thread.sleep(3000);
	    	time.click();
	       	Thread.sleep(3000);
	    	policy.click();
	       	Thread.sleep(3000);
	    	picprevious.click();
	       	Thread.sleep(3000);
	    	picnext.click();
	       	Thread.sleep(3000);
	    	driver.navigate().back();
	    	
	    }
	    
	
	public void search(String service) throws InterruptedException {
		 search.click();
		 Thread.sleep(3000);
		 search.sendKeys(service);
		 Thread.sleep(3000);
		 servicesearch.click();
		 Thread.sleep(3000);
         driver.navigate().refresh();
	
	}
	
	 public void message() throws InterruptedException {
	    	Thread.sleep(3000);
	    	message.click();
	    }
	    
	    public void sendmessage(String message) throws InterruptedException {
	    	Thread.sleep(3000);
	    	sendmessage.click();
	    	Thread.sleep(3000);
	    	sendmessage.sendKeys(message);
	    }
	    
	    public void popup(String click) throws InterruptedException {
	    	 if (click.equalsIgnoreCase("submit")) {
	    		 save.click();
	 	    }  else if (click.equalsIgnoreCase("cancel")) {
	 	    	cancel.click();
	 	    }   else {
	 	    	close.click();
	       	Thread.sleep(3000);
	         driver.navigate().refresh();

	 }    	     		 	
	    }
	    
	    public void pagenumber(int number) throws InterruptedException {
	    	pagenum.get(number).click();
	    	Thread.sleep(3000);
	    }
	    public void accept() throws InterruptedException {
	    	acceptservice.get(1).click();
	    	driver.switchTo().alert().dismiss();
	    	Thread.sleep(3000);

	    }
	    
	    public void reject() throws InterruptedException {
	    	rejectservice.get(1).click();
	    	Thread.sleep(3000);

	    }
	    
	    public void servicereason(String reason){
	    	servicereason.click();
	    	servicereason.sendKeys(reason);
	    	
	    }
	    
	    public void rejectreason(String clicks) throws InterruptedException {
	    	    if (clicks.equalsIgnoreCase("submit")) {
	    	        submitservice.click();
	    	    } else if (clicks.equalsIgnoreCase("cancel")) {
	    	        cancelservice.click(); 
	    	    } else {
	    	        closeservice.click();
	    	        Thread.sleep(3000);
	    	        driver.navigate().refresh();
	    	    }
	    	}
	    
	    public void answer(int ans) {
	    	viewanswer.get(ans).click();
	    }
	    
	    public void close() {
	    	answerclose.click();
	    }
	    
	    public void previous() {
	    	Previous.click();
	    }
	    
	    public void next() {
	    	Next.click();
	    }
	    
	    

	    }
