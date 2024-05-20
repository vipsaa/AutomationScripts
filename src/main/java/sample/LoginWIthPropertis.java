package sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericLibraryOrUtility.PropertiesUtility;

public class LoginWIthPropertis {
	public static void main(String[] args)throws Exception {
		PropertiesUtility putil = new PropertiesUtility();
		String URL = putil.getDataFromProperties("url");
		String USERNAME = putil.getDataFromProperties("username");
		String PASSWORD = putil.getDataFromProperties("password");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(URL);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(USERNAME,Keys.TAB,PASSWORD,Keys.ENTER);
	
	
	
	
	}

}
