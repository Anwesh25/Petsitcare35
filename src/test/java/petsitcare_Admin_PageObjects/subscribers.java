package petsitcare_Admin_PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class subscribers {

    WebDriver driver;

    public subscribers(WebDriver driver) {
        this.driver = driver;
    }

    // Locators for menu and navigation
    By manageSubscribersMenu = By.xpath("//span[text()='Manage Subscriber']");
    By subscribersOption = By.xpath("//a[text()='Subscribers']");

    // Locators for Subscribers page actions
   
    By recordsDropdown = By.xpath("//select[@name='dt_users_length']");
    By excelBtn = By.xpath("//i[@class='fa fa-upload']");
    By searchBar = By.xpath("//input[@type='text']");
    By deleteIcon = By.xpath("(//a[@class='btn default btn-xs red btn-delete'])[1]");

    // ------------------------------
    // Combined Methods
    // ------------------------------

    public void navigateToSubscribers() throws InterruptedException {
        driver.findElement(manageSubscribersMenu).click();
        Thread.sleep(3000);
        driver.findElement(subscribersOption).click();
    }

    public void clickSubscribersOption() {
        WebElement subscriber = driver.findElement(subscribersOption);
        subscriber.click();
    }

    
    

    public void selectRecords(String value) {
        WebElement dropdown = driver.findElement(recordsDropdown);
        Select select = new Select(dropdown);
        select.selectByValue(value);
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

    

    public void cancelDelete() {
        driver.switchTo().alert().dismiss();
    }
}
