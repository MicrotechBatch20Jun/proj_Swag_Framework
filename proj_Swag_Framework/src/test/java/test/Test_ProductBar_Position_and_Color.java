package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.TestBase;

public class Test_ProductBar_Position_and_Color extends TestBase {
	
	@Test
	void Verify_ProductBar_Position_and_Color() {

		isElementPresent(By.xpath(or.getProperty("PRODUCT_BAR")));
		log.debug("Product Bar Exist");

		WebElement bar = driver.findElement(By.xpath(or.getProperty("PRODUCT_BAR")));

		String barPosition = bar.getCssValue("position");
		log.debug("Product Bar Position is: " + barPosition);
		
		String actual = barPosition;
		
		Assert.assertEquals(actual, bar.getCssValue("position"));
		log.debug("Position Asserted");

		int X = driver.findElement(By.xpath(or.getProperty("PRODUCT_BAR"))).getLocation().getX();
		log.debug("Product Bar X point: " + X);

		int Y = driver.findElement(By.xpath(or.getProperty("PRODUCT_BAR"))).getLocation().getY();
		log.debug("Product Bar Y point: " + Y);

		String expected = "#474c55";

		String barColor = bar.getCssValue("background-color");
		log.debug(barColor);

		String hexColor = Color.fromString(barColor).asHex();
		log.debug(hexColor);

		String acual = hexColor;

		Assert.assertEquals(acual, expected);
		log.debug("Color Asserted");

	}// Verify_ProductBar_Position_and_Color

}// class
