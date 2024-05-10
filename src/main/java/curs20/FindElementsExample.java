package curs20;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class FindElementsExample extends BaseTest {

	@Test
	public void testFindElements() {
		List<WebElement> bookPictures = driver.findElements(By.cssSelector("figure[class='sc_image  sc_image_shape_square']"));
		
		System.out.println(bookPictures.size());
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style','border:6px solid green')", bookPictures.get(2));
		
		//bookPictures.get(1).click();
		
	}
}
