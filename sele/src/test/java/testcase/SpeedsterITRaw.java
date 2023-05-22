package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTestCase;
import utilities.ReadXLSFile;

public class SpeedsterITRaw extends BaseTestCase {
	@Test(dataProviderClass=ReadXLSFile.class,dataProvider="testData")
	public static void updatepage(String companyId, String contactId, String contactEmail, String mainContact,String siteContact,String permisisonsAuthoriser,String quotesAuthoriser) throws InterruptedException {
	driver.navigate().refresh();
	driver.findElement(By.id(l.getProperty("Company_Id"))).sendKeys(companyId);
	Thread.sleep(1000);
	driver.findElement(By.id(l.getProperty("Contact_Id"))).sendKeys(contactId);
	Thread.sleep(1000);
	driver.findElement(By.id(l.getProperty("Email"))).sendKeys(contactEmail);
	Thread.sleep(1000);
	driver.findElement(By.id(l.getProperty("Main_Contact"))).sendKeys(mainContact);
	Thread.sleep(1000);
	
	driver.findElement(By.id(l.getProperty("Site_Contact"))).sendKeys(siteContact);
	Thread.sleep(1000);
	driver.findElement(By.id(l.getProperty("Permissions_Authoriser"))).sendKeys(permisisonsAuthoriser);
	
	
	driver.findElement(By.id(l.getProperty("Quotes_Authoriser"))).sendKeys(quotesAuthoriser);
	
	Thread.sleep(7000);
	driver.findElement(By.xpath("/html/body/div[1]/main/article/form/div[8]/button")).click();
	Thread.sleep(4000);

}
}
