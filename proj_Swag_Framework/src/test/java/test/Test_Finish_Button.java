package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class Test_Finish_Button extends TestBase {

	@Test
	void Verify_Finish_Button() {
		driver.get("https://www.saucedemo.com/checkout-step-two.html");

		isElementPresent(By.xpath(or.getProperty("FINISH")));
		log.debug("Finish Button is Exist");

		WebElement fb = driver.findElement(By.xpath(or.getProperty("FINISH")));

		String fbPosition = fb.getCssValue("position");
		log.debug("Finish Button Position is: " + fbPosition);

		int X = driver.findElement(By.xpath(or.getProperty("FINISH"))).getLocation().getX();
		log.debug("Finish Button X point: " + X);

		int Y = driver.findElement(By.xpath(or.getProperty("FINISH"))).getLocation().getY();
		log.debug("Finish Button Y point: " + Y);

		String expected = "#e2231a";

		String fbColor = fb.getCssValue("background-color");
		log.debug(fbColor);

		String hexColor = Color.fromString(fbColor).asHex();
		log.debug(hexColor);

		String actual = hexColor;

		Assert.assertEquals(actual, expected);
		
		Click(By.xpath(or.getProperty("FINISH")));
		log.debug("Finish button Clicked");
		
		String title = driver.getCurrentUrl();
		log.debug(title);
		
		Assert.assertEquals(title, driver.getCurrentUrl());
		log.debug("Verified Finish Button");

	}// Verify_Finish_Button

}// class
