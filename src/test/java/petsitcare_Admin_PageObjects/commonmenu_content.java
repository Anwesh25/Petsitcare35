package petsitcare_Admin_PageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class commonmenu_content{
	
public static WebDriver driver;
	
	public commonmenu_content(WebDriver driver){
	
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath="//span[text()='Common Menu']")WebElement common_menu;

@FindBy(xpath="(//a[text()='Content'])[1]")WebElement content1;

@FindBy(xpath="(//a[text()='Content'])[2]")WebElement content2;	

@FindBy(xpath="//a[@class='btn blue btn-add']")WebElement add;

@FindBy(xpath="//select[@aria-controls='cntnt']")WebElement records_perpage;

@FindBy(xpath="//a[@class='btn default btn-xs black btnEdit']")List<WebElement>  edit;

@FindBy(xpath="//a[@class='btn default blue btn-xs btn-viewbtn']")List<WebElement> view;

@FindBy(xpath="//a[@class='btn default btn-xs red btn-delete']")List<WebElement> delete;

@FindBy(xpath="//select[@name='cntnt_length']")WebElement recorsDD;

@FindBy(xpath="//input[@aria-controls='cntnt']")WebElement searchbar;

@FindBy(xpath="//input[@id='pageNameValue[1]']")WebElement pagename;

@FindBy(xpath="//input[@id='pageNameValue[6]']")WebElement pagename_m;

@FindBy(xpath="//input[@id='pageTitleValue[1]']")WebElement pagetitle;

@FindBy(xpath="//input[@id='pageTitleValue[6]']")WebElement pagetitle_m;

@FindBy(xpath="//input[@id='metaKeywordValue[1]']")WebElement metaKeywordValue;

@FindBy(xpath="//input[@id='metaKeywordValue[6]']")WebElement metaKeywordValue_m;

@FindBy(xpath="//textarea[@id='metaDescValue[1]']")WebElement metaDescValue;

@FindBy(xpath="//textarea[@id='metaDescValue[6]']")WebElement metaDescValue_m;

@FindBy(xpath="//iframe[@title='Rich Text Editor,pageDescValue[1]']")WebElement iframe1;

@FindBy(xpath="//iframe[@title='Rich Text Editor,pageDescValue[6]']")WebElement iframe2;

@FindBy(xpath="//html[@dir='ltr']/body")List<WebElement> description;

@FindBy(xpath="//button[text()='Submit']")WebElement submit;

@FindBy(xpath="//button[text()='Cancel']")WebElement Cancel;

@FindBy(xpath="//button[text()='Close']")WebElement Close;

@FindBy(xpath="//button[@name='cn']")WebElement edit_cancel;

@FindBy(xpath="//span[@class='switch-left switch-success']")WebElement faq_switch;

@FindBy(xpath="//span[@class='switch-right switch-danger']")WebElement faq_switch_right;

public void commonmenu() {
	Actions ac=new Actions(driver);
	ac.moveToElement(common_menu).perform();
	common_menu.click();
	
}

public void content() throws InterruptedException {
	
	Actions ac=new Actions(driver);
	ac.moveToElement(content1).perform();
	Thread.sleep(3000);
	content1.click();
}

public void Recordsperpage(String value) {
	
	Select sc=new Select(records_perpage);
	sc.selectByVisibleText(value);
}

public void searchbar(String text) throws InterruptedException {
	searchbar.sendKeys(text);
	Thread.sleep(3000);
}

public void searchbar_clear() throws InterruptedException {
	searchbar.clear();
	Thread.sleep(3000);

	/*Actions ac=new Actions(driver);
	ac.click(searchbar).perform();
	ac.keyDown(Keys.BACK_SPACE).perform();
   
    Thread.sleep(4000); 

    ac.keyUp(Keys.BACK_SPACE).perform();

    
	driver.navigate().refresh();
	Thread.sleep(3000);*/
}

public void view(int row) {
	view.get(row).click();
}

public void viewback() {
	//driver.switchTo().alert().dismiss();
	Close.click();
}
 public void edit(int num) {
	 edit.get(num).click();
 }

public void edit_cancel() {
	edit_cancel.click();
}


public void delete(int i) {
	
	delete.get(i).click();
}
 
public void delete_promt() {
	driver.switchTo().alert().dismiss();
}

public void faq_switch() {
	faq_switch.click();
}
public void faq_switch_right() {
	faq_switch_right.click();
}



public void add() {
	add.click();
}

public void pagename(String pagename_e) {
	pagename.sendKeys(pagename_e);
}

public void pagename_m(String pagename) {
	pagename_m.sendKeys(pagename);
}

public void pagetitle(String pagetitle1) {
	pagetitle.sendKeys(pagetitle1);
}

public void pagetitle_m(String pagetitle1) {
	pagetitle_m.sendKeys(pagetitle1);
}
public void metaKeywordValue(String value) {
	metaKeywordValue.sendKeys(value);
}

public void metaKeywordValue_m(String value) {
	metaKeywordValue_m.sendKeys(value);
}

public void metaDescValue(String value) {
	metaDescValue.sendKeys(value);
}


public void metaDescValue_m(String value) {
	metaDescValue_m.sendKeys(value);
}

public void description(String value) {
	driver.switchTo().frame(iframe1);
	
	description.get(0).sendKeys(value);
	
	driver.switchTo().defaultContent();
	
}

public void description_m(String value) {
	driver.switchTo().frame(iframe2);
	
	description.get(0).sendKeys(value);
	
	driver.switchTo().defaultContent();
}

public void add_submit() {
	submit.click();
}

public void add_cancel() {
	Cancel.click();
}


public void accept_delete() {
	driver.switchTo().alert().accept();
}


}
