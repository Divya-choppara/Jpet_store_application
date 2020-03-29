package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BASE_CLASSES.Utilities;



//To register with valid credentials
public class Register_page {
	Utilities Utils;
	WebDriver driver;
	Register_page Register;
	By un=By.xpath("//input[@id='username']");
	By pd=By.xpath("//input[@id='password']");
	By cpd=By.xpath("//input[@id='repeatedPassword']");
	By fn=By.xpath("//input[@id='firstName']");
	By ln=By.xpath("//input[@id='lastName']");
	By eid=By.xpath("//input[@id='email']");
	By pn=By.xpath("//input[@id='phone']");
	By ad1=By.xpath("//input[@id='address1']");
	By ad2=By.xpath("//input[@id='address2']");
	By ctn=By.xpath("//input[@id='city']");
	By sn=By.xpath("//input[@id='state']");
	By zip=By.xpath("//input[@id='zip']");
	By cn=By.xpath("//input[@id='country']");
	By lp=By.xpath("//select[@id='languagePreference']//child::option[1]");
	By by_category= By.xpath("//option[@value='BIRDS']");
	By by_list= By.xpath("//input[@id='listOption1']");
	By by_banner= By.xpath("//input[@id='bannerOption1']");
	By by_save= By.xpath("//input[@value='Save Account Information']");

	
	
	public Register_page(WebDriver driver)
	{
		this.driver=driver;
		Utils=new Utilities(driver);
	}
   //To give name of the user
	public void unm(String mun) {
		WebElement w_un=Utils.WaitForElement(un, 20);
		w_un.sendKeys(mun);
		
		
	}
	//To give password
	public void pdm(String pwd) {
		WebElement w_pd=Utils.WaitForElement(pd, 10);
		w_pd.sendKeys(pwd);
		
		
	}
	//To confirm the given password
	public void cpdm(String cpwd) {
		WebElement w_cpd=Utils.WaitForElement(cpd, 10);
		w_cpd.sendKeys(cpwd);
		
		
	}
	//To give firstname
	public void fnm(String nm) {
		WebElement w_fn=Utils.WaitForElement(fn, 10);
		w_fn.sendKeys(nm);
		
		
	}
	//To give lastname
	public void lnm(String lsn) {
		WebElement w_ln=Utils.WaitForElement(ln, 10);
		w_ln.sendKeys(lsn);
		
		
	}
//to give email address
	public void eidm(String em) {
		WebElement w_eid=Utils.WaitForElement(eid, 10);
		w_eid.sendKeys(em);
		
		
	}
//To enter phone number
	public void pnm(String ph) {
		
		WebElement w_pn=Utils.WaitForElement(pn, 10);
		w_pn.sendKeys(ph);
		
		
	}
//To enter address_1
	public void ad1m(String a1) {
		
		WebElement w_ad1=Utils.WaitForElement(ad1, 10);
		w_ad1.sendKeys(a1);
		
		
	}
//To enter address_2
	public void ad2m(String a2) {
		
		WebElement w_ad2=Utils.WaitForElement(ad2, 10);
		w_ad2.sendKeys(a2);
		
		
	}
//To enter city name
	public void ctnm(String c) {
		WebElement w_ctn=Utils.WaitForElement(ctn, 10);
		w_ctn.sendKeys(c);
		
		
	}
//To enter state name
	public void snm(String s) {
		WebElement w_sn=Utils.WaitForElement(sn, 10);
		w_sn.sendKeys(s);
		
		
	}
	
//To enter zip code
	public void zipm(String z) {
		WebElement w_zip=Utils.WaitForElement(zip, 10);
		w_zip.sendKeys(z);
		
		
	}
	//To enter country name
	public void cnm(String ct) {
		WebElement w_cn=Utils.WaitForElement(cn, 10);
		w_cn.sendKeys(ct);
		
		
	}
	//To select preffered language
	public void lpm() {
		WebElement w_lp=Utils.ElementToBeClickable(lp, 10);
		w_lp.click();
		
		
	}
	//To select category
	public void cat() {
	WebElement we_category =Utils.ElementToBeClickable(by_category,10);
	we_category.click();
	}
	
	//To click on checkbox of listoption
	public void ltm()
	{
	WebElement we_list =Utils.ElementToBeClickable(by_list,10);
	we_list.click();
	}
	
	//To click on checkbox of banneroption
	public void bnm() {
	WebElement we_banner =Utils.ElementToBeClickable(by_banner,10);
	we_banner.click();
	}
	
	//To click on save button to save the given credentials
	public void sm() {
	WebElement we_save =Utils.ElementToBeClickable(by_save,10);
	we_save.click();
	}
	//Method to register with valid credentials
	public  void do_reg(String un,String pd,String cpd,String nm,String ln,String eml,String ph,String a1,String a2,String ct,String st,String zp,String ctr) {
		
		Register=new Register_page(driver);
		Register.unm(un);
		Register.pdm(pd);
		Register.cpdm(cpd);
		Register.fnm(nm);
		Register.lnm(ln);
		Register.eidm(eml);
		Register.pnm(ph);
		Register.ad1m(a1);
		Register.ad2m(a2);
		Register.ctnm(ct);
		Register.snm(st);
		Register.zipm(zp);
		Register.cnm(ctr);
		Register.lpm();
		Register.cat();
		Register.ltm();
		Register.bnm();
		Register.sm();
		
	}
	

}
