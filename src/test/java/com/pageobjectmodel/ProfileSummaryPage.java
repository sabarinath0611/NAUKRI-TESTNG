package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelements.ProfileSummaryInterfaceElements;
import com.pageobjectmanager.PageObjectManager;
import com.utility.ExcelUtility;

public class ProfileSummaryPage extends Base_Class implements ProfileSummaryInterfaceElements{
	
	@FindBy(xpath=addProfileSummary_xpath)
	private WebElement addProfileSummary;
	
	
	@FindBy(id=profileSummary_id)
	private WebElement profileSummary;
	
	@FindBy(xpath=save_xpath)
	private WebElement save;
	
	 public ProfileSummaryPage() {
			PageFactory.initElements(driver, this);
}
	public void profileSummary() throws IOException, InterruptedException {
        explicitWait(3, addProfileSummary);
		clickElement(addProfileSummary);
		implicitWait(3);
		passInputs(profileSummary, PageObjectManager.getPageObjectManager().getExcelUtility().getCellValue("DATA", "ID", "ProfileSummary"));
		explicitWait(3, save);
		clickElement(save);
	}
	

}
