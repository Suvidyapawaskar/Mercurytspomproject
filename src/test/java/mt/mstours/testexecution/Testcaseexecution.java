package mt.mstours.testexecution;

import java.io.IOException;

import mt.mstours.pages.Loginpage;
import mt.mstours.utility.Launch;

public class Testcaseexecution {

	public static void main(String[] args) throws IOException 
	{
	
		Launch lc= new Launch();
		lc.openBrowser("chrome");
		lc.enterApplicationurl("http://newtours.demoaut.com/mercurywelcome.php");
		lc.maximizeBrowser();
		lc.WaitTillLoginpageloaded(15);
		Loginpage lgpg= new Loginpage();
		lgpg.LoadLoginpage();
		lgpg.enterUsername("Suvidyap1");
		lgpg.enterPassword("P@ssword1");
		lgpg.clickonLogin();

	}

}
