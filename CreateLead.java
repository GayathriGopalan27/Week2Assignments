package week2day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps");
	driver.manage().window().maximize();
	// to locate a element
	
	 WebElement eleUsername = driver.findElementById("username");
	 eleUsername.sendKeys("Demosalesmanager");
	 WebElement elePassword = driver.findElementById("password");
	 elePassword.sendKeys("crmsfa");
	 
	 driver.findElementByClassName("decorativeSubmit").click();
	 driver.findElementByLinkText("CRM/SFA").click();
	 driver.findElementByLinkText("Leads").click();
	 driver.findElementByLinkText("Create Lead").click();
	 
	 driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("Infy");
	 driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Gayathri");
	 driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("Gopalan");
	 WebElement eleDD1 =driver.findElementById("createLeadForm_dataSourceId");
	 Select dd1= new Select(eleDD1);
	 dd1.selectByValue("LEAD_EMPLOYEE");
	 driver.findElementByXPath("//input[@name='annualRevenue']").sendKeys("500000");
	 WebElement eleDD2 =driver.findElementById("createLeadForm_industryEnumId");
	 Select dd2= new Select(eleDD2);
	 dd2.selectByValue("IND_SOFTWARE");
	 WebElement eleDD3 =driver.findElementById("createLeadForm_ownershipEnumId");
	 Select dd3= new Select(eleDD3);
	 dd3.selectByVisibleText("S-Corporation");
	 driver.findElementByXPath("//textarea[@id='createLeadForm_description']").sendKeys("Selenium Automation Tester");
	 WebElement eleDD4 =driver.findElementById("createLeadForm_marketingCampaignId");
	 Select dd4= new Select(eleDD4);
	 dd4.selectByIndex(6);
	 WebElement eleDD5 =driver.findElementById("createLeadForm_generalStateProvinceGeoId");
	 Select dd5= new Select(eleDD5);
	 dd5.selectByVisibleText("Texas");
	 driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneNumber']").sendKeys("+9123237263");

	 driver.findElementByXPath("//input[@id='createLeadForm_primaryEmail']").sendKeys("abcd@gmail.com");

	 
	 driver.findElementByXPath("//input[@class='smallSubmit']").click();
	 
	 String text = driver.findElementById("viewLead_companyName_sp").getText();
	 System.out.println(text); 
	 
	 
	
	}

}
