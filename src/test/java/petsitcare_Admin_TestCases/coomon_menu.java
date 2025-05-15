package petsitcare_Admin_TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import petsitcare_Admin_base.Base;
import petsitcare_Admin_PageObjects.commonmenu_content;

public class coomon_menu extends Base{
	
	@Test

	public void commonmenu_content() throws IOException, InterruptedException {
		
		
		dashboars_testcases dt=new dashboars_testcases();
		dt.dashboard();
		
		commonmenu_content CC=new commonmenu_content(driver);
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
		screenshot(null);
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
		CC.pagename("Nishant3546");
		Thread.sleep(3000);
		CC.pagename_m("Nishanth3546");
		Thread.sleep(3000);
		CC.pagetitle("title546");
		Thread.sleep(3000);
		CC.pagetitle_m("Title_m542");
		Thread.sleep(3000);
		CC.metaKeywordValue("3646351dckhyb");
		Thread.sleep(3000);
		CC.metaKeywordValue_m("3646351vhvkdjck");
		Thread.sleep(3000);
		CC.metaDescValue("meatdesSjhjxs");
		Thread.sleep(3000);
		CC.metaDescValue_m("meatdeshvjhvdasd");
		Thread.sleep(3000);
		CC.description("jsuyiuwiedgisuiHEOEbjhvjcygcHWEOHEdsdvsad");
		Thread.sleep(3000);
		CC.description_m("jsuyiuwiedgisuiHEOvjhvhgEHWEOHEdcksd");
		Thread.sleep(3000);
		CC.add_submit();
		Thread.sleep(5000);
		screenshot(null);
		CC.delete(1);
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