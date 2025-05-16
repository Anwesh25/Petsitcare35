package petsitcare_User_TestCases;

import org.testng.annotations.Test;

import petsitcare_User_PageObjects.LoginPage_PO_01;
import petsitcare_User_PageObjects.Servicerequest_PO_13;
import petsitcare_user_base.User_base;

public class TC_13_servicerequest extends User_base {
		
        
		Servicerequest_PO_13 sr;

		@Test (priority=5)
		 public void validLoginTest() throws InterruptedException {
			TC_12_wallet wa=new TC_12_wallet();
			wa.validLoginTest();
	        
	        
			 sr= new Servicerequest_PO_13(driver);
			sr.servicerequest();
			sr.search("House sitting");
			sr.searchservice();
			sr.pdfd();
			sr.message();
			sr.sendmessage("hi");
			sr.popup("submit");
			sr.pay();
			sr.cancelbutton();
			sr.previouspage();
			sr.pagenumber(5);
			sr.nextpage();
		}
	}
