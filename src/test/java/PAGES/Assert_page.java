package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BASE_CLASSES.Utilities;

public class Assert_page {
	WebDriver driver;
	Utilities ult;
	public Assert_page(WebDriver driver) 
	{
		this.driver=driver;
		ult=new Utilities(driver);
	}
	//To get the value of total price of the product
	public String Page_for_assertion() {
		By Sub_total=By.xpath("//td[@colspan='7']//child::span");
		WebElement we_Sub_total=ult.WaitForElement(Sub_total, 10);
		String Final_total=we_Sub_total.getText();
		System.out.println(Final_total);
		return Final_total;
	}

}
