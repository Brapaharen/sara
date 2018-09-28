package com.crm.CompaignTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.crm.GenericLib.Baseclass;
import com.crm.GenericLib.Fileutils;

public class CompaignTest extends Baseclass{
@Test(groups= {"smoke Test"})
public void CreateCompaignTest() {
	WebElement wb=driver.findElement(By.xpath("//a[text()='More']"));
	Actions act=new Actions(driver);
	act.moveToElement(wb).perform();
	driver.findElement(By.name("Campaigns")).click();
driver.findElement(By.xpath("//img[@title=\"Create Campaign...\"]")).click();
driver.findElement(By.name("campaignname")).sendKeys("sara");
WebElement wb1=driver.findElement(By.name("campaigntype"));
Select sel=new Select(wb1);
sel.selectByVisibleText("Banner Ads");
driver.findElement(By.xpath("//input[@class=\"crmbutton small save\"]")).click();
}
@Test(groups= {"regression Test"})
public void DeleteCompaignTest() {
	WebElement wb=driver.findElement(By.xpath("//a[text()='More']"));
	Actions act=new Actions(driver);
	act.moveToElement(wb).perform();
	driver.findElement(By.name("Campaigns")).click();
	driver.findElement(By.xpath("(//input[@value='Delete'])[2]")).click();
	Alert alt=driver.switchTo().alert();
	alt.accept();

}
	}


