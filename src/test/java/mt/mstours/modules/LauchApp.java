package mt.mstours.modules;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import mt.mstours.utility.Launch;

import org.testng.annotations.Test;

public class LauchApp {
  
  @Parameters({"browser","url","timeout"})
  @Test
  public void executeLauchApp(String browsernm,String urlnm,int timeout) throws IOException 
  {
	  Launch lc1= new Launch();
	  lc1.openBrowser(browsernm);
	  lc1.enterApplicationurl(urlnm);
	  lc1.maximizeBrowser();
	  lc1.WaitTillLoginpageloaded(timeout);
  }
}
