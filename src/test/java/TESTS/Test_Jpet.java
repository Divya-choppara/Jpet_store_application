package TESTS;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BASE_CLASSES.Utilities;
import EXCEL.Read_excel;
import PAGES.Add_to_cart;
import PAGES.Added_page;
import PAGES.Assert_page;
import PAGES.Click_register;
import PAGES.Click_sign_in;
import PAGES.Login_page;
import PAGES.Product_list;
import PAGES.Register_page;
import PAGES.Search_page;
import PAGES.Search_result;
import PAGES.Successful_login;

public class Test_Jpet extends Read_excel {
	WebDriver driver;
	Utilities ult;
	Click_sign_in csi;
	Click_register cr;
	Register_page Rp;
	Login_page Lp;
	Search_page sp;
	Add_to_cart ac;
	Added_page ap;
	Assert_page assert_p;
	Successful_login Log_page;
	Search_result ser_res;
	Product_list pro_list;
	@BeforeClass
	public void BeforeClass() 
	{
		ult=new Utilities(driver);
		get_data();
	}
	@BeforeMethod
	public void BeforeMethod() 
	{
		driver=ult.Launch_browser("CHROME", "https://jpetstore.cfapps.io/catalog");
		csi=new Click_sign_in(driver);
		cr=new Click_register(driver);
		Rp=new Register_page(driver);
		Lp=new Login_page(driver);
		sp=new Search_page(driver);
		ac=new Add_to_cart(driver);
		ap=new Added_page(driver);
		Log_page=new Successful_login(driver);
		assert_p=new Assert_page(driver);
		ser_res=new Search_result(driver);
		pro_list=new Product_list(driver);
		
		
	}
	
	//Test method for register and Login and checking the successful login
  @Test(dataProvider="loginpage")
  public void f(String un,String pd,String cpd,String nm,String ln,String eml,String ph,String a1,String a2,String ct,String st,String zp,String ctr,String uid,String pwd) 
  {
	  csi.clk_on_signin();
	  cr.clk_on_register();
	  String phn=ph.substring(1, 10);
	  String zpc=zp.substring(1, 6);
	  Rp.do_reg(un,pd,cpd,nm,ln,eml,phn,a1,a2,ct,st,zpc,ctr);
	  Lp.Login(uid,pwd);
	  String Name_of_user=Log_page.Successful_login_page();
	  SoftAssert Assert=new SoftAssert();
	  Assert.assertEquals(Name_of_user, "divya");
	  Assert.assertAll();
	  ult.Screenshot();
	 
	 
	  
  }
  @DataProvider(name="loginpage")
  public String[][] Provide_data()
  {
	  return testdata;
  }
	
	//Test Method for login and search for the product and adding the product to the cart  and assertion of product price
  @Test(dataProvider="loginpage")
	  public void test2(String un,String pd,String cpd,String nm,String ln,String eml,String ph,String a1,String a2,String ct,String st,String zp,String ctr,String uid,String pwd) 
	  { 
		  csi.clk_on_signin();
		  Lp.Login(uid,pwd);
		  sp.search();
		  ac.add_product();
		  ap.adding();
	      String SubTotal=assert_p.Page_for_assertion();
	      SoftAssert Assert=new SoftAssert();
	      Assert.assertEquals(SubTotal, "16.05");
	      Assert.assertAll();
	      ult.Screenshot();
	  
	  }
  //Test Method for Login and Search for the product and assertion of product name
	  @Test(dataProvider="loginpage")
	  public void test3(String un,String pd,String cpd,String nm,String ln,String eml,String ph,String a1,String a2,String ct,String st,String zp,String ctr,String uid,String pwd)
	  {
		  csi.clk_on_signin();
		  Lp.Login(uid,pwd);
		  sp.search();
		  ser_res.Search_result_page();
		  String Product_name=pro_list.product_list_page();
		  SoftAssert Assert=new SoftAssert();
	      Assert.assertEquals(Product_name, "Angelfish");
	      Assert.assertAll();
	      ult.Screenshot();
	  }
	  @AfterMethod
	  public void aftermethod()
	  {
		  driver.close();
	  }
  
}
