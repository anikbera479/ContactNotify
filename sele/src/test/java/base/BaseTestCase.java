package base;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;




public class BaseTestCase {
	public static WebDriver driver;
	public static FileReader fr;
	public static FileReader fr1;
	
	public static Properties p=new Properties();
	public static Properties l=new Properties();
	@BeforeMethod
	public void setup() throws IOException
	{
		if(driver==null) {
			FileReader fr=new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\config.property");
			FileReader fr1=new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\locators");
			p.load(fr);
			l.load(fr1);
		}
		if(p.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			 driver.get(p.getProperty("testurl"));
		}
		else if(p.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
			 driver.get(p.getProperty("testurl"));
			 
		}
		
		
			
			
		}
		
	@AfterMethod
	public void teardown() {
		driver.close();
		System.out.println("TearDown is successful");
		
	}

}
