package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.TestBase;

public class Test_Logo_Heading extends TestBase {

	@Test
	void Verify_Header_Image() {

		isElementPresent(By.xpath(or.getProperty("IMAGE")));
		log.debug("Header Image Exist");

		WebElement image = driver.findElement(By.xpath(or.getProperty("IMAGE")));

		String position = image.getCssValue("position");
		log.debug("Image Position is: " + position);

		int X = driver.findElement(By.xpath(or.getProperty("IMAGE"))).getLocation().getX();
		log.debug("Image X point: " + X);

		int Y = driver.findElement(By.xpath(or.getProperty("IMAGE"))).getLocation().getY();
		log.debug("Image Y point: " + Y);

		String expected = "#4a4a4a";

		String imgColor = image.getCssValue("color");
		log.debug(imgColor);

		String hexColor = Color.fromString(imgColor).asHex();
		log.debug(hexColor);

		String acual = hexColor;

		Assert.assertEquals(acual, expected);

		boolean Verify_Image = isDisplayed(By.xpath(or.getProperty("IMAGE")));
		Assert.assertEquals(true, Verify_Image);
		log.debug("Verified Header Image");

	}// Verify_Header_Image

}// class