package booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookingPage {
	
	
	public WebDriver driver;
	
	By Book=By.xpath("//nav[@id='top-menu-nav']/ul/li[2]");
	
	public BookingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement Booked()
	{
		return driver.findElement(Book);
	}
	

}
