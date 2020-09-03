package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePagePF {
	public WebDriver driver;
	
	public HomePagePF(WebDriver driver) {
		this.driver = driver;
	}
	////a[@id='nav-link-accountList']
//	private By accouintAndList = By.xpath("//span[text()='Account & Lists']");
	private By accouintAndList = By.xpath("//a[@id='nav-link-accountList']");
	private By yLists = By.xpath("//div[@id='nav-al-wishlist']/a");
	private By AccountList = By.xpath("//div[@id='nav-al-your-account']/a");	 
	
	private By mobileLink = By.xpath("//div[@id='nav-xshop']//a[text()='Mobiles']");
	private By bestSellersLink = By.xpath("//div[@id='nav-xshop']/a[text()='Best Sellers']");
	private By todayDealsLink = By.xpath("//div[@id='nav-xshop']/a[text()=\"Today's Deals\"]");
	private By computersLink = By.xpath("//div[@id='nav-xshop']/a[text()='Computers']");
	private By pantryLink = By.xpath("//div[@id='nav-xshop']/a[text()='Pantry']");
	private By booksLink = By.xpath("//div[@id='nav-xshop']/a[text()='Books']");
	private By giftIdeasLink = By.xpath("//div[@id='nav-xshop']/a[contains(text(),'Gift Ideas')]");
	private By newReleasesLink = By.xpath("//div[@id='nav-xshop']/a[text()='New Releases']");
	private By customerServicesLink = By.xpath("//div[@id='nav-xshop']/a[text()='Customer Service']");
	private By amazonPayLink = By.xpath("//div[@id='nav-xshop']/a[text()='Amazon Pay']");
	private By sellLink = By.xpath("//div[@id='nav-xshop']/a[text()='Sell']");
	
	
	public WebElement getAccouintAndList() {
		return driver.findElement(accouintAndList);
	}
	
	public List<WebElement> getyLists() {
		return driver.findElements(yLists);
	}
	
	public List<WebElement> getAccountList() {
		return driver.findElements(AccountList);
	}
	
	public WebElement getMobiles() {
			return driver.findElement(mobileLink);
	}
	
	public WebElement getBestSellersLink() {
		return driver.findElement(bestSellersLink);
	}
	
	public WebElement getTodayDealsLink() {
		return driver.findElement(todayDealsLink);
	}
	
	public WebElement getComputersLink() {
		return driver.findElement(computersLink);
	}
	
	public WebElement getPantryLink() {
		return driver.findElement(pantryLink);
	}
	
	public WebElement getBooksLink() {
		return driver.findElement(booksLink);
	}
	
	public WebElement getGiftIdeasLink() {
		return driver.findElement(giftIdeasLink);
	}
	
	public WebElement getNewReleasesLink() {
		return driver.findElement(newReleasesLink);
	}
	
	public WebElement getCustomerServicesLink() {
		return driver.findElement(customerServicesLink);
	}
	
	public WebElement getAmazonPayLink() {
		return driver.findElement(amazonPayLink);
	}
	
	public WebElement getSellLink() {
		return driver.findElement(sellLink);
	}
	
	
	
}
