package com.runner;

import java.io.IOException;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.base.Base_Class;
import com.listner.ITestListnerClass;
import com.pageobjectmanager.PageObjectManager;

public class NaukriRunner extends Base_Class {
	
  @BeforeTest
	public void setupProperty() throws IOException {
		launchBrowser(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("browser"));
		launchUrl(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("url"));
	}
  @Test(priority = -1)
   public void validLogin() throws IOException, InterruptedException {
	  PageObjectManager.getPageObjectManager().getLogin().validLogin();
  }
  @Test(priority =0)
   public void updateProfile() throws IOException, InterruptedException {
   PageObjectManager.getPageObjectManager().getProfileupdate().updateProfile();
   }
  
  @Test(priority =1)
   public void resumeUpload() throws InterruptedException {
	 PageObjectManager.getPageObjectManager().getResumeUpload().resumeUpload();
 }
  
  
  @Test(priority= 2)
  public void resumeHeadLine() throws IOException {
	  PageObjectManager.getPageObjectManager().getResumeHeadLine().resumeHeadLine();
  }
  @Test(priority=3)
  
  public void keySkills() throws IOException, InterruptedException {

 PageObjectManager.getPageObjectManager().getKeySkills().keySkills();
 
 
  }
   @Test(priority=4) 
     public void employeement() throws InterruptedException, IOException {
    	PageObjectManager.getPageObjectManager().getEmployeement().employeementPage();
    }
     @Test(priority=5)
    public void education() throws InterruptedException, IOException {
    	PageObjectManager.getPageObjectManager().getEducation().educationPage();
    }
   @Test(priority=6)
     public void itSkills() throws IOException, InterruptedException {
    	 PageObjectManager.getPageObjectManager().getITskills().ITSkillPage();
     }

     @Test(priority=7)
     
     public void projects() throws IOException, InterruptedException {
    	 PageObjectManager.getPageObjectManager().getProjects().projectsPage();
   }
    @Test(priority=8)
    public void profileSummary() throws IOException, InterruptedException {
  	 PageObjectManager.getPageObjectManager().getProfileSummary().profileSummary();
  
  	}
     @Test
     
     public void careerProfile() throws IOException {
     PageObjectManager.getPageObjectManager().getCareerProfile().careerProfileClass();
     }
     
     
     
    @Test(priority=10)
    public void personalDetails() throws IOException {
       PageObjectManager.getPageObjectManager().getPersonalDetails().personaDetails();
    }
     @Test(priority=11)
     public void logout() {
  	 PageObjectManager.getPageObjectManager().getLogout().logout();
     }
}