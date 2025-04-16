package petsitcare_User_TestCases;

import org.testng.annotations.Test;

import base.Baseclass;
import petsitcare_User_PageObjects.Login_PO_01;
import petsitcare_User_PageObjects.Myservices_PO_10;

public class TC_10_myservice extends Baseclass {
	Myservices_PO_10 ms;
	Login_PO_01 lg; 


	@Test (priority=2)
	public void myservice() throws InterruptedException {
		 lg= new Login_PO_01(driver) ; 
		  lg.sign();
			lg.email("buyer.ncrypted@gmail.com");
			lg.password("123456");
			lg.signin();

		 ms= new Myservices_PO_10(driver);
		
		ms.jsp();
		ms.myservice();
		ms.service();
		ms.search();
		ms.edit();
		ms.remove();
		ms.pagenations();
	
	}
	

}
