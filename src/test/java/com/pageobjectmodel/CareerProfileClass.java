package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelements.CareerProfileInterfaceElements;
import com.pageobjectmanager.PageObjectManager;
import com.utility.ExcelUtility;

public class CareerProfileClass extends Base_Class implements CareerProfileInterfaceElements {
	
	@FindBy(xpath=editIcon_xpath)
	private WebElement editIcon;
	
	@FindBy(id=department_id)
	private WebElement department;
	
	@FindBy(id=roleCategory_id)
	private WebElement roleCategory;
	
	@FindBy(id=workLocation_id)
	private WebElement workLocation;
	
	@FindBy(xpath=salary_xpath)
	private WebElement salary;
	
	@FindBy(id=save_id)
	private WebElement save;
	
	public CareerProfileClass() {
		PageFactory.initElements(driver, this);
	}
	
     public void careerProfileClass() throws IOException {
  	      explicitWait(3, editIcon);
    	 scroll_JavaScript("click", editIcon);
    	 implicitWait(3);
    	 passInputs(department,PageObjectManager.getPageObjectManager().getExcelUtility().getCellValue("DATA", "ID", "Department"));
    	 passInputs(roleCategory,PageObjectManager.getPageObjectManager().getExcelUtility().getCellValue("DATA", "ID", "RoleCategory"));
//    	 passInputs(workLocation,PageObjectManager.getPageObjectManager().getExcelUtility().getCellValue("DATA", "ID", "WorkLocation"));
   // 	 implicitWait(3);
    	 passInputs(salary,PageObjectManager.getPageObjectManager().getExcelUtility().getCellValue("DATA","ID", "Salary"));
    	 explicitWait(3, save);
    	 clickElement(save);
    	 
     }
}
