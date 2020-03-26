package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search_page {
    WebDriver driver;
	
	public Search_page(WebDriver driver) {
		
		this.driver=driver;
	}
	
	//To search for the product on home page
	public void search() {
		driver.findElement(By.xpath("//input[@name='keywords']")).sendKeys("fish");
		driver.findElement(By.xpath("//input[@id='searchProducts']")).click();
		
	}

}
