package mt.mstours.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import mt.mstours.config.Config;

public class Launch 
{
	Properties prop= new Properties();
	
	public void openBrowser(String  browsernm) throws IOException
	{
		FileInputStream fis= new FileInputStream("F:\\Suvidya_data\\Java_Selenium_Practice\\Mercurytspomproject\\src\\test\\resources\\config.properties");
		prop.load(fis);
		
		if((prop.getProperty("browser").equalsIgnoreCase(browsernm)))
		{
			System.setProperty("webdriver.chrome.driver", prop.getProperty("chrome_exe_path"));
			Config.driver= new ChromeDriver();
			System.out.println("Chrome browser is opened successfully:"+prop.getProperty("browser"));
					
		}else if(prop.getProperty("browser").equalsIgnoreCase(browsernm))
		{
			System.setProperty("webdriver.ie.driver", prop.getProperty("ie_exe_path"));
			Config.driver=new InternetExplorerDriver();
			System.out.println("IE browser is opened successfully:"+prop.getProperty("browser"));
		}else
		{
			System.setProperty("webdriver.gecko.driver", prop.getProperty("firefox_exe_path"));
			Config.driver=new FirefoxDriver();
			System.out.println("Firefox browser is opened successfully:"+prop.getProperty("browser"));
				
		}
		
	}
	
		public void enterApplicationurl(String url)
		{
			
			Config.driver.get(url);
			System.out.println("Application url is opened");
		}
		
		
		public void maximizeBrowser()
		{
			Config.driver.manage().window().maximize();
			System.out.println("maximized browser");
		}
		
		public void WaitTillLoginpageloaded(int timeouts)
		{
			Config.driver.manage().timeouts().pageLoadTimeout(timeouts, TimeUnit.SECONDS);
			System.out.println("Web page is loaded successfully");
		}
		
		
		public static void main(String[] args) throws IOException 
		{
			Launch lc= new Launch();
			lc.openBrowser("chrome");
			lc.enterApplicationurl("http://newtours.demoaut.com/mercurywelcome.php");
			lc.maximizeBrowser();
			lc.WaitTillLoginpageloaded(15);
			
		}
	}
	
	


