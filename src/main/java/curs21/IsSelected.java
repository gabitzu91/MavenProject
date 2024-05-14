package curs21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class IsSelected extends BaseTest{

	/*
	 * isDisplayed()--> se aplica pe toate tipurile de elemente
	 * isSelected()--> se aplica doar pe elem care au atrib 
	 * 				   type=checkbox sau radio button
	 * isEnabled()--> se aplica pe elem de tip input
	 */

	@Test
	public void isSelectedTest() throws InterruptedException {
		driver.findElement(By.cssSelector("li[class='menu_user_login']")).click();
		
		WebElement userField = driver.findElement(By.id("log"));
		System.out.println(userField.isSelected());
		
		userField.click();
		Thread.sleep(5000);
		System.out.println(userField.isSelected());
		
		System.out.println("--------------------");
		
		WebElement checkbox = driver.findElement(By.id("rememberme"));
		System.out.println(checkbox.isSelected());
		
		checkbox.click();
		System.out.println(checkbox.isSelected());
		
		
	}
}
