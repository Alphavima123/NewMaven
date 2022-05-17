package Portal_page2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 
public class DonorLoginPage2_7
{
//1
	@FindBy(xpath="//label[@for='dntmnthly']") private WebElement Donatemonthly;
    @FindBy(xpath="//button[@value='25']") private WebElement DonationAmount;
    @FindBy(xpath="//a[@href='#next']") private WebElement Next;
	@FindBy(xpath="//label[@for='cause']") private WebElement CauseFund;
	@FindBy(xpath="(//label[@class='control'])[1]") private WebElement Tributegift;
	@FindBy(xpath="//input[@name='bs_honor']") private WebElement TributeName;
	@FindBy(xpath="//a[@href='#next']") private WebElement Next2;
	@FindBy(xpath="//input[@placeholder='First Name']") private WebElement ContactInfo_Fname;
	@FindBy(xpath="//input[@placeholder='Last Name']") private WebElement ContactInfo_lname;
	@FindBy(xpath="//input[@placeholder='Email Address']") private WebElement ContactInfo_Email;
	@FindBy(xpath="//input[@placeholder='Phone No.']") private WebElement ContactInfo_phoneno;
	@FindBy(xpath="//input[@name='birthdate']") private WebElement Birthday;
	@FindBy(xpath="//input[@name='address']") private WebElement Address_Eadd;
	@FindBy(xpath="//input[@name='addressltwo']") private WebElement Address1_Eadd1;
	@FindBy(xpath="//input[@name='addressltwo']") private WebElement Address1_Eadd2;
	@FindBy(xpath="//input[@name='city']") private WebElement Address_Ecity;
	@FindBy(xpath="//input[@name='country']") private WebElement Address_Ecountry;
	@FindBy(xpath="//input[@name='state']") private WebElement Address_Estate;
	@FindBy(xpath="//input[@name='postcode']") private WebElement Address_postalcode;
	@FindBy(xpath="//input[@name='cardnumber']") private WebElement CardDetails_cardno;
//	@FindBy(xpath="//select[@id='cardexpireyear']") private WebElement CardDetails_Eyear;
//	@FindBy(xpath="//select[@id='cardexpiremonth']") private WebElement CardDetails_Emonth;
	@FindBy(xpath="//input[@name='cardcvc']") private WebElement CardDetails_cardcvv;
	@FindBy(xpath="//label[@for='nopublic']") private WebElement PublishNo;
	@FindBy(xpath="//a[@href='#finish']") private WebElement Finish;
//2	
	public DonorLoginPage2_7 (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

//	3
	public void clickDonorLoginPage2_7Dmonthly() {
		Donatemonthly.click();	
	}
	public void clickDonorLoginPage2_7DAmount() {
		DonationAmount.click();	
	}
	public void clickDonorLoginPage2_7Next() {
		Next.click();
	}
	public void clickDonorLoginPage2_7CFund() {
		CauseFund.click();
	}
	
	public void clickoncause(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@name='sel_cause']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(2);
	}
	public void clickDonorLoginPage2_7tgift() {
		Tributegift.click();
	}
	
	public void clickonTributegift(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@name='sel_city']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);
	}
	public void setDonorLoginPage2_7Tname(String tname) {
		TributeName.sendKeys(tname);
	}
	public void clickDonorLoginPage2_7Next2() {
		Next2.click();
	}
	
	public void setDonorLoginPage2_7Fname(String Fname) {
		ContactInfo_Fname.sendKeys(Fname);
	}
	public void setDonorLoginPage2_7Lname(String Lname) {
		ContactInfo_lname.sendKeys(Lname);
	}
	
	public void setDonorLoginPage2_7Email(String Email) {
		ContactInfo_Email.sendKeys(Email);
	}
	public void setDonorLoginPage2_7Number(String Phoneno) {
		ContactInfo_phoneno.sendKeys(Phoneno);
	}
	public void setDonorLoginPage2_7Birthday() {
		Birthday.sendKeys("12/03/1984");
	}
	
	public void setDonorLoginPage2_7Address(String Adress) {
		Address_Eadd.sendKeys(Adress);
	}
	public void setDonorLoginPage2_7Address1(String Adress1) {
		Address1_Eadd1.sendKeys(Adress1);
	}
	public void setDonorLoginPage2_7Address2(String Adress2) {
		Address1_Eadd1.sendKeys(Adress2);
	}
	public void setDonorLoginPage2_7City(String City) {
		Address_Ecity.sendKeys(City);
	}
	public void setDonorLoginPage2_7country(String Country) {
		Address_Ecountry.sendKeys(Country);
	}
	public void setDonorLoginPage2_7State(String State) {
		Address_Estate.sendKeys(State);
	}
	public void setDonorLoginPage2_7code(String Postalcode) {
		Address_postalcode.sendKeys(Postalcode);
	}
	public void setDonorLoginPage2_7card(String cardno) 
	{
		CardDetails_cardno.sendKeys(cardno);
	}
	
	public void clickonyear(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@id='cardexpireyear']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(3);
	}
	public void clickonmonth(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@id='cardexpiremonth']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(3);
	}
	
	public void setDonorLoginPage2_7cvv(String cvvNo)
	{
		CardDetails_cardcvv.sendKeys(cvvNo);
	}
	public void clickDonorLoginPage2_7publishno() {
		PublishNo.click();
	}
	public void clickDonorLoginPage2_7finish() {
		Finish.click();
	}
	
}
