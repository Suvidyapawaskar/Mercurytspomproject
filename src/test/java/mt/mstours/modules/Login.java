package mt.mstours.modules;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import mt.mstours.pages.FlightFinderpage;
import mt.mstours.pages.Loginpage;

public class Login {
  
  @Parameters({"username","password"})
  @Test
  public void ExecuteLoginwithvalid(String uname,String passwd) 
  {
	  Loginpage lg1= new Loginpage();
	  lg1.LoadLoginpage();
	  lg1.enterUsername(uname);
	  lg1.enterPassword(passwd);
	  lg1.clickonLogin();
	  
	  FlightFinderpage fd= new FlightFinderpage();
	  fd.LoadFlightFinder();
	  fd.verifyFlightfinder();
	  fd.ClickonSignoff();
  }
  
  @Parameters({"usernm","passwd"})
  @Test
  public void ExecuteLoginwithinvalid(String uname,String passwd) 
  {
	  Loginpage lg1= new Loginpage();
	  lg1.LoadLoginpage();
	  lg1.enterUsername(uname);
	  lg1.enterPassword(passwd);
	  lg1.clickonLogin();
	  
	  FlightFinderpage fd= new FlightFinderpage();
	  fd.LoadFlightFinder();
	  fd.ClickonSignoff();
	  
  }
  
  
}
