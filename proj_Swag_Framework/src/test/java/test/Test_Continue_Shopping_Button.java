package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class Test_Continue_Shopping_Button extends TestBase {

	@Test(priority = 1)
	void Verify_Continue_Shop() {
		driver.get("https://www.saucedemo.com/cart.html");

		isElementPresent(By.xpath(or.getProperty("CONTINUE_SHOPPING")));
		log.debug("Continue Shopping button Exist");

		boolean Verify_Continue_Shopping = isDisplayed(By.xpath(or.getProperty("CONTINUE_SHOPPING")));
		Assert.assertEquals(true, Verify_Continue_Shopping);
		log.debug("Continue Shopping button is Displayed");

		WebElement cs = driver.findElement(By.xpath(or.getProperty("CONTINUE_SHOPPING")));

		String csCase = cs.getCssValue("text-transform");
		log.debug("Continue Shopping Case Type: " + csCase);

		int X = driver.findElement(By.xpath(or.getProperty("CONTINUE_SHOPPING"))).getLocation().getX();
		log.debug("Continue Shopping X point: " + X);

		int Y = driver.findElement(By.xpath(or.getProperty("CONTINUE_SHOPPING"))).getLocation().getY();
		log.debug("Continue Shopping Y point: " + Y);

		String expected = "#ffffff";

		String color = cs.getCssValue("background-color");
		log.debug("Background Color is: " + color);

		String hexColor = Color.fromString(color).asHex();
		log.debug(hexColor);

		String actual = hexColor;
		Assert.assertEquals(actual, expected);

		Click(By.xpath(or.getProperty("CONTINUE_SHOPPING")));
		log.debug("Clicked Continue Shopping button");

		String title = driver.getCurrentUrl();
		log.debug(title);

		String actualTitle = title;
		Assert.assertEquals(actualTitle, driver.getCurrentUrl());
		log.debug("Verified Continue Shopping button");

	}// Verify_Continue_Shop

}// class
