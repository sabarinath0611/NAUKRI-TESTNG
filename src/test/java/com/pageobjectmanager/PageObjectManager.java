package com.pageobjectmanager;

import com.pageobjectmodel.CareerProfileClass;
import com.pageobjectmodel.EducationPage;
import com.pageobjectmodel.EmployeementPage;
import com.pageobjectmodel.ITSkillsPage;
import com.pageobjectmodel.KeySkillsPage;
import com.pageobjectmodel.LoginPage;
import com.pageobjectmodel.LogoutPage;
import com.pageobjectmodel.PersonalDetailsPage;
import com.pageobjectmodel.ProfileSummaryPage;
import com.pageobjectmodel.ProfileUpdatePage;
import com.pageobjectmodel.ProjectsPage;
import com.pageobjectmodel.ResumeHeadLinePage;
import com.pageobjectmodel.ResumeUploadPage;
import com.utility.ExcelUtility;
import com.utility.FileReaderManager;

public class PageObjectManager {
	private static final String ExcelUtility = null;

	private static PageObjectManager pageObjectManager;

	private FileReaderManager fileReader;
	private LoginPage login;
	private ProfileUpdatePage profileupdate;
	private ResumeUploadPage resumeUpload;
	private ResumeHeadLinePage resumeHeadLine;
	private KeySkillsPage keySkills;
	private EmployeementPage employeement;
	private EducationPage education;
	private ITSkillsPage ITskills;
	private ProjectsPage projects;
	private ProfileSummaryPage profileSummary;
	private CareerProfileClass careerProfile;
	private PersonalDetailsPage personalDetails;
	private LogoutPage logout;
	private ExcelUtility excelUtility;
	
	
  public ExcelUtility getExcelUtility() {
	  
	  if(excelUtility == null) {
		  excelUtility = new ExcelUtility();
	  }
		return excelUtility;
	}








  public LogoutPage getLogout() {
	  
	  if(logout == null) {
		  logout= new LogoutPage();
	  }
		return logout;
	}





	





  public PersonalDetailsPage getPersonalDetails() {
	  if(personalDetails==null) {
		  personalDetails=new PersonalDetailsPage();
	  }
	  
	  
		return personalDetails;
	}


	


  public CareerProfileClass getCareerProfile() {
	  if(careerProfile==null) {
		  careerProfile = new CareerProfileClass();
	  }
	  
		return careerProfile;
	}
	

  public ProfileSummaryPage getProfileSummary() {
	  if(profileSummary==null) {
		  profileSummary = new ProfileSummaryPage();
	  }
	  
		return profileSummary;
	}
	
  public ProjectsPage getProjects() {
	  if(projects == null) {
		  projects =new ProjectsPage();
	  }
		return projects;
	}
 public ITSkillsPage getITskills() {
	  
	  if(ITskills==null) {
		  ITskills = new ITSkillsPage();
	  }
		return ITskills;
	}
  public EducationPage getEducation() {
		   
		   if(education == null) {
			   education = new EducationPage();
		   }
		return education;
	}


 public EmployeementPage getEmployeement() {
		   
		   if(employeement == null) {
			   employeement = new EmployeementPage();
		   }
		return employeement;
	}

   public KeySkillsPage getKeySkills() {
		   if (keySkills == null) {
			   keySkills = new KeySkillsPage();
		   }
		   
		return keySkills;
	}
   public ResumeUploadPage getResumeUpload() {
		   if(resumeUpload == null) {
			   resumeUpload = new ResumeUploadPage();
		   }
		   
		return resumeUpload;
	}

          public ProfileUpdatePage getProfileupdate() {
		   if(profileupdate==null) {
			   profileupdate = new ProfileUpdatePage();
		   }
		return profileupdate;
	}


	


	   public LoginPage getLogin() {
		if(login==null) {
			login= new LoginPage();
		}
		return login;
	}

	
	public FileReaderManager getFileReader() {
		if(fileReader == null) {
			fileReader = new FileReaderManager();
		}
		return fileReader;
	}
	
	public static PageObjectManager getPageObjectManager() {
		if(pageObjectManager == null) {
			pageObjectManager= new PageObjectManager();
		}
		return pageObjectManager;
		
	}

	public ResumeHeadLinePage getResumeHeadLine() {
		if(resumeHeadLine==null) {
			resumeHeadLine= new ResumeHeadLinePage();
		}
		
		return resumeHeadLine;
	
}
 
	










	
	}











	
