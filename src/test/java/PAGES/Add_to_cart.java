package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Add_to_cart {
	WebDriver dr;
	public Add_to_cart(WebDriver dr) {
		this.dr=dr;
		
	}
	//To add the product into the cart
	public void add_product() {
		
		dr.findElement(By.xpath("//div[@id='Catalog'][1]//child::a[@href='/catalog/products/FI-SW-01'][1]")).click();
	}

}
