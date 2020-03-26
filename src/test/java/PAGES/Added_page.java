package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Added_page {
WebDriver dr;
	
	public Added_page (WebDriver dr) {
		
		this.dr=dr;
	}
	//Checking the added product and To print the details regarding product 
	public void adding() {
		dr.findElement(By.xpath("//a[@href='/cart?add&itemId=EST-2']")).click();
		String s=dr.findElement(By.xpath("//*[@id=\"Cart\"]/form")).getText();
		System.out.println(s);
	}

}
