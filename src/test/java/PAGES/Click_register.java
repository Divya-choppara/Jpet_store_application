package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BASE_CLASSES.Utilities;

public class Click_register {
	WebDriver driver;
	Utilities Utils;
	By ClickOnRegister=By.xpath("//div[@id='Catalog']//a");
	public Click_register(WebDriver driver) 
	{
		this.driver=driver;
		Utils=new Utilities(driver);
	}
	//To click on register now to register with new user details
	public void ClickOnRegisterButton() 
	{
		
		WebElement Element_ClickOnRegister=Utils.ElementToBeClickable(ClickOnRegister, 20);
		Element_ClickOnRegister.click();
		
	}

}
