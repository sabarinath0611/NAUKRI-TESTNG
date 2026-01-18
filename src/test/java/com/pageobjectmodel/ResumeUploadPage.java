package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelements.ResumeUploadInterfaceElements;

public class ResumeUploadPage extends Base_Class implements ResumeUploadInterfaceElements {
	
	@FindBy(xpath=upload_xpath)
	private WebElement upload;
	
	public ResumeUploadPage() {
		PageFactory.initElements(driver, this);

}
	
	public void resumeUpload() throws InterruptedException {
		
		Thread.sleep(3000);
		clickElement(upload);
		fileUpload("C:\\Users\\Admin\\Downloads\\Simple Books API (4)");
	}
	
	
	
	
	
	
	
}