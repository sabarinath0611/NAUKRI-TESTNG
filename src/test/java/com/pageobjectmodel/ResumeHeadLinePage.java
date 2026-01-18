package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelements.ResumeHeadLineInterfaceElements;
import com.pageobjectmanager.PageObjectManager;

public class ResumeHeadLinePage extends Base_Class implements ResumeHeadLineInterfaceElements{
	
	@FindBy(xpath=resumeHeadLine_xpath)
    private WebElement resumeHeadLine;
	
	@FindBy(id=resumeHeadLineText_id)
	private WebElement resumeHeadLineText;
	
	@FindBy(xpath=save_xpath)
	private WebElement save;
	
	 public ResumeHeadLinePage() {
			PageFactory.initElements(driver, this);
     
}
	 
	 public  void resumeHeadLine() throws IOException {
		 
		 clickElement(resumeHeadLine);
//		 resumeHeadLineText.clear();
		 passInputs(resumeHeadLineText, PageObjectManager.getPageObjectManager().getExcelUtility().getCellValue("DATA", "ID", "ResumeHeadLine"));
		 
		 clickElement(save);
		 
	 }

	 
	 
}