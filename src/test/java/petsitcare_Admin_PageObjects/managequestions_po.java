package petsitcare_Admin_PageObjects;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class managequestions_po {
    WebDriver driver;
    WebDriverWait wait;

    public managequestions_po(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Locators
    By homeBtn = By.xpath("//a[text()=' Home ']");
    By managequestionsDropdown = By.xpath("//span[text()='Manage Question']");
    By questionsoptions = By.xpath("//a[text()='Questions']");
    By recordsDropdown = By.xpath("//select[@name='dt_users_length']");
    By addquestionsbtn = By.xpath("//a[@class='btn blue btn-add']");
    By englishquestions = By.xpath("//input[@name='questionValue[1]']");
    By marathiquestion = By.xpath("//input[@name='questionValue[6]']");
    By submitbtn = By.xpath("//button[@name='submitAddForm']");
    By cancelbtn = By.xpath("//button[@name='cn']");
    By searchbar = By.xpath("//input[@type='search']");
    By editbtn = By.xpath("//a[@class='btn default btn-xs black btnEdit']");
    By viewbtn = By.xpath("//a[@class='btn default blue btn-xs btn-viewbtn']");
    By closebtn = By.xpath("//button[@class='btn default']");
    By deletebtn = By.xpath("//a[@class='btn default btn-xs red btn-delete']");
    By editSubmitBtn = By.xpath("//button[@name='submitEditForm']");
    By editCancelBtn = By.xpath("//button[@name='cn']");
    By paginationLinks = By.xpath("//ul[@class='pagination']/li/a");

    // Navigation
    public void navigateToQuestions() {
        wait.until(ExpectedConditions.elementToBeClickable(managequestionsDropdown)).click();
        wait.until(ExpectedConditions.elementToBeClickable(questionsoptions)).click();
    }

    // Click actions
    public void clickHomeButton() {
        driver.findElement(homeBtn).click();
    }

    public void clickManageQuestionsDropdown() {
        driver.findElement(managequestionsDropdown).click();
    }

    public void clickQuestionsLink() {
        driver.findElement(questionsoptions).click();
    }

    public void clickAddButton() {
        driver.findElement(addquestionsbtn).click();
    }

    public void clickSubmitButton() {
        driver.findElement(submitbtn).click();
    }

    public void clickCancelButton() {
        driver.findElement(cancelbtn).click();
    }

    public void clickEditButton() {
        driver.findElement(editbtn).click();
    }

    public void clickEditSubmitButton() {
        driver.findElement(editSubmitBtn).click();
    }

    public void clickEditCancelButton() {
        driver.findElement(editCancelBtn).click();
    }

    public void clickViewButton() {
        driver.findElement(viewbtn).click();
    }

    public void clickCloseInViewModal() {
        driver.findElement(closebtn).click();
    }

    public void clickDeleteButtonAndDismissAlert() {
        driver.findElement(deletebtn).click();
        driver.switchTo().alert().dismiss(); // Cancel the alert instead of accepting
    }

    // Input actions
    public void enterEnglishQuestion(String question) {
        WebElement e = driver.findElement(englishquestions);
        e.clear();
        e.sendKeys(question);
    }

    public void enterMarathiQuestion(String question) {
        WebElement m = driver.findElement(marathiquestion);
        m.clear();
        m.sendKeys(question);
    }

    public void updateEnglishQuestion(String newText) {
        enterEnglishQuestion(newText);
    }

    public void updateMarathiQuestion(String newText) {
        enterMarathiQuestion(newText);
    }

    public void searchQuestion(String keyword) {
        WebElement s = driver.findElement(searchbar);
        s.clear();
        s.sendKeys(keyword);
    }

    public void selectRecordsPerPage(String value) {
        new Select(driver.findElement(recordsDropdown)).selectByVisibleText(value);
    }

    

    // Pagination
    public void clickPaginationLink(int index) {
        List<WebElement> links = driver.findElements(paginationLinks);
        if (index >= 0 && index < links.size()) {
            links.get(index).click();
        }
    }
}