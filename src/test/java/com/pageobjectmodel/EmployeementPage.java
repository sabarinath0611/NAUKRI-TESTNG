package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelements.EmploymentInterfaceElements;
import com.pageobjectmanager.PageObjectManager;

public class EmployeementPage extends Base_Class implements EmploymentInterfaceElements {

	@FindBy(id=addEmployment_id)
	private WebElement addEmployment;
	
	@FindBy(id= totalExperience_id)
	private WebElement totalExperience;
	
	@FindBy(id= months_id)
	private WebElement months;
	
	@FindBy(id=company_id)
	private WebElement company;
	
	@FindBy(id= jobTitle_id)
	private WebElement jobTitle;
	
	@FindBy(id=year_id)
	private WebElement year;
	
	@FindBy(id=skills_id)
	private WebElement skills;
	
//	@FindBy(id=noticePeriod_id)
//	private WebElement noticePeriod;
	
	@FindBy(xpath=cancel_xpath)
	private WebElement cancel;
	
	public EmployeementPage() {
		PageFactory.initElements(driver, this);
	
}
	
	public void employeementPage() throws InterruptedException, IOException {
		Thread.sleep(3000);
		clickElement(addEmployment);
		Thread.sleep(3000);
		passInputs(totalExperience, PageObjectManager.getPageObjectManager().getExcelUtility().getCellValue("DATA", "ID","TotalExperience"));
		passInputs(months,PageObjectManager.getPageObjectManager().getExcelUtility().getCellValue("DATA", "ID","Months"));
		passInputs(company, PageObjectManager.getPageObjectManager().getExcelUtility().getCellValue("DATA", "ID","Company"));
		passInputs(jobTitle,PageObjectManager.getPageObjectManager().getExcelUtility().getCellValue("DATA", "ID","JobTitle") );
		passInputs(year, PageObjectManager.getPageObjectManager().getExcelUtility().getCellValue("DATA", "ID","Year"));
		passInputs(skills,PageObjectManager.getPageObjectManager().getExcelUtility().getCellValue("DATA", "ID","Skills"));
		//passInputs(noticePeriod, "1 month");
		Thread.sleep(3000);
		clickElement(cancel);
		
		
		
		
	}
}






