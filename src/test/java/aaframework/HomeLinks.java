package aaframework;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.HomePagePF;
import resources.Base;

public class HomeLinks extends Base{
	public WebDriver driver;
	HomePagePF hp;
	
	
	@BeforeTest
	public void browserInitiase() throws IOException {
		driver = initialiseBrowser();
		driver.get(prop.getProperty("url"));
	}

	@Test
	public void mobileLinkTest() throws InterruptedException {
		hp  = new HomePagePF(driver);
		hp.getMobiles().click();
		Thread.sleep(2000);
		String actualMobile = driver.getTitle();
		System.out.println(actualMobile);
		String expectedMobile = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
		Assert.assertEquals(actualMobile, expectedMobile);
	}
	
	@Test
	public void bestSellersTest() throws InterruptedException {
		hp  = new HomePagePF(driver);
		hp.getBestSellersLink().click();
		Thread.sleep(2000);
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "Amazon.in Bestsellers: The most popular items on Amazon";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test
	public void todaysDealsTest() throws InterruptedException {
		hp  = new HomePagePF(driver);
		hp.getTodayDealsLink().click();
		Thread.sleep(2000);
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "Amazon.in Today's Deals: Great Savings. Every Day.";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test
	public void computersTest() throws InterruptedException {
		hp  = new HomePagePF(driver);
		hp.getComputersLink().click();
		Thread.sleep(2000);
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "Computers & Accessories: Buy Computers & Accessories Online at Low Prices in India - Amazon.in";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test
	public void pantryTest() throws InterruptedException {
		hp  = new HomePagePF(driver);
		hp.getPantryLink().click();
		Thread.sleep(2000);
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "Amazon Pantry: The Online Grocery Shopping Store- Shop Daily Grocery Items and Get delivered in Next Day- Amazon.in";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test
	public void booksTest() throws InterruptedException {
		hp  = new HomePagePF(driver);
		hp.getBooksLink().click();
		Thread.sleep(2000);
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "Book Store Online : Buy Books Online at Best Prices in India | Books Shopping @ Amazon.in";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test
	public void giftIdeasTest() throws InterruptedException {
		hp  = new HomePagePF(driver);
		hp.getGiftIdeasLink().click();
		Thread.sleep(2000);
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "Gifts for Everyone | Amazon.in Gift Finder";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test
	public void newReleasesTest() throws InterruptedException {
		hp  = new HomePagePF(driver);
		hp.getNewReleasesLink().click();
		Thread.sleep(2000);
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "Amazon.in Hot New Releases: The bestselling new and future releases on Amazon";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test
	public void customerServiceTest() throws InterruptedException {
		hp  = new HomePagePF(driver);
		hp.getCustomerServicesLink().click();
		Thread.sleep(2000);
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "Amazon.in Help: Help";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test
	public void amazonPayTest() throws InterruptedException {
		hp  = new HomePagePF(driver);
		hp.getAmazonPayLink().click();
		Thread.sleep(2000);
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "Amazon Pay";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
	
	
	
}
