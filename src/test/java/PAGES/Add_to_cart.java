package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BASE_CLASSES.Utilities;

public class Add_to_cart {
	WebDriver driver;
	Utilities Utils;
	By AddProductToCart=By.xpath("//div[@id='Catalog'][1]//child::a[@href='/catalog/products/FI-SW-01'][1]");
	
	public Add_to_cart(WebDriver driver)
	{
		this.driver=driver;
		Utils=new Utilities(driver);
				
	}
	
	//To add the product into the cart
	public void AddProduct()
	{
		WebElement Ele_AddProductToCart=Utils.ElementToBeClickable(AddProductToCart, 10);
		Ele_AddProductToCart.click();
	}

}
