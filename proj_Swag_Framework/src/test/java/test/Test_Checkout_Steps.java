package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.TestBase;

public class Test_Checkout_Steps extends TestBase {

	@Test
	void Verify_Checkout_Steps() {
		driver.get("https://www.saucedemo.com/checkout-step-one.html");

		isElementPresent(By.xpath(or.getProperty("CHECKOUT_INFO")));
		log.debug("Element Exist");

		boolean Verify_Check_Info = isDisplayed(By.xpath(or.getProperty("CHECKOUT_INFO")));
		Assert.assertEquals(true, Verify_Check_Info);

		WebElement cxinfo = driver.findElement(By.xpath(or.getProperty("CHECKOUT_INFO")));

		String paddPos = cxinfo.getCssValue("position");
		log.debug("Details Position is: " + paddPos);

		int X = driver.findElement(By.xpath(or.getProperty("CHECKOUT_INFO"))).getLocation().getX();
		log.debug("Details Position X point: " + X);

		int Y = driver.findElement(By.xpath(or.getProperty("CHECKOUT_INFO"))).getLocation().getY();
		log.debug("Details Position Y point: " + Y);

		SendKeys(By.xpath(or.getProperty("FIRST_NAME")), or.getProperty("FIRST"));

		SendKeys(By.xpath(or.getProperty("LAST_NAME")), or.getProperty("LAST"));

		SendKeys(By.xpath(or.getProperty("ZIP")), or.getProperty("ZIP_CODE"));

		// CONTINUE
		isElementPresent(By.xpath(or.getProperty("SUBMIT")));
		log.debug("Continue button Exist");

		WebElement c = driver.findElement(By.xpath(or.getProperty("SUBMIT")));

		String expected = "#e2231a";

		String cColor = c.getCssValue("color");
		log.debug("Continue color is: " + cColor);

		String hexColor = Color.fromString(cColor).asHex();
		log.debug(hexColor);

		String actual = hexColor;

		Assert.assertEquals(actual, expected);

		boolean Verify_continue = isDisplayed(By.xpath(or.getProperty("SUBMIT")));
		Assert.assertEquals(true, Verify_continue);

		Click(By.xpath(or.getProperty("SUBMIT")));
		log.debug("Continue button Clicked");

		String title = driver.getCurrentUrl();
		log.debug(title);

		Assert.assertEquals(title, driver.getCurrentUrl());

	}// Verify_Checkout_Steps

}// class
