package BaseTesting;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import BasePack.BaseClass;
import screenShot.takeScreenShot;


public class Listeners extends BaseClass implements ITestListener {

	public void onTestFailure(ITestResult result)
	{

	}
	

	public void onTestSuccess(ITestResult result)
	{
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			ExtentTest test4=extent.createTest(driver.getTitle());
			String screenshotpath = null;
			try {
				screenshotpath = takeScreenShot.capture(driver, "screenshotforExtentReport");
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			test4.log(Status.PASS, result.getName());
			test4.pass("Test Succeeded",MediaEntityBuilder.createScreenCaptureFromPath(screenshotpath).build());

		}
	}
}


