package Appointment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookAppoint {
	//div[@class='et_pb_row']/div/div[2]/a
	
	//input[@name='emsb_user_fullName']

	public WebDriver driver;

	By Appointm=By.xpath("//div[@class='et_pb_row']/div/div[2]/a");
	
	By Sel=By.xpath("//button[@type='button']");
	
	By date=By.xpath("//td[@data-date='30']");
	
	By name=By.xpath("//input[@name='emsb_user_fullName']");
	
	By mail=By.xpath("//input[@name='emsb_user_email']");
	
	By phone=By.xpath("//input[@name='emsb_user_telephone']");
	
	By sub=By.xpath("//button[@value='Submit']");

	public BookAppoint(WebDriver driver)
	{
		this.driver=driver;
	}

	public WebElement App()
	{
		return driver.findElement(Appointm);
	}
	
	public WebElement Selection()
	{
		return driver.findElement(Sel);
	}
	
	public WebElement Dat()
	{
		return driver.findElement(date);
	}
	
	public WebElement Naam()
	{
		return driver.findElement(name);
	}
	
	public WebElement mailing()
	{
		return driver.findElement(mail);
	}
	
	public WebElement mobile()
	{
		return driver.findElement(phone);
	}
	
	public WebElement Submit()
	{
		return driver.findElement(sub);
	}
	
}
