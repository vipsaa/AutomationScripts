package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PimPage {
	/**
	 * This is a Business Library for PIM page
	 * @author asta
	 * @version 5.1.1
	 * 
	 */
		@FindBy(xpath = "(//input[@placeholder='Type for hints...'])[1]")
		private WebElement empname;
		
		@FindBy (xpath = "(//input[@class=\"oxd-input oxd-input--active\"])[2]")
		private WebElement empid;
		
		@FindBy(xpath = "(//input[@placeholder='Type for hints...'])[2]")
		private WebElement supname;

		public PimPage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}

		public WebElement getEmpname() {
			return empname;
		}

		public WebElement getEmpid() {
			return empid;
		}

		public WebElement getSupname() {
			return supname;
		}
		
		public void validinputsonpimpage(String ename, String eid, String sname) {
			getEmpname().sendKeys(ename);
			getEmpid().sendKeys(eid);
			getSupname().sendKeys(sname);
		}
		
		
}
