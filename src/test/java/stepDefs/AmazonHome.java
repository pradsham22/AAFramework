package stepDefs;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.HomePagePF;
import resources.Base;

public class AmazonHome extends Base{
	public WebDriver driver;
	HomePagePF hp;
	
	@Given("I am on Amazon India home page")
	public void i_am_on_amazon_india_home_page() throws IOException{
	    // Write code here that turns the phrase above into concrete actions
		driver = initialiseBrowser();
		driver.get(prop.getProperty("url"));
	}

	@When("I click on Mobiles link")
	public void i_click_on_mobiles_link() {
	    // Write code here that turns the phrase above into concrete actions
		hp  = new HomePagePF(driver);
		hp.getMobiles().click();
	}

	@Then("I am redirected to Mobiles web page")
	public void i_am_redirected_to_mobiles_web_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		String actualMobile = driver.getTitle();
//		System.out.println(actualMobile);
		String expectedMobile = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
		Assert.assertEquals(actualMobile, expectedMobile);
		driver.close();
	}
	 

    @When("^I click on BestSellers link$")
    public void i_click_on_bestsellers_link() throws Throwable {
        hp  = new HomePagePF(driver);
		hp.getBestSellersLink().click();
    }

    @Then("^I am redirected to Best Sellers web page$")
    public void i_am_redirected_to_best_sellers_web_page() throws Throwable {
    	Thread.sleep(2000);
		String actualTitle = driver.getTitle();
//		System.out.println(actualTitle);
		String expectedTitle = "Amazon.in Bestsellers: The most popular items on Amazon";
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.close();
    }
    
    @When("I click on Todays Deals link")
    public void i_click_on_todays_deals_link() {
    	hp  = new HomePagePF(driver);
		hp.getTodayDealsLink().click();
    }

    @Then("I am redirected to Todays Deals web page")
    public void i_am_redirected_to_todays_deals_web_page() throws InterruptedException {
    	Thread.sleep(2000);
		String actualTitle = driver.getTitle();
//		System.out.println(actualTitle);
		String expectedTitle = "Amazon.in Today's Deals: Great Savings. Every Day.";
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.close();
    }

    @When("I click on Computers link")
    public void i_click_on_computers_link() {
    	hp  = new HomePagePF(driver);
		hp.getComputersLink().click();
    }

    @Then("I am redirected to Computers web page")
    public void i_am_redirected_to_computers_web_page() throws InterruptedException {
    	Thread.sleep(2000);
		String actualTitle = driver.getTitle();
//		System.out.println(actualTitle);
		String expectedTitle = "Computers & Accessories: Buy Computers & Accessories Online at Low Prices in India - Amazon.in";
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.close();
    }

    @When("I click on Pantry link")
    public void i_click_on_pantry_link() {
    	hp  = new HomePagePF(driver);
		hp.getPantryLink().click();
    }

    @Then("I am redirected to Amazon Pantry web page")
    public void i_am_redirected_to_amazon_pantry_web_page() throws InterruptedException {
    	Thread.sleep(2000);
		String actualTitle = driver.getTitle();
//		System.out.println(actualTitle);
		String expectedTitle = "Amazon Pantry: The Online Grocery Shopping Store- Shop Daily Grocery Items and Get delivered in Next Day- Amazon.in";
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.close();
    }

    @When("I click on Books link")
    public void i_click_on_books_link() {
    	hp  = new HomePagePF(driver);
		hp.getBooksLink().click();
    }

    @Then("I am redirected to Books web page")
    public void i_am_redirected_to_books_web_page() throws InterruptedException {
    	Thread.sleep(2000);
		String actualTitle = driver.getTitle();
//		System.out.println(actualTitle);
		String expectedTitle = "Book Store Online : Buy Books Online at Best Prices in India | Books Shopping @ Amazon.in";
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.close();
    }

    @When("I click on Gift Ideas link")
    public void i_click_on_gift_ideas_link() {
    	hp  = new HomePagePF(driver);
		hp.getGiftIdeasLink().click();
    }

    @Then("I am redirected to Gift Ideas web page")
    public void i_am_redirected_to_gift_ideas_web_page() throws InterruptedException {
    	Thread.sleep(2000);
		String actualTitle = driver.getTitle();
//		System.out.println(actualTitle);
		String expectedTitle = "Gifts for Everyone | Amazon.in Gift Finder";
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.close();
    }

    @When("I click on New Releases link")
    public void i_click_on_new_releases_link() {
    	hp  = new HomePagePF(driver);
		hp.getNewReleasesLink().click();
    }

    @Then("I am redirected to New Releases web page")
    public void i_am_redirected_to_new_releases_web_page() throws InterruptedException {
    	Thread.sleep(2000);
		String actualTitle = driver.getTitle();
//		System.out.println(actualTitle);
		String expectedTitle = "Amazon.in Hot New Releases: The bestselling new and future releases on Amazon";
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.close();
    }

    @When("I click on Customer Service link")
    public void i_click_on_customer_service_link() {
    	hp  = new HomePagePF(driver);
		hp.getCustomerServicesLink().click();
    }

    @Then("I am redirected to Customer Service web page")
    public void i_am_redirected_to_customer_service_web_page() throws InterruptedException {
    	Thread.sleep(2000);
		String actualTitle = driver.getTitle();
//		System.out.println(actualTitle);
		String expectedTitle = "Amazon.in Help: Help";
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.close();
    }

    @When("I click on Amazon Pay link")
    public void i_click_on_amazon_pay_link() {
    	hp  = new HomePagePF(driver);
		hp.getAmazonPayLink().click();
    }

    @Then("I am redirected to Amazon Pay web page")
    public void i_am_redirected_to_amazon_pay_web_page() throws InterruptedException {
		Thread.sleep(3000);
		String actualTitle = driver.getTitle();
//		System.out.println(actualTitle);
		String expectedTitle = "Amazon Pay";
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.close();
    }
 
}
