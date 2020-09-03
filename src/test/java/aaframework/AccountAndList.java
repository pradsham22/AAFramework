package aaframework;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.HomePagePF;
import resources.Base;

public class AccountAndList extends Base{
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void browserInitiase() throws IOException {
		driver = initialiseBrowser();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void yourLists(){
		// loading expected drop down Items	
		String yourLists[] = { "Create a Wish List", "Find a Wish List" , "Wish from Any Website", 
				"Baby Wish List", "Discover Your Style"}; 	//  
		List<String> yourListItems = Arrays.asList(yourLists);
		System.out.println("Expected list size is " + yourListItems.size());
			
		Actions action = new Actions(driver);
		HomePagePF hp = new HomePagePF(driver);
		action.moveToElement(hp.getAccouintAndList()).build().perform();
		
//		List<WebElement> yLists = driver.findElements(By.xpath("//div[@id='nav-al-wishlist']/a"));
		System.out.println("Amazon IN list size is " + hp.getyLists().size());  
		
		int j = 0;
		for (WebElement ylist: hp.getyLists() )
		{
			
			try {
				Assert.assertTrue(yourListItems.contains(ylist.getText()));
				if (true)
//				if (yourListItems.contains(ylist.getText()))
				{
					System.out.println(ylist.getText().toUpperCase());
					j++;
				}
			} catch (java.lang.AssertionError e) {
//				System.out.println("'"+ylist.getText() + "'" + "is NOT present.   ERROR:: " + e);
				Assert.fail("'"+ylist.getText() + "'" + " is NOT present.   ERROR:: " + e);
				
			} finally {
				if (j == hp.getyLists().size())
				{
					break;
				}
			}
			
		}		
		
	}
	
	@Test
	public void yourAccountTest() {
		// loading expected drop down Items	
		String yourAccount[] = { "Your Account", "Your Orders" , "Your Recommendations", "Your Wish List",
				"Your Prime Membership", "Your Prime Video","Your Subscribe & Save Items","Memberships & Subscriptions",
				"Your Amazon Business Account","Your Seller Account","Manage Your Content and Devices"}; //  
		List<String> yourAccountList = Arrays.asList(yourAccount);
		System.out.println("Expected list size is " + yourAccountList.size());
			
		Actions action = new Actions(driver);
		HomePagePF hp = new HomePagePF(driver);
//				WebElement accountHover = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		action.moveToElement(hp.getAccouintAndList()).build().perform();
		
//				List<WebElement> AccountList = driver.findElements(By.xpath("//div[@id='nav-al-your-account']/a"));
		System.out.println("Amazon IN list size is " + hp.getAccountList().size());
		
		int j = 0;
		for (WebElement yAccount : hp.getAccountList() )
		{
			
			try {
				Assert.assertTrue(yourAccountList.contains(yAccount.getText()));
				if (true)
				{
					System.out.println(yAccount.getText().toUpperCase());
					j++;
				}
			} catch (java.lang.AssertionError e) {
//				System.out.println("'"+yAccount.getText() + "'" + "is NOT present.   ERROR:: " + e);
				Assert.fail("ERROR ::  '" + yAccount.getText() + "'" + " is NOT present.  --"   + e);
				
			} finally {
				if (j == hp.getAccountList().size())
				{
					break;
				}
			}
			
		}		
		
	}
	
//	@Test
	public void DeliberateFail() {
		Assert.fail("This is deliberately failed script.");
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
