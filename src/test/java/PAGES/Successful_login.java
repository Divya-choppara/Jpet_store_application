package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BASE_CLASSES.Utilities;

public class Successful_login {
	WebDriver driver;
	Utilities ult;
	public Successful_login(WebDriver driver) {
		this.driver=driver;
		ult=new Utilities(driver);
	}
	
	//To get the username after succeessful login
	public String Successful_login_page() {
		By Login_name=By.xpath("//div[@id='WelcomeContent']//child::span");
		WebElement We_Login_name=ult.WaitForElement(Login_name, 10);
		String name=We_Login_name.getText();
		System.out.println(name);
		return name;
	}

}
