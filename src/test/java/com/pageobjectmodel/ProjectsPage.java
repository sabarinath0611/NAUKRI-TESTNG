package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelements.ProjectsInterfaceElements;
import com.pageobjectmanager.PageObjectManager;
import com.utility.ExcelUtility;

public class ProjectsPage extends Base_Class implements ProjectsInterfaceElements{
	
	@FindBy(xpath=addProject_xpath)
	private WebElement addProject;
	
	@FindBy(id=projectTitle_id)
	private WebElement projectTitle;
	
	@FindBy(id=clientName_id)
	private WebElement clientName;
	
	@FindBy(xpath=cancel_xpath)
	private WebElement cancel;
	
	 public ProjectsPage() {
			PageFactory.initElements(driver, this);

}
	 
	 
	 public void projectsPage() throws IOException, InterruptedException {
		 explicitWait(3, addProject);
		 scroll_JavaScript("click", addProject);
		 implicitWait(3);
		 passInputs(projectTitle, PageObjectManager.getPageObjectManager().getExcelUtility().getCellValue("DATA", "ID", "ProjectTitle"));
		 implicitWait(3);
		 passInputs(clientName,PageObjectManager.getPageObjectManager().getExcelUtility().getCellValue("DATA", "ID", "ClientName"));
		 explicitWait(3, cancel);
		 clickElement(cancel);
	 }
	 
	 
	 
	 
	 
	 
}