package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BASE_CLASSES.Utilities;

public class Click_sign_in {
	WebDriver driver;
	Utilities ult;
	public Click_sign_in(WebDriver driver) 
	{
		this.driver=driver;
		ult=new Utilities(driver);
	}
	//To click on sign_in link then it will open sign_in page
	public void clk_on_signin() 
	{
		By cs=By.xpath("//div[@id='MenuContent']//child::a[2]");
		WebElement we_cs=ult.ElementToBeClickable(cs, 10);
		we_cs.click();
		
	}

}
