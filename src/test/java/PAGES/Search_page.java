package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BASE_CLASSES.Utilities;

public class Search_page {
    WebDriver driver;
    Utilities Utils;
    By SearchProduct=By.xpath("//input[@name='keywords']");
    By SearchedProduct=By.xpath("//input[@id='searchProducts']");

	public Search_page(WebDriver driver) {
		
		this.driver=driver;
	}
	
	//To search for the product on home page
	public void search() 
	{
		WebElement Ele_SearchProduct=Utils.ElementToBeClickable(SearchProduct, 10);
		Ele_SearchProduct.sendKeys("fish");
		WebElement Ele_SearchedProduct=Utils.ElementToBeClickable(SearchedProduct, 10);
		Ele_SearchedProduct.click();
		
	}

}
