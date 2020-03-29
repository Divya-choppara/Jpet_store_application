package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BASE_CLASSES.Utilities;

public class Search_result {
	WebDriver driver;
	Utilities Utils;
	By ResultPage=By.xpath("//a[@href='/catalog/products/FI-SW-01']");

	public Search_result(WebDriver driver) 
	{
		this.driver=driver;
		Utils=new Utilities(driver);
	}
	
	//To click on particular fish type 
	public void Search_result_page()
	{
		WebElement Ele_ResultPage=Utils.WaitForElement(ResultPage, 10);
		Ele_ResultPage.click();
	}

}
