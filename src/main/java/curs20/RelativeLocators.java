package curs20;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class RelativeLocators extends BaseTest {

	/*
	 *toLeftOf
	 *toRightOf
	 *below
	 *above
	 *near
	 */
	
	@Test
	public void relativeLocatorsExample() {
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		//toLeftOf
		WebElement price = driver.findElement(RelativeLocator.with(By.cssSelector("h5[class*='sc_title_regular']")).toLeftOf(By.linkText("Life in the garden")));
		js.executeScript("arguments[0].setAttribute('style', 'border:10px solid green')", 
				price);
		
		//toRightOf
		WebElement price2 = driver.findElement(RelativeLocator.with(By.cssSelector("h5[class*='sc_title_regular']")).toRightOf(By.linkText("Life in the garden")));
		js.executeScript("arguments[0].setAttribute('style', 'border:10px solid purple')", 
						price2);
		
		//above
		WebElement author = driver.findElement(RelativeLocator.with(By.cssSelector("div[class='wpb_wrapper']")).above(price));
		js.executeScript("arguments[0].setAttribute('style', 'border:10px solid blue')", 
				author);
		
		//below
		WebElement author2 = driver.findElement(RelativeLocator.with(By.cssSelector("div[class='wpb_wrapper']")).below(By.linkText("Life in the garden")));
		js.executeScript("arguments[0].setAttribute('style', 'border:10px solid red')", 
				author2);
		
		//near
		WebElement picture = driver.findElement(RelativeLocator.with(By.cssSelector("img[src='https://keybooks.ro/wp-content/uploads/2016/04/book3.jpg']")).near(By.linkText("Life in the garden"), 300));
		js.executeScript("arguments[0].setAttribute('style', 'border:10px solid black')", 
				picture);
	}
	
}
