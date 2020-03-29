package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BASE_CLASSES.Utilities;

//To login with valid credentials

public class Login_page {
	
	    Utilities Utils;
		WebDriver driver;
		By UserId= By.xpath("//input[@name='username']");
		By PassWord= By.xpath("//input[@name='password']");
		By ClickOnLogin= By.xpath("//input[@id='login']");
		
		public Login_page(WebDriver driver)
		{
			this.driver=driver;
			Utils=new Utilities(driver);
		}
		//To give user name
		public void username(String UserName)
		{
			WebElement Ele_UserId =Utils.ElementToBeClickable(UserId,10);
			Ele_UserId.sendKeys(UserName);
		}
		//To give password
		public void password(String password)
		{
			WebElement Ele_PassWord =Utils.ElementToBeClickable(PassWord,10);
			Ele_PassWord.sendKeys(password);
		}
		//To click on login button 
		public void clickbutton()
		{
			WebElement Ele_ClickOnLogin =Utils.ElementToBeClickable(ClickOnLogin,10);
			Ele_ClickOnLogin.click();
		}
		//Method for login 
		public void Login(String userid,String Password)
		{
			this.username(userid);
			this.password(Password);
			this.clickbutton();
			
		}


}
