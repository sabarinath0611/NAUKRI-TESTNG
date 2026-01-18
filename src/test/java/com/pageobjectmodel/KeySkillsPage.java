package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelements.KeySkillsInterfaceElements;
import com.pageobjectmanager.PageObjectManager;
import com.utility.ExcelUtility;

public class KeySkillsPage extends Base_Class implements KeySkillsInterfaceElements {
	
	@FindBy(xpath=keySkills_xpath)
	private WebElement keySkills;

	@FindBy(id=addSkills_id)
	private WebElement addSkills;
	
	@FindBy(xpath=save_xpath)
	private WebElement save;
	
	
	 public KeySkillsPage() {
			PageFactory.initElements(driver, this);
}
	 
	 public void keySkills() throws IOException, InterruptedException {
		  Thread.sleep(3000);
		  clickElement(keySkills);
		  clickElement(addSkills);
		  Thread.sleep(3000);
		  passInputs(addSkills,PageObjectManager.getPageObjectManager().getExcelUtility().getCellValue("DATA", "ID", "AddSkills"));
		  
		  
		  clickElement(save);
		 
	 }
	 
	 
	 
	 
	 
}