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
import PAGES.InvalidLogIn;
import PAGES.Login_page;
import PAGES.Product_list;
import PAGES.Register_page;
import PAGES.Search_page;
import PAGES.Search_result;
import PAGES.Successful_login;

public class Test_Jpet extends Read_excel {
	WebDriver driver;
	Utilities utils;
	Click_sign_in SignInButton;
	Click_register RegisterButton;
	Register_page Register;
	Login_page Login;
	Search_page Search;
	Add_to_cart AddToCart;
	Added_page AddedProduct;
	Assert_page AssertPage;
	Successful_login LoginPage;
	Search_result SearchResult;
	Product_list ProductList;
	InvalidLogIn invalidlogin;
	@BeforeClass
	public void BeforeClass() 
	{
		utils=new Utilities(driver);
		get_data();
	}
	@BeforeMethod
	public void BeforeMethod() 
	{
		driver=utils.Launch_browser("CHROME", "https://jpetstore.cfapps.io/catalog");
		SignInButton=new Click_sign_in(driver);
		RegisterButton=new Click_register(driver);
		Register=new Register_page(driver);
		Login=new Login_page(driver);
		Search=new Search_page(driver);
		AddToCart=new Add_to_cart(driver);
		AddedProduct=new Added_page(driver);
		LoginPage=new Successful_login(driver);
		AssertPage=new Assert_page(driver);
		SearchResult=new Search_result(driver);
		ProductList=new Product_list(driver);
		invalidlogin=new InvalidLogIn(driver);
		
		
	}
	
	//Scenario for valid credentials(register and Login)
  @Test(dataProvider="loginpage")
  public void RegisterAndLogin(String un,String pd,String cpd,String nm,String ln,String eml,String ph,String a1,String a2,String ct,String st,String zp,String ctr,String uid,String pwd) 
  {
	  SignInButton.clk_on_signin();
	  RegisterButton.ClickOnRegisterButton();
	  String phn=ph.substring(1, 10);
	  String zpc=zp.substring(1, 6);
	  Register.do_reg(un,pd,cpd,nm,ln,eml,phn,a1,a2,ct,st,zpc,ctr);
	  Login.Login(uid,pwd);
	  String Name_of_user=LoginPage.Successful_login_page();
	  SoftAssert Assert=new SoftAssert();
	  Assert.assertEquals(Name_of_user, "divya");
	  Assert.assertAll();
	  utils.Screenshot();
	}
  
  //Scenario for Invalid Credentials
  @Test(dataProvider="loginpage")
  public void InvalidLogin(String un,String pd,String cpd,String nm,String ln,String eml,String ph,String a1,String a2,String ct,String st,String zp,String ctr,String uid,String pwd) 
  {
	  SignInButton.clk_on_signin();
	  Login.Login(un,pwd);
	  String Errormesaage=invalidlogin.InvalidLogInPage();
	  SoftAssert Assert=new SoftAssert();
	  Assert.assertEquals(Errormesaage, "Credentials is invalid");
	  Assert.assertAll();
	  utils.Screenshot();
	  
	  
  }
  
  @DataProvider(name="loginpage")
  public String[][] Provide_data()
  {
	  return testdata;
  }
	
	//Scenario to check the final price of the product
  @Test(dataProvider="loginpage")
	  public void AddingToCart(String un,String pd,String cpd,String nm,String ln,String eml,String ph,String a1,String a2,String ct,String st,String zp,String ctr,String uid,String pwd) 
	  { 
	  SignInButton.clk_on_signin();
	  Login.Login(uid,pwd);
	  Search.search();
	  AddToCart.AddProduct();
	  AddedProduct.adding();
	      String SubTotal=AssertPage.Page_for_assertion();
	      SoftAssert Assert=new SoftAssert();
	      Assert.assertEquals(SubTotal, "16.05");
	      Assert.assertAll();
	      utils.Screenshot();
	  
	  }
  //Scenario for valid search
	  @Test(dataProvider="loginpage")
	  public void Search(String un,String pd,String cpd,String nm,String ln,String eml,String ph,String a1,String a2,String ct,String st,String zp,String ctr,String uid,String pwd)
	  {
		  SignInButton.clk_on_signin();
		  Login.Login(uid,pwd);
		  Search.search();
		  SearchResult.Search_result_page();
		  String Product_name=ProductList.product_list_page();
		  SoftAssert Assert=new SoftAssert();
	      Assert.assertEquals(Product_name, "Angelfish");
	      Assert.assertAll();
	      utils.Screenshot();
	  }
	  @AfterMethod
	  public void aftermethod()
	  {
		  driver.close();
	  }
  
}
