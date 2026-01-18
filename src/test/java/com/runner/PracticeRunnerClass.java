package com.runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.base.Base_Class;

public class PracticeRunnerClass extends Base_Class{
	@Test
	private void chrome() {
		launchBrowser("chrome");
		launchUrl("https://www.amazon.in/");
		System.out.println("BrowserId :" + Thread.currentThread().getId() );
		
	}
	@Ignore
	@Test
	private void firefox() {
		launchBrowser("firefox");
		launchUrl("https://www.amazon.in/");
		System.out.println("BrowserId :" + Thread.currentThread().getId() );
		
	}
	@Test
	private void edge() {
		
		launchBrowser("edge");
		launchUrl("https://www.amazon.in/");
		System.out.println("BrowserId :" + Thread.currentThread().getId() );
	}
} 
