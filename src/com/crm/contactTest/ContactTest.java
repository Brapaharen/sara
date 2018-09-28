package com.crm.contactTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.crm.GenericLib.Baseclass;

public class ContactTest extends Baseclass {
	@Test(groups= {"smoke Test"})
	public void CreateContactTest() {
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//img[@title=\"Create Contact...\"]")).click();
		WebElement wb=driver.findElement(By.name("salutationtype"));
		Select sel=new Select(wb);
		sel.selectByVisibleText("Ms.");
		driver.findElement(By.name("lastname")).sendKeys("Saranya");
		driver.findElement(By.xpath("//img[contains(@onclick,'Popup')]")).click();
	Set<String> Set=	driver.getWindowHandles();
	Iterator<String> it=Set.iterator();
    String psID=it.next();
    String CsID=it.next();
    driver.switchTo().window(CsID);
    driver.findElement(By.id("search_txt")).sendKeys("Gmail");
    driver.findElement(By.name("search")).click();
    driver.findElement(By.xpath("//a[text()='Gmail']")).click();
    driver.switchTo().window(psID);
    driver.findElement(By.xpath("//input[@class=\"crmbutton small save\"]")).click();
		}
	@Test(groups= {"regression Test"})
	public void DeleteContactTest() {
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.name("selected_id")).click();
		driver.findElement(By.xpath("(//input[@value=\"Delete\"])[2]")).click();
		Alert alt=driver.switchTo().alert();
		alt.accept();
		
		
	}
}
