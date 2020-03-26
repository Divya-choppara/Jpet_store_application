package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BASE_CLASSES.Utilities;

public class Search_result {
	WebDriver driver;
	Utilities ult;
	public Search_result(WebDriver driver) 
	{
		this.driver=driver;
		ult=new Utilities(driver);
	}
	
	//To click on particular fish type 
	public void Search_result_page()
	{
		By res_page=By.xpath("//a[@href='/catalog/products/FI-SW-01']");
		WebElement we_res_page=ult.WaitForElement(res_page, 10);
		we_res_page.click();
	}

}
