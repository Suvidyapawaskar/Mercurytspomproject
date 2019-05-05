package mt.mstours.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import mt.mstours.config.Config;

public class FlightFinderpage 
{
   @FindBy(how=How.XPATH,using="//img[@src='/images/masts/mast_flightfinder.gif']")
	WebElement objFlightFinder;
   
   @FindBy(how=How.LINK_TEXT,using="SIGN-OFF")
   WebElement objSignoff;
   
	public void LoadFlightFinder()
	{
		PageFactory.initElements(Config.driver, this);
	}
	
	public void verifyFlightfinder()
	{
		boolean act_flag=objFlightFinder.isDisplayed();
		boolean exp_flag=true;
		Assert.assertEquals(act_flag, exp_flag);
		System.out.println("Flight Finder tool is displayed"+act_flag);
		
	}
	
	public void ClickonSignoff()
	{
		objSignoff.click();
	}
	
	
}
