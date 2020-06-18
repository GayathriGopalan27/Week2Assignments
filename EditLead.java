package week2day1;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
	public static void main(String[] args) throws InterruptedException {
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
		 driver.findElementByXPath("//a[contains(text(),'Find')]").click();
		 driver.findElementByXPath("(//label[(text()='Company Name:')])[2]//following::input[1]").sendKeys("Infy");
		 driver.findElementByXPath("//button[contains(text(),'Find')]").click();
		 Thread.sleep(3000);
		 driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		 driver.findElementByXPath("//a[text()='Edit']").click();
		 String text = driver.findElementById("updateLeadForm_companyName").getText();
		 System.out.println(text);
		 
		 driver.findElementById("updateLeadForm_companyName").clear();
		 driver.findElementById("updateLeadForm_companyName").sendKeys("Infosys");
		 driver.findElementByXPath("//input[@value='Update']").click();
		 String text2 = driver.findElementById("viewLead_companyName_sp").getText();
		 System.out.println(text2); 
		 
		 
		 
	}

}
