package com.crm.organization;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.crm.GenericLib.Baseclass;
import com.crm.GenericLib.Fileutils;

public class OraganizationTest extends Baseclass {
	Fileutils flib=new Fileutils();
	@Test
	public void OraganizationTest() throws EncryptedDocumentException, InvalidFormatException, IOException {
	driver.findElement(By.xpath("//a[text()=\"Organizations\"]")).click();
	driver.findElement(By.xpath("//img[@title=\"Create Organization...\"]")).click();
	driver.findElement(By.name("accountname")).sendKeys("Gmail2");
	driver.findElement(By.name("website")).sendKeys("www.timesjobs.com");
	String data=flib.getExcelData("Sheet1",0,0);
	driver.findElement(By.name("bill_street")).sendKeys(data);
	driver.findElement(By.id("phone")).sendKeys("4676542346");
	driver.findElement(By.xpath("(//input[@class=\"crmbutton small save\" and @name=\"button\"])[2]")).click();
		String actData=driver.findElement(By.xpath("//span[contains(text(),'Updated ')]")).getText();
	boolean status=actData.contains("Updated");
		Assert.assertTrue(status);
	System.out.println("Organization created succefully");
	}

}
