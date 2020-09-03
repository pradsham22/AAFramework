package stepDefs;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.HomePagePF;
import resources.Base;


public class AccountNList extends Base{
	public WebDriver driver;
	public HomePagePF hp;// = new HomePagePF(driver);
	Actions action;
	
	String yourLists[] = { "Create a Wish List", "Find a Wish List" , "Wish from Any Website", 
			"Baby Wish List", "Discover Your Style"};
	List<String> yourListItems;

	String yourAccount[] = { "Your Account", "Your Orders" , "Your Recommendations", "Your Wish List",
			"Your Prime Membership", "Your Prime Video","Your Subscribe & Save Items","Memberships & Subscriptions",
			"Your Amazon Business Account","Your Seller Account","Manage Your Content and Devices"}; //  
	List<String> yourAccountList;
	
	public void declare() {
		action = new Actions(driver);
		hp = new HomePagePF(driver);
		yourListItems = Arrays.asList(yourLists);		//to load your list options
		yourAccountList = Arrays.asList(yourAccount);	// to load your account options
		hp = new HomePagePF(driver);
		
		
	}
	
	@Given("I am on AmazonIndia home page")
	public void i_am_on_amazonIndia_home_page() throws IOException{
	    // Write code here that turns the phrase above into concrete actions
		driver = initialiseBrowser();
		driver.get(prop.getProperty("url"));
	}
	
	@When("I hover over Accounts and Links section")
	public void i_hover_over_accounts_and_links_section() throws IOException, InterruptedException {
		declare();
		action.moveToElement(hp.getAccouintAndList()).build().perform();
		
	}
	
	
	@Then("Appropriate link options are displayed under Your List section")
	public void appropriate_link_options_are_displayed_under_your_list_section() throws IOException, InterruptedException {
		int j = 0;
		System.out.println("Your actual list menu size is: " + hp.getyLists().size());
		
		for (WebElement ylist: hp.getyLists())
		{
			
			try {
				if (prop.getProperty("browser").contains("firefox")) {
					Thread.sleep(500);
				}
				Assert.assertTrue(yourListItems.contains(ylist.getText()));
				if (true)
				{
					if (prop.getProperty("browser").contains("firefox")) {
						Thread.sleep(500);
					}
					System.out.println(ylist.getText());
					j++;
				}
				
			} catch (java.lang.AssertionError e) {
				Assert.fail("'"+ylist.getText() + "'" + " is NOT present.   ERROR:: " + e);
				
			} 			finally {
				if (j == hp.getyLists().size())
				{
					break;
				}
			}
			
		}
		driver.close();
	}
	
	@Then("Appropriate list options options are displayed under Your Account section")
	public void appropriate_list_options_options_are_displayed_under_your_account_section() throws IOException, InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Your Account menu size is: " + hp.getAccountList().size());
		
		int j = 0;
		for (WebElement yAccount : hp.getAccountList() )
		{
			System.out.println(yAccount.getText());
			try {
				if (prop.getProperty("browser").contains("firefox")) {
					Thread.sleep(500);
				}
				Assert.assertTrue(yourAccountList.contains(yAccount.getText()));
				if (true)
				{
					if (prop.getProperty("browser").contains("firefox")) {
						Thread.sleep(500);
					}
//					System.out.println(yAccount.getText());
					j++;
				}
			} catch (java.lang.AssertionError e) {
				Assert.fail("ERROR ::  " + yAccount.getText() + "'" + " is NOT present.  --"   + e);
				
			} finally {
				if (j == hp.getAccountList().size())
				{
					break;
				}
			}
			
		}	
	   driver.close();
	}

}
