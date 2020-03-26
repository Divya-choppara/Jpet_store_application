package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BASE_CLASSES.Utilities;

public class Click_register {
	WebDriver driver;
	Utilities ult;
	public Click_register(WebDriver driver) 
	{
		this.driver=driver;
		ult=new Utilities(driver);
	}
	//To click on register now to register with new user details
	public void clk_on_register() 
	{
		By cr=By.xpath("//div[@id='Catalog']//a");
		WebElement we_cr=ult.ElementToBeClickable(cr, 20);
		we_cr.click();
		
	}

}
