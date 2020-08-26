package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.TestBase;

public class Test_Products_Heading extends TestBase {

	@Test
	void Verify_Products_Header() {

		isElementPresent(By.xpath(or.getProperty("PRODUCT_LABEL")));
		log.debug("Products Header Exist");

		WebElement name = driver.findElement(By.xpath(or.getProperty("PRODUCT_LABEL")));

		String namePosition = name.getCssValue("position");
		log.debug("Products Header position is: " + namePosition);
		
		int X = driver.findElement(By.xpath(or.getProperty("PRODUCT_LABEL"))).getLocation().getX();
		log.debug("Products Header X point: " + X);

		int Y = driver.findElement(By.xpath(or.getProperty("PRODUCT_LABEL"))).getLocation().getY();
		log.debug("Products Header Y point: " + Y);

		String expected = "#ffffff";

		String pColor = name.getCssValue("color");
		log.debug(pColor);

		String hexColor = Color.fromString(pColor).asHex();
		log.debug(hexColor);

		String acual = hexColor;

		Assert.assertEquals(acual, expected);

		boolean Verify_Products_Header = isDisplayed(By.xpath(or.getProperty("PRODUCT_LABEL")));
		Assert.assertEquals(true, Verify_Products_Header);
		log.debug("Verified Product Header");

	}// Verify_Products_Header

}// class
