package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelements.LoginPageInterfaceElements;
import com.pageobjectmanager.PageObjectManager;

public class LoginPage extends Base_Class implements LoginPageInterfaceElements {

	@FindBy(id= username_id)
	private WebElement username;
	
	@FindBy(xpath=password_xpath)
	private WebElement password;
	
	@FindBy(xpath=login_xpath)
	private WebElement login;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void validLogin() throws IOException, InterruptedException {
		passInputs(username, PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("username"));
		passInputs(password, PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("password"));
		clickElement(login);
		
	}
	
	
}
