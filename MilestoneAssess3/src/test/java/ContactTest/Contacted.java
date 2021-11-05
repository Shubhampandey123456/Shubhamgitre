package ContactTest;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePack.BaseClass;
import BaseTesting.BaseTest;
import Contacting.Contact;

public class Contacted extends BaseClass {

		
		public static Logger log=LogManager.getLogger(BaseTest.class.getName());
		
		@Test
		public void ContactSetup() throws InterruptedException, IOException
		{

			log.info("Dirver initialized");
			driver=BaseSettings();
			log.info("URL initialized");
			driver.get(prop.getProperty("Url"));
			Contact con=new Contact(driver);
			
			con.contacted().click();
			Thread.sleep(5000l);
			
			con.Named().sendKeys("Shubham");
			
			con.Mailed().sendKeys("Pandey@mail.com");
			
			con.Message().sendKeys("Server Down");
			Thread.sleep(5000l);
			con.Subm().click();
		}
	
		
}
