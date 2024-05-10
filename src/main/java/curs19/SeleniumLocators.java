package curs19;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class SeleniumLocators extends BaseTest{

	/*
	 * 8 locatori (locator=cum identifci un element intr-o aplicatie) F12 sau more tools > web developer tools (Inspector in firefox, Elements in chrome)
	 * tagname
	 * linktext
	 * partial Link text
	 * id
	 * class
	 * name
	 * css selector
	 * xpath
	 * 
	 * 
	 * 5 relative locators(metode, strategii de identificare)
	 *toLeftOf
	 *toRightOf
	 *below
	 *above
	 *near
	 *
	 * */
	
	@Test(priority=1)
	public void tagNameLocator() {
		WebElement discoverText = driver.findElement(By.tagName("em"));
		String text = discoverText.getText();//return textul dintre tagul html 
		System.out.println(text);
		assertEquals(text,"Discover");
	}
	
	@Test(priority=2)
	public void linkTextLocator() {//unde e tag a
		driver.findElement(By.linkText("BOOKS")).click();
		driver.getCurrentUrl();//citeste url crt la care se afla browserul
		assertEquals(driver.getCurrentUrl(),"https://keybooks.ro/shop/");
	}
	
	@Test(priority=3)
	public void partialLinkTextLocator() {
		driver.findElement(By.partialLinkText("Healthy")).click();
		WebElement booksCategory = driver.findElement(By.linkText("Cookbooks"));
		assertTrue(booksCategory.isDisplayed());
	}
	
	@Test(priority=4)
	public void classNameLocator() {
		WebElement price = driver.findElement(By.className("price"));
		System.out.println(price.getText());
		assertTrue(price.getText().contains("18.49"));
	}
	
	@Test(priority=5)
	public void idLocator() {
		WebElement reviewTab = driver.findElement(By.id("tab-title-reviews"));
		reviewTab.click();
		WebElement commentBox = driver.findElement(By.id("comment"));
		assertTrue(commentBox.isDisplayed());
	}
	
	@Test(priority=6)
	public void nameLocator() throws InterruptedException {
		WebElement commentBox = driver.findElement(By.name("comment"));
		commentBox.sendKeys("Super mesaj!");
		Thread.sleep(3000);
		commentBox.clear();//sterge val prezenta intr-un input sau textarea field
		commentBox.sendKeys("Alt super mesaj!");
	}
	
	@Test(priority=7)
	public void cssSelectorLocator() {
		driver.findElement(By.cssSelector("input[id='author']")).sendKeys("Jhon Doe");
	}
	
	@Test(priority=8)
	public void xpathLocator() {
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("test@test");
	}
}
