package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BASE_CLASSES.Utilities;

public class Added_page {
     WebDriver driver;
     Utilities Utils;
     By AddedProduct=By.xpath("//a[@href='/cart?add&itemId=EST-2']");
     By FinalProduct=By.xpath("//*[@id=\\\"Cart\\\"]/form");
	public Added_page (WebDriver driver)
	{
		this.driver=driver;
		Utils=new Utilities(driver);
	}
	
	//Checking the added product and To print the details regarding product 
	public void adding() {
		WebElement Ele_AddedProduct=Utils.ElementToBeClickable(AddedProduct, 10);
		Ele_AddedProduct.click();
		WebElement Ele_FinalProduct=Utils.ElementToBeClickable(FinalProduct, 10);
		String ProductDetail=Ele_FinalProduct.getText();
		System.out.println(ProductDetail);
	}

}
