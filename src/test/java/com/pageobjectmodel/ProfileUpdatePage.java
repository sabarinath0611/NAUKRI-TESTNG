package com.pageobjectmodel;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelements.ProfileUpdateInterfaceElements;


public class ProfileUpdatePage extends Base_Class implements ProfileUpdateInterfaceElements {
	
	@FindBy(xpath=profileIcon_xpath)
	private WebElement profileIcon;
	
   @FindBy(xpath=viewupdate_xpath)
    private WebElement viewupdate;
    
 //  @FindBy(xpath= profileedit_xpath)
  // private WebElement editOption;
    
 //  @FindBy(id=saveButton_id)
  // private WebElement saveButton;
    
    public ProfileUpdatePage() {
		PageFactory.initElements(driver, this);
}

    public void updateProfile() throws  InterruptedException {
    	
        Thread.sleep(3000);
        clickElement(profileIcon);
        Thread.sleep(3000);
    	clickElement(viewupdate);
    //	clickElement(editOption);
    //	clickElement(saveButton);
        
    }

	}
    	
    	
    	
    	
    
    
    
