package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class Test_Checkout_Button extends TestBase {

	@Test
	void Verify_Checkout_Button() {
		driver.get("https://www.saucedemo.com/cart.html");

		isElementPresent(By.xpath(or.getProperty("CHECKOUT")));
		log.debug("Checkout Button Exist");

		boolean Verify_Checkout_Button = isDisplayed(By.xpath(or.getProperty("CHECKOUT")));
		Assert.assertEquals(true, Verify_Checkout_Button);
		log.debug("Checkout button is Displayed");

		WebElement co = driver.findElement(By.xpath(or.getProperty("CHECKOUT")));

		String coPosition = co.getCssValue("position");
		log.debug("Checkout button Position is: " + coPosition);

		int X = driver.findElement(By.xpath(or.getProperty("CHECKOUT"))).getLocation().getX();
		log.debug("Checkout button X point: " + X);

		int Y = driver.findElement(By.xpath(or.getProperty("CHECKOUT"))).getLocation().getY();
		log.debug("Checkout button Y point: " + Y);

		String expected = "#e2231a";

		String coColor = co.getCssValue("background-color");
		log.debug("Checkout Button Color is: " + coColor);

		String hexColor = Color.fromString(coColor).asHex();
		log.debug(hexColor);

		String actual = hexColor;
		Assert.assertEquals(actual, expected);

		Click(By.xpath(or.getProperty("CHECKOUT")));
		log.debug("Checkout Clicked");

		String title = driver.getCurrentUrl();
		log.debug(title);

		String actualTitle = title;
		Assert.assertEquals(actualTitle, driver.getCurrentUrl());
		log.debug("Verified Checkout Button");

	}// Verify_Checkout_Button

}// class
