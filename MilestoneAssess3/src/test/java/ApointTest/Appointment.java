package ApointTest;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Appointment.BookAppoint;
import BasePack.BaseClass;
import BaseTesting.BaseTest;


public class Appointment extends BaseClass {
	
	
	public static Logger log=LogManager.getLogger(BaseTest.class.getName());
	
	@Test
	public void AppointSetup() throws IOException, InterruptedException
	{
		log.info("Dirver initialized");
		driver=BaseSettings();
		log.info("URL initialized");
		driver.get(prop.getProperty("Url"));
		
		BookAppoint ba=new BookAppoint(driver);
		
		log.info("Clicked on book Appointment");
		ba.App().click();
		Thread.sleep(2000L);
		
		ba.Selection().click();
		Thread.sleep(2000L);
		
		ba.Dat().click();
		Thread.sleep(2000L);
		
		log.info("Name Entered");
		ba.Naam().sendKeys("Shubham");
		
		ba.mobile().sendKeys("6393575904");
		
		ba.mailing().sendKeys("pandey@mail.com");
		Thread.sleep(5000L);
		
		log.info("Submitted");
		ba.Submit().click();
	
			
	}
	

}
