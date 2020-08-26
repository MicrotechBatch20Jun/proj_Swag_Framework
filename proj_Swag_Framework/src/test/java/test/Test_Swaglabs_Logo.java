package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.TestBase;

public class Test_Swaglabs_Logo extends TestBase {

	@Test
	void Verify_Swaglabs_Logo() {

		isElementPresent(By.xpath(or.getProperty("LOGO")));
		log.debug("LOGO Exist");

		WebElement logo = driver.findElement(By.xpath(or.getProperty("LOGO")));

		String position = logo.getCssValue("text-align");
		log.debug("Logo position is: " + position);
		
		String actual = position;

		Assert.assertEquals(actual,logo.getCssValue("text-align"));
		log.debug("Position Asserted");
		
		int X = driver.findElement(By.xpath(or.getProperty("LOGO"))).getLocation().getX();
		log.debug("Product Bar X point: " + X);

		int Y = driver.findElement(By.xpath(or.getProperty("LOGO"))).getLocation().getY();
		log.debug("Product Bar Y point: " + Y);

		boolean verify_Logo = isDisplayed(By.xpath(or.getProperty("LOGO")));
		Assert.assertEquals(true, verify_Logo);
		log.debug("Verified App Logo");

	}// Verify_Swaglabs_Logo

}// class
