package Contacting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Contact {
	
public WebDriver driver;
	
	By con=By.xpath("//nav[@id='top-menu-nav']/ul/li[4]");
	
	By namee=By.xpath("//input[@id='et_pb_contact_name_0']");
	
	By mailee=By.xpath("//input[@id='et_pb_contact_email_0']");
	
	By mess=By.xpath("//textarea[@id='et_pb_contact_message_0']");
	
	By done=By.xpath("//button[@type='submit']");
	
	public Contact(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement contacted()
	{
		return driver.findElement(con);
	}
	
	public WebElement Named()
	{
		return driver.findElement(namee);
	}
	
	public WebElement Mailed()
	{
		return driver.findElement(mailee);
	}
	
	public WebElement Message()
	{
		return driver.findElement(mess);
	}
	
	public WebElement Subm()
	{
		return driver.findElement(done);
	}
	
	
	

}
