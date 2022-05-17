package Module1_Donor_Management;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CRM_Opportunity_page 
{

	@FindBy(xpath = "(//input[@role=\"combobox\"])[4]")private WebElement cause;
	@FindBy(xpath = "//label[text()='One-time']")private WebElement clickondonationtype;
	@FindBy(xpath = "(//div[@title=\"Cultivate\"])[1]")private WebElement clickoncultivate;
	@FindBy(xpath = "(//div[@class='pa-a pa-bd pa-o pa-as flexbox'])[2]")private WebElement clickonnextstage;
	@FindBy(xpath = "//input[@aria-label='Date of Payment Due Date']")private WebElement paymentduedate;
	@FindBy(xpath = "//button[@aria-label='Next Stage']")private WebElement clicknextbtn;
	@FindBy(xpath = "//button[@aria-label='Finish']")private WebElement clickfinishbtn;
	
	public CRM_Opportunity_page (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setCRMopportunitypagecause(String username) throws InterruptedException
	{
//		WebElement type = driver.findElement(By.xpath("(//input[@role=\"combobox\"])[4]"));
//		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
//		s.selectByIndex(1);
		
		cause.clear();
		Thread.sleep(2000);
		cause.sendKeys("Environment");
	}
	
	public void clickondonationtype()
	{
		clickondonationtype.click();
	}
	public void clickoncultivatebtn()
	{
		clickoncultivate.click();
	}
	public void clickonnextstagebtn()
	{
		clickonnextstage.click();
	}
	public void setCRMopportunitypagepayment(String username)
	{
		paymentduedate.sendKeys("05/30/2022");
	}
	public void clickonRediness(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Ask Readiness']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(2);	
	}
	public void clickonrequestfordonation(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Request for Donation']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);	
	}
	public void clickonconcern(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Resolve Concerns']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);	
	}
	public void clickonnextbtn()
	{
		clicknextbtn.click();
	}
	public void clickonMarketinglist(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Add to Marketing List']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);	
	}
	public void clickonPayentrecived(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='First Payment Received']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);	
	}
	public void clickonThankyou(WebDriver driver)
	{
		WebElement type = driver.findElement(By.xpath("//select[@aria-label='Send - Thank You?']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(type);
		s.selectByIndex(1);	
	}
	public void clickonFinish()
	{
		clickfinishbtn.click();
	}
}
