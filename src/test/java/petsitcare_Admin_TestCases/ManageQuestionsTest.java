package petsitcare_Admin_TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import petsitcare_Admin_base.Base;
import petsitcare_Admin_PageObjects.managequestions_po;

public class ManageQuestionsTest extends Base {

    @Test
    public void testQuestionsPageFlow() throws InterruptedException, IOException {
        login lg = new login();
        lg.login1();

        Thread.sleep(2000);

        managequestions_po questions = new managequestions_po(driver);

        // Step 1: Navigate to Questions page
        questions.clickManageQuestionsDropdown();
        Thread.sleep(2000);
        questions.clickQuestionsLink();
        Thread.sleep(2000);

        // Step 2: Return to Home (Dashboard)
        questions.clickHomeButton();
        Thread.sleep(2000);

        // Step 3: Navigate back to Questions page
        questions.clickManageQuestionsDropdown();
        Thread.sleep(2000);
        questions.clickQuestionsLink();
        Thread.sleep(2000);

        // Step 4: Select records dropdown value
        questions.selectRecordsPerPage("50");
        Thread.sleep(2000);

        // Step 5: Add new question
        questions.clickAddButton();
        Thread.sleep(2000);
        questions.enterEnglishQuestion("What is your birth place?");
        questions.enterMarathiQuestion("@$#%#^$&%^");
        Thread.sleep(1000);
        questions.clickSubmitButton();
        Thread.sleep(2000);

        // Step 6: Check Cancel functionality
        questions.clickAddButton();
        Thread.sleep(1000);
        questions.enterEnglishQuestion("is your dog friendly with kids");
        questions.enterMarathiQuestion("#$^^#&^$*");
        questions.clickCancelButton();
        Thread.sleep(2000);

        // Step 7: Search added question
        questions.searchQuestion("can i meet the dogs parents");
        Thread.sleep(2000);

        // Step 8: Edit and update question
        questions.clickEditButton();
        Thread.sleep(1000);
        questions.updateEnglishQuestion("What is your dog's doing?");
        questions.updateMarathiQuestion("#$%#$&Y?");
        questions.clickEditSubmitButton();
        Thread.sleep(2000);

        // Step 9: View and close modal
        questions.clickViewButton();
        Thread.sleep(2000);
        questions.clickCloseInViewModal();
        Thread.sleep(1000);

     // Step 10: Click Delete and cancel the confirmation
        questions.clickDeleteButtonAndDismissAlert();
        Thread.sleep(2000);

        // Step 11: Test pagination
        questions.clickPaginationLink(1); // Go to 2nd page
        Thread.sleep(2000);
    }
}