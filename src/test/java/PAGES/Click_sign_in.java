package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BASE_CLASSES.Utilities;

public class Click_sign_in {
	WebDriver driver;
	Utilities Utils;
	By ClickOnSinInButton=By.xpath("//div[@id='MenuContent']//child::a[2]");
	
	public Click_sign_in(WebDriver driver) 
	{
		this.driver=driver;
		Utils=new Utilities(driver);
	}
	
	//To click on sign_in link then it will open sign_in page
	public void clk_on_signin() 
	{
		
		WebElement Ele_ClickOnSinInButton=Utils.ElementToBeClickable(ClickOnSinInButton, 10);
		Ele_ClickOnSinInButton.click();
		
	}

}
