package curs21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.utils.BaseTest;

public class CssSelectorExample extends BaseTest{

	/*
	 * Element html <li class="menu_user_login">
	 * 
	 * sintaxa : tagname[atribut = valoare_atribut]
	 * tagname : li
	 * atribut : class
	 * valoare_atribut : menu_user_login
	 * 
	 * Css -> li[class='menu_user_login']
	 * 
	 * Css selector pentru atribut CLASS --> .
	 * .menu_user_login --> [class="menu_user_login"]
	 * li.menu_user_login --> li[class="menu_user_login"]
	 *
	 * Css selector pentru atribut ID --> #
	 * Ex2:
	 * ul[id="menu_user"]
	 * 
	 * #menu_user --> [id="menu_user"]
	 * ul#menu_user --> ul[id="menu_user"]
	 * 
	 * 
	 * */
	
	//@Test
	public void cssSelectorExample() {
		driver.findElement(By.cssSelector("li[class='menu_user_login']")).click();
		//AND
		driver.findElement(By.cssSelector("input[name='log'][placeholder='Login or Email']")).sendKeys("Test");
		//OR
		driver.findElement(By.cssSelector("input[type='password'],[name='pwd']")).sendKeys("Test");
	}
	
	@Test
	public void cssSelectorExample2() {
		
		// * --> contains
		//Ex: a[href='its-a-really-strange-story']
		//    a[href*='really']
		WebElement book1 = driver.findElement(By.cssSelector("a[href*='really']"));
		System.out.println(book1.getText());
		// ^ --> starts with
		//a[href^='life']
		WebElement book2 = driver.findElement(By.cssSelector("a[href^='life']"));
		System.out.println(book2.getText());
		// $ -->ends with
		//a[href$='orest']
		WebElement book3 = driver.findElement(By.cssSelector("a[href$='orest']"));
		System.out.println(book3.getText());
		// ~ --> contains
		//h3[class~='sc_title']
		WebElement book4 = driver.findElement(By.cssSelector("h3[class~='sc_title']"));
		System.out.println(book4.getText());
		
		//test pt git
	}
}
