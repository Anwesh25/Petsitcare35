package petsitcare_Admin_TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import petsitcare_Admin_base.Base;

import petsitcare_Admin_PageObjects.commonmenu_content_PO_03;

public class coomonmenu_content_TC_03 extends Base{
	
	@Test

	public void commonmenu_content() throws IOException, InterruptedException {
		
		
		dashboars_TC_02 dt=new dashboars_TC_02();
		dt.dashboard();
		
		commonmenu_content_PO_03 CC=new commonmenu_content_PO_03(driver);
		CC.commonmenu();
		Thread.sleep(3000);
		CC.content();
		Thread.sleep(3000);
		screenshot(null);
		
		CC.Recordsperpage("50");
		Thread.sleep(3000);
		
		CC.view(3);
		Thread.sleep(3000);
		screenshot(null);
		CC.viewback();
		Thread.sleep(3000);
		
		Thread.sleep(3000);
		CC.edit(0);
		screenshot(null);
		Thread.sleep(3000);
		CC.edit_cancel();
		Thread.sleep(3000);
		
		CC.content();
		Thread.sleep(3000);
		CC.delete(0);
		Thread.sleep(3000);
		
		CC.delete_promt();
		Thread.sleep(3000);
		
		CC.faq_switch();
		Thread.sleep(3000);
		screenshot(null);
		CC.faq_switch_right();
		Thread.sleep(3000);
		screenshot(null);
		CC.add();
		Thread.sleep(3000);
		screenshot(null);
		CC.pagename("Nishanth_3546");
		Thread.sleep(3000);
		CC.pagename_m("Nishanth_3546");
		Thread.sleep(3000);
		CC.pagetitle("Nishanth_title546");
		Thread.sleep(3000);
		CC.pagetitle_m("Nishanth_Title_m542");
		Thread.sleep(3000);
		CC.metaKeywordValue("Nishanth_3646351dckhyb");
		Thread.sleep(3000);
		CC.metaKeywordValue_m("Nishanth_3646351vhvkdjck");
		Thread.sleep(3000);
		CC.metaDescValue("Nishanth_meatdesSjhjxs");
		Thread.sleep(3000);
		CC.metaDescValue_m("Nishanth_meatdeshvjhvdasd");
		Thread.sleep(3000);
		CC.description("Nishanth_jsuyiuwiedgisuiHEOEbjhvjcygcHWEOHEdsdvsad");
		Thread.sleep(3000);
		CC.description_m("Nishanth_jsuyiuwiedgisuiHEOvjhvhgEHWEOHEdcksd");
		Thread.sleep(3000);
		CC.add_submit();
		Thread.sleep(5000);
		screenshot(null);
		CC.delete(0);
		Thread.sleep(3000);
		CC.accept_delete();
		Thread.sleep(3000);
		screenshot(null);
		CC.searchbar("Terms & Conditions");
		Thread.sleep(3000);
		screenshot(null);
		CC.searchbar_clear();
		Thread.sleep(3000);
		screenshot(null);
		
	}

}