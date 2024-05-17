package curs22;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class CssSelectorExample extends BaseTest{
	
	//@Test
	public void cssExample1() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//direct child
		driver.findElement(By.cssSelector("li[class='menu_user_login']>a[href='#popup_login']")).click();
		
		//descendant --> adica intre elem parinte si cel copil punem un caracter spatiu
		WebElement username = driver.findElement(By.cssSelector("ul[id='menu_user'] input[name='log']"));
		js.executeScript("arguments[0].setAttribute('style', 'background:yellow ;border:10px solid green')", 
				username);
		
		WebElement pass = driver.findElement(By.cssSelector("ul#menu_user form.login_form>div>input[name='pwd']"));
		js.executeScript("arguments[0].setAttribute('style', 'background:yellow ;border:10px solid green')", 
				pass);
		
		WebElement submitButton = driver.findElement(By.cssSelector("ul form[name='login_form'] input:not([type='text'],[type='password'],[type='hidden'],[type='checkbox'])"));
		js.executeScript("arguments[0].setAttribute('style', 'background:yellow ;border:10px solid green')", 
				submitButton);
		
		//checked (gaseste locatorul care are bifa checked)
		//daca nu are bifa pusa nu gaseste locatorul --> rezult in NoSuchElementException
		//--> ul input[id='rememberme']:checked
		
		//disabled (identifica elemente care au atributul disabled=true)
		//--> ul input:disabled
		//ul input:enabled
	}
	
	//@Test
	public void cssSelectorExample2() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//first-of-type
		WebElement newReleasesMenu = driver.findElement(By.cssSelector("ul[class*='sc_tabs_title']>li:first-of-type"));
		js.executeScript("arguments[0].setAttribute('style', 'background:yellow ;border:10px solid green')", 
				newReleasesMenu);
		
		//nth-of-type
		WebElement comingSoonMenu = driver.findElement(By.cssSelector("ul[class*='sc_tabs_title']>li:nth-of-type(2)"));
		js.executeScript("arguments[0].setAttribute('style', 'background:yellow ;border:10px solid green')", 
				comingSoonMenu);
		
		WebElement bestSellersMenu = driver.findElement(By.cssSelector("ul[class*='sc_tabs_title']>li:nth-of-type(3)"));
		js.executeScript("arguments[0].setAttribute('style', 'background:yellow ;border:10px solid green')", 
				bestSellersMenu);
		//last-of-type
		WebElement awardWinnersMenu = driver.findElement(By.cssSelector("ul[class*='sc_tabs_title']>li:last-of-type"));
		js.executeScript("arguments[0].setAttribute('style', 'background:yellow ;border:10px solid green')", 
				awardWinnersMenu);
	}
	
	@Test
	public void cssSelectorExample3() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		driver.findElement(By.cssSelector("div[class='menu_main_wrap'] a[href*='shop/']")).click();
		
		Actions action = new Actions(driver);
		action.scrollByAmount(0, 1200).perform();
		
		//first-child
		WebElement category1 = driver.findElement(By.cssSelector("ul[class='product-categories']>li:first-child"));
		js.executeScript("arguments[0].setAttribute('style', 'background:yellow ;border:10px solid green')", 
				category1);
		
		//nth-child
		WebElement category4 = driver.findElement(By.cssSelector("ul[class='product-categories']>li:nth-child(4)"));
		js.executeScript("arguments[0].setAttribute('style', 'background:yellow ;border:10px solid green')", 
				category4);
		
		//last-child
		WebElement category11 = driver.findElement(By.cssSelector("ul[class='product-categories']>li:last-child"));
		js.executeScript("arguments[0].setAttribute('style', 'background:yellow ;border:10px solid green')", 
				category11);
		
		//selectez din n in n(n=ce nr vreau eu) facand enter in acel find al paginii
		//--> ul[class='product-categories']>li:nth-child(3n) //din 3 in 3 elemente
		//--> ul[class='product-categories']>li:nth-child(3n+2) //+2 incepand de la elem nr 2 pleaca din 3 in 3, +x il alegem noi
		
		//selectez odd/even
		//--> ul[class='product-categories']>li:nth-child(odd)
		
		for(int i=0; i<10; i++) {
			driver.findElement(By.cssSelector("ul[class='product-categories']>li:nth-child(3n"+i+")"));
			driver.findElement(By.cssSelector("ul[class='product-categories']>li:nth-child("+i+"n"+i+")"));
		}
	}
}
