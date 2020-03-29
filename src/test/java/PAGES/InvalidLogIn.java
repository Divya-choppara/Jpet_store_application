package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BASE_CLASSES.Utilities;

public class InvalidLogIn {
	WebDriver driver;
	Utilities Utils;
	By ErrorMessage=By.xpath("//li[@class='error']");
	
	public InvalidLogIn(WebDriver driver)
	{
		this.driver=driver;
		Utils=new Utilities(driver);
				
	}
	
	//To add the product into the cart
	public String InvalidLogInPage()
	{
		WebElement Ele_ErrorMessage=Utils.ElementToBeClickable(ErrorMessage, 10);
		String Error=Ele_ErrorMessage.getText();
		return Error;
	}

}
