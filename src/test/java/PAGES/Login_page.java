package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BASE_CLASSES.Utilities;

//To login with valid credentials

public class Login_page {
	
	 Utilities wt;
		WebDriver dr;
		public Login_page(WebDriver dr)
		{
			this.dr=dr;
			wt=new Utilities(dr);
		}
		//To give user name
		public void username(String uid)
		{
			By by_uid= By.xpath("//input[@name='username']");
			WebElement we_uid =wt.ElementToBeClickable(by_uid,10);
			we_uid.sendKeys(uid);
		}
		//To give password
		public void password(String pwd)
		{
			By by_pwd= By.xpath("//input[@name='password']");
			WebElement we_pwd =wt.ElementToBeClickable(by_pwd,10);
			we_pwd.sendKeys(pwd);
		}
		//To click on login button 
		public void clickBTN()
		{
			By byclk= By.xpath("//input[@id='login']");
			WebElement we_clk =wt.ElementToBeClickable(byclk,10);
			we_clk.click();
		}
		//Method for login 
		public void Login(String uid,String pwd)
		{
			this.username(uid);
			this.password(pwd);
			this.clickBTN();
			
		}


}
