package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BASE_CLASSES.Utilities;

public class Product_list {
	WebDriver driver;
	Utilities Utils;
	By product_page=By.xpath("//div[@id='Catalog']//child::h2");
	public Product_list(WebDriver driver) 
	{
		this.driver=driver;
		Utils=new Utilities(driver);
	}
	//To get the name of the product
	public String product_list_page() {
		
		
		WebElement we_productPage=Utils.WaitForElement(product_page, 10);
		String product_name=we_productPage.getText();
		System.out.println(product_name);
		return product_name;
	}

}
