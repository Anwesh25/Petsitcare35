package petsitcare_User_TestCases;

import org.testng.annotations.Test;

import base.Baseclass;
import petsitcare_User_PageObjects.Myservices_PO_10;

public class TC_10_myservice extends Baseclass {
	
	@Test (priority=2)
	public void myservice() throws InterruptedException {
		Myservices_PO_10 ms= new Myservices_PO_10(driver);
		
		ms.jsp();
		ms.myservice();
		ms.search();
		ms.edit();
		ms.remove();
		ms.pagenations();
	
	}
	

}
