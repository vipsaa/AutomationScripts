package genericLibraryOrUtility;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class SeleniumUtility {
	/**
	 * This method is to capture screenshot
	 * @param name
	 * @throws Exception
	 */
	public void captureSS(String name) throws Exception {
		
		TakesScreenshot ts = (TakesScreenshot)BaseClass.driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest= new File(".//ScreenShotsFolder\\" +
		name +".png" );
		Files.copy(src, dest);
		}
	/**
	 * this method is to maximize the window
	 * @param driver
	 */
		public void windowMaximization(WebDriver driver)
       { 
			driver.manage().window().maximize();
			}
		
		/**
		 * This method to pass the implicit wait duration
		 * @param driver
		 * @param sec
		 */
		public void implicitWait(WebDriver driver, int sec) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
		}
		
		/*Select Class methods*/
		/**
		 * this method is handle dropdown with index
		 * @param element
		 * @param indexno
		 */
		public void selectWithIndex(WebElement element, int indexno) {
			Select s = new Select(element);
			s.selectByIndex(indexno);
			
		}
		/**
		 * this method is to handle dropdown with visibletext
		 * @param element
		 * @param text
		 */
		public void selectWithVisibleText(WebElement element, String text) {
			Select s = new Select(element);
			s.selectByVisibleText(text);
			
		}
		/**
		 * This method is to handle dropdown with value
		 * @param element
		 * @param value
		 */
		public void selectWithValue(WebElement element, String value) {
			Select s = new Select(element);
			s.selectByValue(value);
			
		}
		/**
		 * This method is to perform de-select operation by index
		 * @param element
		 * @param indexno
		 */
		public void deSelectWithIndex(WebElement element, int indexno) {
			Select s = new Select(element);
			s.deselectByIndex(indexno);
			
		}
		/**
		 * This method is to perform de-select operation by visible text
		 * @param element
		 * @param text
		 */
		public void deSelectWithVisibleText(WebElement element, String text) {
			Select s = new Select(element);
			s.deselectByVisibleText(text);
			
		}
		/**
		 * This method is to perform de-select operation by value
		 * @param element
		 * @param value
		 */
		public void deSelectWithValue(WebElement element, String value) {
			Select s = new Select(element);
			s.deselectByValue(value);
			
		}
		/*
		 * Actions Class Methods/Mouse Action Methods
		 */
		/**
		 * this method is to move mouse towards element
		 * @param driver
		 * @param element
		 */
		public void moveTowardsElement(WebDriver driver,WebElement element) {
			Actions act = new Actions(driver);
			act.moveToElement(element);
			}
		
		/**
		 * this method is to perform right click on an element
		 * @param driver
		 * @param element
		 */
		public void rightClick(WebDriver driver , WebElement element) {
			Actions act = new Actions(driver);
			act.contextClick();
		}
		/**
		 * this method we use to perform click operation
		 * @param driver
		 * @param element
		 */
		public void clickOnElement(WebDriver driver, WebElement element) {
			Actions act = new Actions(driver);
			act.click(element);
			
		}
		/**
		 * this method we use to perform double click on an element
		 * @param driver
		 * @param element
		 */
		public void doubleClick(WebDriver driver, WebElement element) {
			Actions act = new Actions(driver);
			act.doubleClick();
		}
		/**
		 * this method is used to drag an element and drop it to another point
		 * @param driver
		 * @param src
		 * @param dest
		 */
		public void dragAndDropOP(WebDriver driver, WebElement src , WebElement dest) {
			Actions act = new Actions(driver);
			act.dragAndDrop(src, dest);
		
		}
		/**
		 * this method we use to handle slider
		 * @param driver
		 * @param src
		 * @param x
		 * @param y
		 */
		public void sliderHandling(WebDriver driver, WebElement src, int x , int y ) {
			Actions act = new  Actions(driver);
			act.dragAndDropBy(src, x, y);
		}
		/**
		 * this method we use perform mouse action
		 * @param driver
		 */
		public void toPerformMouseAction(WebDriver driver) {
			Actions act = new Actions(driver);
			act.perform();	
		}
		/**
		 * this method we use to scroll to an element
		 * @param driver
		 * @param element
		 */
		public void scrollUptoAnElement(WebDriver driver , WebElement element) {
			Actions act = new Actions(driver);
			act.scrollToElement(element);
		}
		/*
		 * Alert Pop-UP methods
		 */
		/**
		 * this method we use it to accept the alert
		 * @param driver
		 */
		public void acceptTheAlert(WebDriver driver) {
			driver.switchTo().alert().accept();
		}
		/**
		 * this method we use to dismiss the popup
		 * @param driver
		 */
		public void dismissTheAlert(WebDriver driver) {
			driver.switchTo().alert().dismiss();
		}
		
		/**
		 * this method is send the message from popup
		 * @param driver
		 * @param mssg
		 */
		
		public void sendAlertMessage(WebDriver driver, String mssg) {
			driver.switchTo().alert().sendKeys(mssg);
		}
		/**
		 * this method to fetch the messages from alert popup
		 * @param driver
		 */
		public void fetchAlertMessage(WebDriver driver) {
			driver.switchTo().alert().getText();
		}
		
}
