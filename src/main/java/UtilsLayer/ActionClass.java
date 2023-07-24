package UtilsLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseLayer.BaseClass;

public class ActionClass extends BaseClass{

	public static void click(WebElement wb)
	{
//		Actions act = new Actions(driver);
//		act.click().build().perform();
		
		new Actions(driver).click(wb).build().perform();
	}
	public static void doubleClick(WebElement wb)
	{
//		Actions act = new Actions(driver);
//		act.doubleClick(wb).build().perform();
		
		new Actions(driver).doubleClick().build().perform();
	}
	public static void rightClick(WebElement wb)
	{
		new Actions(driver).contextClick(wb).build().perform();
	}
	public static void moveToElement(WebElement wb)
	{
		new Actions(driver).moveToElement(wb).build().perform();
	}
	public static void dragAndDrop(WebElement src,WebElement trg)
	{
		new Actions(driver).dragAndDrop(src, trg).build().perform();
	}
	public static void clickAndHold(WebElement wb)
	{
		new Actions(driver).clickAndHold(wb).build().perform();
	}
	public static void release(WebElement trg)
	{
		new Actions(driver).release(trg).build().perform();
	}
	public static void sendKeys(WebElement wb, String value)
	{
		new Actions(driver).sendKeys(wb, value).build().perform();
	}
	public static void sendKeysInUpperCase(WebElement wb, String value)
	{
		new Actions(driver).keyDown(Keys.SHIFT).sendKeys(wb, value).keyUp(Keys.SHIFT).build().perform();
	}
	public static void copyAndPaste(WebElement srcWb, WebElement trgWb)
	{
		new Actions(driver).click(srcWb).keyDown(Keys.CONTROL).sendKeys("a").keyDown(Keys.CONTROL).sendKeys("c")
		.click(trgWb).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	}
	public static void moveEndOfPage()
	{
		new Actions(driver).keyDown(Keys.END).build().perform();
	}
	public static void moveHomePage()
	{
		new Actions(driver).keyDown(Keys.HOME).build().perform();
	}
}
