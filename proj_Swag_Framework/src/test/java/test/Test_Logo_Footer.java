package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class Test_Logo_Footer extends TestBase {

	@Test
	void Verify_Logo_Footer() {

		isElementPresent(By.xpath(or.getProperty("LOGO_FOOTER")));
		log.debug("Footer Logo Exist");

		WebElement fl = driver.findElement(By.xpath(or.getProperty("LOGO_FOOTER")));

		String position = fl.getCssValue("position");
		log.debug("Footer Logo position is: " + position);

		int X = driver.findElement(By.xpath(or.getProperty("LOGO_FOOTER"))).getLocation().getX();
		log.debug("Footer Logo X point: " + X);

		int Y = driver.findElement(By.xpath(or.getProperty("LOGO_FOOTER"))).getLocation().getY();
		log.debug("Footer Logo Y point: " + Y);

		String expected = "#4a4a4a";

		String footerColor = fl.getCssValue("color");
		log.debug(footerColor);

		String hexColor = Color.fromString(footerColor).asHex();
		log.debug(hexColor);

		String acual = hexColor;

		Assert.assertEquals(acual, expected);

		boolean Verify_Footer_Logo = isDisplayed(By.xpath(or.getProperty("LOGO_FOOTER")));
		Assert.assertEquals(true, Verify_Footer_Logo);
		log.debug("Verified Footer Logo");

	}// Verify_Logo_Footer

}// class
