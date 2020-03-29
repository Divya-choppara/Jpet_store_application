package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BASE_CLASSES.Utilities;

public class Assert_page {
	WebDriver driver;
	Utilities Utils;
	By SubTotal=By.xpath("//td[@colspan='7']//child::span");
	
	public Assert_page(WebDriver driver) 
	{
		this.driver=driver;
		Utils=new Utilities(driver);
	}
	
	//To get the value of total price of the product
	public String Page_for_assertion() {
		WebElement we_SubTotal=Utils.WaitForElement(SubTotal, 10);
		String FinalTotal=we_SubTotal.getText();
		System.out.println(FinalTotal);
		return FinalTotal;
	}

}
