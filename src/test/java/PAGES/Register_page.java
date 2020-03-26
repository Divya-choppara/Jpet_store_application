package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BASE_CLASSES.Utilities;



//To register with valid credentials
public class Register_page {
	Utilities wt;
	WebDriver dr;
	Register_page obj;
	
	
	
	public Register_page(WebDriver dr)
	{
		this.dr=dr;
		wt=new Utilities(dr);
	}
   //To give username
	public void unm(String mun) {
		By un=By.xpath("//input[@id='username']");
		WebElement w_un=wt.WaitForElement(un, 20);
		w_un.sendKeys(mun);
		
		
	}
	//To give password
	public void pdm(String pwd) {
		By pd=By.xpath("//input[@id='password']");
		WebElement w_pd=wt.WaitForElement(pd, 10);
		w_pd.sendKeys(pwd);
		
		
	}
	//To confirm the given password
	public void cpdm(String cpwd) {
		By cpd=By.xpath("//input[@id='repeatedPassword']");
		WebElement w_cpd=wt.WaitForElement(cpd, 10);
		w_cpd.sendKeys(cpwd);
		
		
	}
	//To give firstname
	public void fnm(String nm) {
		By fn=By.xpath("//input[@id='firstName']");
		WebElement w_fn=wt.WaitForElement(fn, 10);
		w_fn.sendKeys(nm);
		
		
	}
	//To give lastname
	public void lnm(String lsn) {
		By ln=By.xpath("//input[@id='lastName']");
		WebElement w_ln=wt.WaitForElement(ln, 10);
		w_ln.sendKeys(lsn);
		
		
	}
//to give email address
	public void eidm(String em) {
		By eid=By.xpath("//input[@id='email']");
		WebElement w_eid=wt.WaitForElement(eid, 10);
		w_eid.sendKeys(em);
		
		
	}
//To enter phone number
	public void pnm(String ph) {
		By pn=By.xpath("//input[@id='phone']");
		
		WebElement w_pn=wt.WaitForElement(pn, 10);
		w_pn.sendKeys(ph);
		
		
	}
//To enter address_1
	public void ad1m(String a1) {
		By ad1=By.xpath("//input[@id='address1']");
		
		WebElement w_ad1=wt.WaitForElement(ad1, 10);
		w_ad1.sendKeys(a1);
		
		
	}
//To enter address_2
	public void ad2m(String a2) {
		By ad2=By.xpath("//input[@id='address2']");
		
		WebElement w_ad2=wt.WaitForElement(ad2, 10);
		w_ad2.sendKeys(a2);
		
		
	}
//To enter city name
	public void ctnm(String c) {
		By ctn=By.xpath("//input[@id='city']");
		WebElement w_ctn=wt.WaitForElement(ctn, 10);
		w_ctn.sendKeys(c);
		
		
	}
//To enter state name
	public void snm(String s) {
		By sn=By.xpath("//input[@id='state']");
		WebElement w_sn=wt.WaitForElement(sn, 10);
		w_sn.sendKeys(s);
		
		
	}
	
//To enter zip code
	public void zipm(String z) {
		By zip=By.xpath("//input[@id='zip']");
		WebElement w_zip=wt.WaitForElement(zip, 10);
		w_zip.sendKeys(z);
		
		
	}
	//To enter country name
	public void cnm(String ct) {
		By cn=By.xpath("//input[@id='country']");
		WebElement w_cn=wt.WaitForElement(cn, 10);
		w_cn.sendKeys(ct);
		
		
	}
	//To select preffered language
	public void lpm() {
		By lp=By.xpath("//select[@id='languagePreference']//child::option[1]");
		WebElement w_lp=wt.ElementToBeClickable(lp, 10);
		w_lp.click();
		
		
	}
	//To select category
	public void cat() {
	By by_category= By.xpath("//option[@value='BIRDS']");
	WebElement we_category =wt.ElementToBeClickable(by_category,10);
	we_category.click();
	}
	
	//To click on checkbox of listoption
	public void ltm()
	{
	By by_list= By.xpath("//input[@id='listOption1']");
	WebElement we_list =wt.ElementToBeClickable(by_list,10);
	we_list.click();
	}
	
	//To click on checkbox of banneroption
	public void bnm() {
	By by_banner= By.xpath("//input[@id='bannerOption1']");
	WebElement we_banner =wt.ElementToBeClickable(by_banner,10);
	we_banner.click();
	}
	
	//To click on save button to save the given credentials
	public void sm() {
	By by_save= By.xpath("//input[@value='Save Account Information']");
	WebElement we_save =wt.ElementToBeClickable(by_save,10);
	we_save.click();
	}
	//Method to register with valid credentials
	public  void do_reg(String un,String pd,String cpd,String nm,String ln,String eml,String ph,String a1,String a2,String ct,String st,String zp,String ctr) {
		
		obj=new Register_page(dr);
		obj.unm(un);
		obj.pdm(pd);
		obj.cpdm(cpd);
		obj.fnm(nm);
		obj.lnm(ln);
		obj.eidm(eml);
		obj.pnm(ph);
		obj.ad1m(a1);
		obj.ad2m(a2);
		obj.ctnm(ct);
		obj.snm(st);
		obj.zipm(zp);
		obj.cnm(ctr);
		obj.lpm();
		obj.cat();
		obj.ltm();
		obj.bnm();
		obj.sm();
		
	}
	

}
