package com.base;

import java.awt.Desktop;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class Base_Class {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static ExtentReports extentreports;

	public static File file;

	protected static WebDriver launchBrowser(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			} else if (browserName.equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
			}
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURS DURING BROWSER LAUNCH");
		}
		driver.manage().window().maximize();
		return driver;
	}

	protected static void launchUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURS DURING URL LAUNCH");
		}
	}

	protected void closeBrowser() {
		try {
			driver.close();
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURS DURING CLOSING OF THE BROWSER");
		}
	}

	protected static void quitBrowser() {
		try {
			driver.quit();
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURS DURING QUITTING THE BROWSER");
		}
	}

	protected static void passInputs(WebElement element, String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {

			Assert.fail("ERROR : OCCURS DURING PASSING THE VALUE");
		}
	}

	protected static void clickElement(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected static void navigatePage(String type, String url) {
		try {
			if (type.equalsIgnoreCase("to")) {
				driver.navigate().to(url);
			} else if (type.equalsIgnoreCase("back")) {
				driver.navigate().back();
			} else if (type.equalsIgnoreCase("forward")) {
				driver.navigate().forward();
			} else if (type.equalsIgnoreCase("refresh")) {
				driver.navigate().refresh();
			}
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURS DURING WHILE NAVIGATING TO THE URL");
		}
	}

	protected static void windowHandling(int num) {
		try {
			List<String> allWindow = new ArrayList(driver.getWindowHandles());
			driver.switchTo().window(allWindow.get(num));
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURS DURING WINDOWHANDLING");
		}
	}

	protected static void selectOptions(WebElement element, String type, String value) {
		try {
			Select select = new Select(element);
			boolean multiple = select.isMultiple();
			System.out.println(multiple);
			if (type.equalsIgnoreCase("text")) {
				select.selectByVisibleText(value);
			} else if (type.equalsIgnoreCase("index")) {

				select.selectByIndex(Integer.parseInt(value));
			} else if (type.equalsIgnoreCase("value")) {
				select.selectByValue(value);
			}
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURS DURING SELECTION");
		}
	}

	protected static void deselectOptions(WebElement element, String type, String value) {
		try {
			Select select = new Select(element);
			if (type.equalsIgnoreCase("text")) {
				select.deselectByVisibleText(value);
			} else if (type.equalsIgnoreCase("index")) {
				select.deselectByIndex(Integer.parseInt(value));
			} else if (type.equalsIgnoreCase("value")) {
				select.deselectByValue(value);
			}
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURS DURING  DE SELECTION");
		}
	}

	protected static void getOptions(WebElement element) {
		try {
			Select select = new Select(element);
			List<WebElement> options = select.getOptions();
			for (WebElement alloptions : options) {
				String text = alloptions.getText();
				System.out.println(text);
			}
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURS DURING GETTING OPTIONS");
		}
	}

	protected static void getFirstSelectedOptions(WebElement element) {
		try {
			Select select = new Select(element);
			WebElement firstSelectedOption = select.getFirstSelectedOption();
			String text = firstSelectedOption.getText();
			System.out.println(text);
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURS DURING GETTING FIRST SELECTED OPTIONS");
		}
	}

	protected static void getAllSelectedOptions(WebElement element) {
		try {
			Select select = new Select(element);
			List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
			for (WebElement allselopt : allSelectedOptions) {
				String text = allselopt.getText();
				System.out.println(text);
			}
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURS DURING GETTING ALL SELECTED OPTIONS");
		}
	}

	protected static void getBrowserDetails(String details) {
		try {
			if (details.equalsIgnoreCase("title")) {
				String title = driver.getTitle();
				System.out.println("Title is" + title);
			} else if (details.equalsIgnoreCase("current url")) {
				String current_Url = driver.getCurrentUrl();
				System.out.println("Current Url is" + current_Url);
			} else if (details.equalsIgnoreCase("pagesource")) {
				String page_Source = driver.getPageSource();
				System.out.println("Page Source is" + page_Source);
			}
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURS DURING WHILE GETTING THE DETAILS");
		}
	}

	protected static void getText(WebElement element) {
		try {
			String text = element.getText();
			System.out.println(text);
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURS DURING GETTING THE TEXT");
		}
	}

	protected static void getAttribute(WebElement element, String attributename) {
		try {
			String attribute = element.getAttribute(attributename);
			System.out.println(attribute);
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURS DURING GETTING THE ATTRIBUTE");
		}
	}

	protected static void isDisplayed(WebElement element, String type) {
		try {
			if (type.equalsIgnoreCase("selected")) {
				boolean selected = element.isSelected();
				System.out.println(selected);
			} else if (type.equalsIgnoreCase("enabled")) {
				boolean enabled = element.isEnabled();
				System.out.println(enabled);
			} else if (type.equalsIgnoreCase("displayed")) {
				boolean displayed = element.isDisplayed();
				System.out.println(displayed);
			}
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURS DURING WHILE CHECKING THE ELEMENT");
		}
	}

	protected static void getAlert(String type) {
		try {
			if (type.equalsIgnoreCase("accept")) {
				driver.switchTo().alert().accept();
			} else if (type.equalsIgnoreCase("dismiss")) {
				driver.switchTo().alert().dismiss();
			} else if (type.equalsIgnoreCase("text")) {
				String text = driver.switchTo().alert().getText();
				System.out.println(text);
			}
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURS DURING THE ALERT");
		}
	}

	protected static void screenShot(String name) {
		try {
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(screenshot,
					new File("C:\\Users\\Admin\\eclipse-workspace\\MavenProject\\IPT_Screenshots\\" + name + ".png"));
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURS DURING TAKING SCREENSHOT");
		}
	}

	protected static void implicitWait(int seconds) {
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURS DURING IMPLICIT WAIT");
		}
	}

	protected static void explicitWait(int seconds, WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
			wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURS DURING EXPLICIT WAIT");
		}
	}

	protected static void switchToFrameByIndex(int index) {
		try {
			driver.switchTo().frame(index);
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURS DURING SWITCH TO FRAME BY INDEX");
		}
	}

	protected static void switchToFrameByName(String name) {
		try {
			driver.switchTo().frame(name);
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURS DURING SWITCH TO FRAME BY NAME");
		}
	}

	protected static void switchToFrameByWebelement(WebElement element) {
		try {
			driver.switchTo().frame(element);
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURS DURING SWITCH TO FRAME BY WEB ELEMENT");
		}
	}

	protected static void mouseActions(String type, WebElement element) {
		try {
			Actions action = new Actions(driver);
			if (type.equalsIgnoreCase("click")) {
				action.click(element).perform();
			} else if (type.equalsIgnoreCase("contextclick")) {
				action.contextClick(element).perform();
			} else if (type.equalsIgnoreCase("contextclick")) {
				action.doubleClick(element).perform();
			} else if (type.equalsIgnoreCase("moveto")) {
				action.moveToElement(element).perform();
			}
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURS DURING WHILE DOING THE MOUSE ACTIONS");
		}
	}

	protected static void scroll_JavaScript(String type, WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			if (type.equalsIgnoreCase("click")) {
				js.executeScript("arguments[0].click();", element);
			} else if (type.equalsIgnoreCase("value")) {
				js.executeScript("arguments[0].value='';", element);
			} else if (type.equalsIgnoreCase("scrollIntoView")) {
				js.executeScript("arguments[0].scrollIntoView();", element);
			}
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURS DURING WHILE SCROLLING THE PAGE");
		}
	}

	protected static void draganddrop(WebElement source, WebElement target) {
		try {
			Actions action = new Actions(driver);
			action.dragAndDrop(source, target).perform();
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURS DURING DRAG AND DROP");
		}
	}

	protected static void clickandholdandrelease(WebElement element1, WebElement element2) {
		try {
			Actions action = new Actions(driver);
			action.clickAndHold(element1).release(element2).perform();
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURS DURING CLICK AND HOLD AND RELEASE");
		}
	}

	protected static void keyboardenter() {
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURS DURING KEYBOARD ENTER");
		}
	}

	protected static void keyboardtab() {
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURS DURING KEYBOARD TAB");
		}
	
}
	protected static void fileUpload(String fileUploadPath) {
		try {
			Robot robot=new Robot();
			StringSelection ss=new StringSelection(fileUploadPath+ ".pdf");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			robot.delay(2000);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyPress(KeyEvent.VK_ENTER);
		}catch (Exception e) {
			Assert.fail("ERROR: OCCURD DURING FILE UPLAOD");
		}
	
	}	
		public static void extentReportStart(String location) {
			try {
			ExtentReports extentreports = new ExtentReports();
			file=new File(location);
			ExtentSparkReporter sparkReporter=new ExtentSparkReporter(file);
			extentreports.attachReporter(sparkReporter);
			extentreports.setSystemInfo("OS",System.getProperty("os.name"));
         	}
			catch(Exception e){
				Assert.fail("ERROR: OCCURD DURING EXTENT REPORT START");
			}
		}
			public static void extentReportTearDown(String location) {
				
			try {
			 extentreports.flush();
			file=new File(location);
			Desktop.getDesktop().browse((file).toURI());
			}
            catch(Exception e)
			{
				Assert.fail("ERROR: OCCURD DURING EXTENT REPORT TEAR DOWN");
			}
			}
           protected String takesScreenshot() {
           try {
        		  TakesScreenshot screenshot =(TakesScreenshot)driver;
        		  String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        		   File srcfile=screenshot.getScreenshotAs(OutputType.FILE);
        		   File destfile = new File("Screenshot\\.png" + "_" + timeStamp + ".png");
        		   FileHandler.copy(srcfile, destfile);
        		   return destfile.getAbsolutePath();
        		   
        	  }catch(Exception e) {
        		   
        		   Assert.fail("ERROR: OCCURD DURING WHILE TAKING SCREENSHOT");
        	   }
		   return null;
		  
           }
           protected static void validation(WebElement actual,String expected)
			{
			try {
				
				Assert.assertEquals(actual.getText(),expected);
				System.out.println(actual.getText());
             }
			catch(Exception e)
			{
				Assert.fail("Error: Occurs during validation");
			}
			
		
		
		
		
		
	
		
	}

}