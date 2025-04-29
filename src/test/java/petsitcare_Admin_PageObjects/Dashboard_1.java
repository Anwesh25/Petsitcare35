package petsitcare_Admin_PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Dashboard_1 {

public static WebDriver driver;
	
	public Dashboard_1(WebDriver driver){
	
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@class='style_none_eff'])[1]")WebElement users;
	
	@FindBy(xpath="(//a[@class='style_none_eff'])[2]")WebElement services_list;
	
	@FindBy(xpath="(//a[@class='style_none_eff'])[3]")WebElement earnings;
	
	@FindBy(xpath="//a[text()=' Home ']")WebElement home;
	
	@FindBy(xpath="//select[@id='month_users']")WebElement month_users;
	
	@FindBy(xpath="//select[@id='year_users']")WebElement year_users;
	
   @FindBy(xpath="//select[@id='month_booking']")WebElement month_booking;
	
	@FindBy(xpath="//select[@id='year_booking']")WebElement year_booking;
	
    @FindBy(xpath="//select[@id='month_service']")WebElement month_service;
	
	@FindBy(xpath="//select[@id='year_service']")WebElement year_service;
	
    @FindBy(xpath="//select[@id='month_completedservice']")WebElement month_completedservice;
	
	@FindBy(xpath="//select[@id='year_completedservice']")WebElement year_completedservice;
	
	
	public void users() {
		
		users.click();
	}
	
	public void services_list() {
		services_list.click();
		
	}
	public void earnings() {
		earnings.click();
	}
	
	public void home() {
		home.click();
	}
	public Select scc;
	public void users(String month,String year) throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView();",year_users );
		js.executeScript("arguments[0].click();",year_users );
		
		scc=new Select(year_users);
		scc.selectByVisibleText(year);
		Thread.sleep(3000);
		scc=new Select(month_users);
		scc.selectByVisibleText(month);
		
		
	}
	
public void booking(String month,String year) throws InterruptedException {
		
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();",year_booking );
	
	 scc=new Select(year_booking);
	scc.selectByVisibleText(year);
	Thread.sleep(3000);
		scc=new Select(month_booking);
		scc.selectByVisibleText(month);
		

	}

public void service(String month,String year) throws InterruptedException {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();",year_service );
	scc=new Select(year_service);
	scc.selectByVisibleText(year);
	Thread.sleep(3000);
	scc=new Select(month_service);
	scc.selectByVisibleText(month);
	
	
}

public void completedservice(String month,String year) throws InterruptedException {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();",year_completedservice );
	scc=new Select(year_completedservice);
	scc.selectByVisibleText(year);
	Thread.sleep(3000);
	
	scc=new Select(month_completedservice);
	scc.selectByVisibleText(month);
	
	
}
}
