package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelements.LogoutInterfaceElements;

public class LogoutPage extends Base_Class implements LogoutInterfaceElements {
	
	@FindBy(xpath=profileIcon_xpath)
	private WebElement profileIcon;
	
	@FindBy(xpath=logout_xpath)
	private WebElement logout;

	public LogoutPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void logout() {
		explicitWait(3, profileIcon);
		scroll_JavaScript("click",profileIcon);
		explicitWait(3, logout);
        scroll_JavaScript("click",logout);
	}
}
