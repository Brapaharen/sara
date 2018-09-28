package com.crm.contactPageTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.crm.GenericLib.Baseclass;
import com.crm.GenericLib.Fileutils;
import com.crm.GenericLib.WebDriverCommonData;
import com.crm.objectRepository.ContactPage;


public class ContactTest {
	Fileutils fis=new Fileutils();
	
	@Test
	void CreateContactTest() throws Throwable {
	/*	ContactPage cp=PageFactory.initElements(driver,ContactPage.class);
		//ContactPage cp=PageFactory.initElements(driver, ContactPage.class);
		cp.getCreatecontact();
		String FistName=fis.getExcelData("Sheet1",0,0);
		String LastName=fis.getExcelData("Sheet1",0,1);
        cp.getFirstname().sendKeys(FistName);
		cp.getLastname().sendKeys(LastName);
		cp.getOrganiZationName().click();
		WebDriverCommonData wb=new WebDriverCommonData();
		wb.getWindowIDs();
		*/
		
		System.out.println(System.getProperty("user.dir"));
		
		
	}

}
