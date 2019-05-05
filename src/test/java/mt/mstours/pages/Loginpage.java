package mt.mstours.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import mt.mstours.config.Config;
import mt.mstours.utility.Launch;

public class Loginpage 
{

	@FindBy(how=How.XPATH,using="//input[@name='userName']")
	WebElement objUsername;
	
	@FindBy(how=How.XPATH,using="//input[@name='password']")
	WebElement objPassword;
	
	@FindBy(how=How.XPATH,using="//input[@name='login']")
	WebElement objLogin;
	
	
	public void LoadLoginpage()
	{
		PageFactory.initElements(Config.driver, this);
	}
	
	public void enterUsername(String username)
	{
		System.out.println("In enterUsername method");
		objUsername.sendKeys(username);
		System.out.println("Username is entered successfully");
		
	}
	
	public void enterPassword(String password)
	{
		objPassword.sendKeys(password);
		System.out.println("password is entered successfully");
	}
	
	public void clickonLogin()
	{
		objLogin.click();
	}
	
	public static void main(String[] args) throws IOException 
	{
		Launch lc= new Launch();
		lc.openBrowser("chrome");
		lc.enterApplicationurl("http://newtours.demoaut.com/mercurywelcome.php");
		lc.maximizeBrowser();
		lc.WaitTillLoginpageloaded(15);
		Loginpage lgpg= new Loginpage();
		//lgpg.LoadLoginpage();
		lgpg.enterUsername("Suvidyap1");
		lgpg.enterPassword("P@ssword1");
		lgpg.clickonLogin();
	}
}
