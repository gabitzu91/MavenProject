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
}
