package screenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import BasePack.BaseClass;


public class takeScreenShot extends BaseClass {
	
		
		public static String capture(WebDriver driver1, String screenshotName) throws IOException
		{
			//TakesScreenshot ts=(TakesScreenshot)driver1;
			File source=((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
			String dest=System.getProperty("user.dir")+"\\ScreenShotTaken\\"+screenshotName+System.currentTimeMillis()+".png";
			File destination=new File(dest);
			FileUtils.copyFile(source, destination);
			
			return dest;
		}


}
