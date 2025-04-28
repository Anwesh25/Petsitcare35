package petsitcare_Admin_PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Subscriberspetsitcare {
    WebDriver driver;

    public Subscriberspetsitcare(WebDriver driver) {
        this.driver = driver;
    }

    
    
    By homeBtn = By.xpath("//a[text()=' Home ']");
    By subscribersOption = By.xpath("//a[text()='Subscribers']");
    By recordsDropdown = By.xpath("//select[@name='dt_users_length']");
    By excelBtn = By.xpath("//i[@class='fa fa-upload']");
    By searchBar = By.xpath("//input[@type='text']");
    By deleteIcon = By.xpath("(//a[@class='btn default btn-xs red btn-delete'])[1]");
    
    public void clickHome() {
        driver.findElement(homeBtn).click();
        
    }
    
    public void subscribersOption() {
    	WebElement subscriber=driver.findElement(subscribersOption);
    	subscriber.click();
    
    }
    

    public void selectRecords(String value) {
    	WebElement DD=driver.findElement(recordsDropdown);
        Select sc = new Select(DD);
        sc.selectByValue(value);
    }

    public void clickExcel() {
        driver.findElement(excelBtn).click();
    }

    public void searchSubscriber(String subscriber) {
        driver.findElement(searchBar).sendKeys(subscriber);
    }

    public void deleteSubscriber() {
        driver.findElement(deleteIcon).click();
    }

    public void confirmDelete() {
        driver.switchTo().alert().accept();
    }

   
    }




