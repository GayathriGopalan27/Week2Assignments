package week2day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeletLead {

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
		 driver.findElementByXPath("//span[text()='Email']").click();

		driver.findElementByXPath("((//label[text()='Email Address:'])//following::input)[1]").sendKeys("abc@gmail.com");
		 driver.findElementByXPath("//button[contains(text(),'Find')]").click();
		Thread.sleep(3000);
		 WebElement text2= driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		 String text = text2.getText();
		 driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		
		 driver.findElementByXPath("//a[text()='Delete']").click();
		 driver.findElementByXPath("//a[contains(text(),'Find')]").click();

		 driver.findElementByXPath("//label[text()='Lead ID:']/following::input").sendKeys(text);// check((//label[text()='First name:'])[3]/following::input)[1]
		 driver.findElementByXPath("//button[contains(text(),'Find')]").click();

		 Thread.sleep(3000);

		driver.findElementByXPath("//div[text()='No records to display']");

		

		 
	}
}
