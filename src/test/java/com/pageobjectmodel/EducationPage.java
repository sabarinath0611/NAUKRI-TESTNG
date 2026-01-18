package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelements.EducationInterfaceElements;
import com.pageobjectmanager.PageObjectManager;

public class EducationPage extends Base_Class implements EducationInterfaceElements {
	
	@FindBy(xpath=addEducation_xpath)
	private WebElement addEducation;
	
	@FindBy(id=education_id)
	private WebElement education;
	
	@FindBy(id=university_id)
	private WebElement university;
	
	@FindBy(id=course_id)
	private WebElement course;
	
	@FindBy(id=specialisation_id)
	private WebElement specialisation;
	
	@FindBy(id=duration_id)
	private WebElement duration;
	
	@FindBy(xpath=endDuration_xpath)
	private WebElement endDuration;
	
	@FindBy(xpath=cancel_xpath)
	private WebElement cancel;
	
	public EducationPage() {
		PageFactory.initElements(driver, this);
	}
	public void educationPage() throws InterruptedException, IOException {
	    Thread.sleep(3000);
		clickElement(addEducation);
		
		Thread.sleep(3000);
		passInputs(education,PageObjectManager.getPageObjectManager().getExcelUtility().getCellValue("DATA", "ID", "Education"));
		passInputs(university,PageObjectManager.getPageObjectManager().getExcelUtility().getCellValue("DATA", "ID", "University"));
		passInputs(course, PageObjectManager.getPageObjectManager().getExcelUtility().getCellValue("DATA", "ID", "Course"));
		passInputs(specialisation, PageObjectManager.getPageObjectManager().getExcelUtility().getCellValue("DATA", "ID", "Specialisation"));
		passInputs(duration,PageObjectManager.getPageObjectManager().getExcelUtility().getCellValue("DATA", "ID", "Duration"));
		passInputs(endDuration, PageObjectManager.getPageObjectManager().getExcelUtility().getCellValue("DATA", "ID", "EndDuration"));
		Thread.sleep(3000);
		scroll_JavaScript("click",cancel);
		
	}
		

}
