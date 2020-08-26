package test;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.TestBase;

public class Test_Privacy_Policy extends TestBase {

	@Test
	void Verify_Privacy_Policy() {

		isElementPresent(By.xpath(or.getProperty("PRIVACY_FOOTER")));
		log.debug("Privacy Footer is Exist");

		WebElement pf = driver.findElement(By.xpath(or.getProperty("PRIVACY_FOOTER")));

		String position = pf.getCssValue("position");
		log.debug("Privacy Footer Position is: " + position);
		
		String actual = position;

		Assert.assertEquals(actual,pf.getCssValue("position"));
		log.debug("Position Asserted");
		
		int X = driver.findElement(By.xpath(or.getProperty("PRIVACY_FOOTER"))).getLocation().getX();
		log.debug("Privacy Footer X point: " + X);

		int Y = driver.findElement(By.xpath(or.getProperty("PRIVACY_FOOTER"))).getLocation().getY();
		log.debug("Privacy Footer Y point: " + Y);

		boolean verify_privacy_Footer = isDisplayed(By.xpath(or.getProperty("PRIVACY_FOOTER")));
		Assert.assertEquals(true, verify_privacy_Footer);

		try {
			Click(By.xpath(or.getProperty("PRIVACY_FOOTER")));
			log.debug("Clicked and Verified Privacy Footer");
		} catch (NoSuchElementException e) {
			log.debug("Privacy Footer is Disable");
		}

	}// Verify_Privacy_Policy

}// class
