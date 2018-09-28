package com.crm.GenericLib;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public abstract class Baseclass {
	public static WebDriver driver;
	Fileutils flib=new Fileutils();
	@BeforeClass(groups= {"smoke Test"})
	public void configBc() {
		System.out.println("launch the browser");
	driver=new FirefoxDriver();
	
	}
	@BeforeMethod(groups= {"smoke Test","regression Test"})
	public void ConfigBM() throws Throwable {
		System.out.println("login");
		Properties pobj=flib.getPropertyObj();
		String url=pobj.getProperty("url");
		String username=pobj.getProperty("username");
		String password=pobj.getProperty("password");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
}
	@AfterMethod(groups= {"smoke Test","regression Test"})
	public void ConfigAM() {
		Actions act=new Actions(driver);
		WebElement wb=driver.findElement(By.xpath("//td[@class=\"genHeaderSmall\"]/following-sibling::td[1]/img"));
		act.moveToElement(wb).perform();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		System.out.println("logout");

	}
	@AfterClass(groups= {"smoke Test","regression Test"})
	void ConfigAC() {
		driver.close();
	}
	
	
	

}
