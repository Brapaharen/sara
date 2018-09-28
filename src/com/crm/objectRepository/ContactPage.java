package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage {
	@FindBy(xpath="//img[@title=\"Create Contact...\"]")
	private WebElement createcontact;
	@FindBy(name="salutationtype")
	private WebElement seldrop;
	public WebElement getCreatecontact() {
		return createcontact;
	}
	public WebElement getSeldrop() {
		return seldrop;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getOrganiZationName() {
		return OrganiZationName;
	}
	@FindBy(name="firstname")
	private WebElement firstname;
	@FindBy(name="lastname")
	private WebElement lastname;
	@FindBy(xpath="//img[contains(@onclick,\"Popup\")]")
	private WebElement  OrganiZationName;
	

	

}
