package BaseTesting;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePack.BaseClass;
import booking.BookingPage;


public class BaseTest extends BaseClass {

public static Logger log=LogManager.getLogger(BaseTest.class.getName());
	

	
	@Test
	public void TestSetup() throws IOException
	{
		
		log.info("Dirver initialized");
		driver=BaseSettings();
		log.info("URL initialized");
		driver.get(prop.getProperty("Url"));
		
		BookingPage bp=new BookingPage(driver);
		
		bp.Booked().click();
		
		System.out.println();
		
		
			
	}
	

	
	

}
