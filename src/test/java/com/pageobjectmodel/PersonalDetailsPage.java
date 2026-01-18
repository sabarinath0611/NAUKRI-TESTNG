package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelements.PersonalDetailsInterfaceElements;
import com.pageobjectmanager.PageObjectManager;
import com.utility.ExcelUtility;

public class PersonalDetailsPage extends Base_Class implements PersonalDetailsInterfaceElements {
	
	@FindBy(xpath=editIcon_xpath)
	private WebElement editIcon;
	
	@FindBy(id=address_id)
	private WebElement address;
	
	@FindBy(id=hometown_id)
	private WebElement hometown;
	
	@FindBy(id=pincode_id)
	private WebElement pincode;
	
	
	@FindBy(id=saveBtn_id)
	private WebElement saveBtn;
	
	public PersonalDetailsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void personaDetails() throws IOException {
		explicitWait(3, editIcon);
		scroll_JavaScript("click",editIcon);
		implicitWait(3);
		passInputs(address,PageObjectManager.getPageObjectManager().getExcelUtility().getCellValue("DATA", "ID", "Address"));
		passInputs(hometown,PageObjectManager.getPageObjectManager().getExcelUtility().getCellValue("DATA", "ID", "Hometown"));
		passInputs(pincode,PageObjectManager.getPageObjectManager().getExcelUtility().getCellValue("DATA", "ID", "Pincode"));
		explicitWait(3, saveBtn);
		clickElement(saveBtn);
	}

}
