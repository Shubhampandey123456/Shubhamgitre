package BasePack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static Properties prop;
	
	public static ExtentSparkReporter spark;
	public static ExtentReports extent;
	public BaseClass()
	{
		spark = new ExtentSparkReporter("htmlReport//index.html");
		extent = new ExtentReports();
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Automate Report");
		spark.config().setReportName("Extend Report");
		extent.attachReporter(spark);
	}
	
	public WebDriver BaseSettings() throws IOException{
		
		
		prop=new Properties();
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Shubham Pandey\\eclipse-workspace\\MilestoneAssess3\\src\\main\\java\\BasePack\\res.properties");

		prop.load(fis);
		
		
		String browserName=prop.getProperty("Browser");
		
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("Edge"))
		{
			//initialize here edge browser
		}
		
		else
		{
			//initialize browser of your choice
		}
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		return driver;
	}

}
