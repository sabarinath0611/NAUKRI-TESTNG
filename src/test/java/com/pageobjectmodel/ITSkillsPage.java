
	package com.pageobjectmodel;

	import java.io.IOException;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import com.base.Base_Class;
	import com.interfaceelements.ItSkillsInterfaceElements;
	import com.pageobjectmanager.PageObjectManager;
	import com.utility.ExcelUtility;

	public class ITSkillsPage extends Base_Class implements ItSkillsInterfaceElements {

		@FindBy(xpath=addDetails_xpath)
		private WebElement addDetails;
		
		
		@FindBy(id=softwareName_id)
		private WebElement softwareName;
		
		
		@FindBy(id=save_id)
		private WebElement save;
		
		public ITSkillsPage() {
			PageFactory.initElements(driver, this);
		
	}
		
		public void ITSkillPage() throws IOException, InterruptedException {
	        explicitWait(3, addDetails);
			clickElement(addDetails);;
	       implicitWait(3);
			passInputs(softwareName, PageObjectManager.getPageObjectManager().getExcelUtility().getCellValue("DATA","ID","SoftwareName"));
			explicitWait(3, save);
			clickElement(save);
			
			
		}
		
	}


