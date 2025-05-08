package petsitcare_User_TestCases;

import org.testng.annotations.Test;

import petsitcare_User_PageObjects.Doglist_PO_11;
import petsitcare_User_PageObjects.Login_PO_01;
import petsitcare_user_base.User_base;

public class TC_11_mydoglist extends User_base {
	
	Login_PO_01 lg; 
	Doglist_PO_11 mdl;
	
	@Test(priority=3)
	public void mydoglist() throws InterruptedException {
		 lg= new Login_PO_01(driver) ; 
		  lg.sign();
			lg.email("buyer.ncrypted@gmail.com");
			lg.password("123456");
			lg.signin();
			
			
			mdl=new Doglist_PO_11(driver);
			mdl.doglist();
			mdl.editdog();
			mdl.dogname("jaffa");
			mdl.weightofdog(3);
			mdl.breedofdog(5);
			mdl.ageofdog(2);
			mdl.selectgender("female");
			mdl.otherdogs("no");
			mdl.cat("yes");
			mdl.children("no");
			mdl.requirement("everything");
			mdl.description("savage dog");
			mdl.instruction("keep distance");
			mdl.submit("submit");
			mdl.deletedog();
		    mdl.pagenations();

	}
}
