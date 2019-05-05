package mt.mstours.utility;

import org.testng.annotations.Test;

import mt.mstours.config.Config;

public class CloseBrowser 
{
	@Test
	public void closeBrowser()
	{
		Config.driver.close();
	}
  
}
