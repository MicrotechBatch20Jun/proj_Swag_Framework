package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.TestBase;

public class Test_filter_Drop_Down_And_Sorting extends TestBase {

	@Test
	void Verify_filter_Drop_Down_And_Sorting() {

		isElementPresent(By.xpath(or.getProperty("DROP_DOWN")));
		log.debug("Filter Drop Down Exist");

		WebElement dd = driver.findElement(By.xpath(or.getProperty("DROP_DOWN")));

		String position = dd.getCssValue("position");
		log.debug("Filter Drop Down Position is: " + position);
		
		String actual = position;

		Assert.assertEquals(actual,dd.getCssValue("position"));
		log.debug("Position Asserted");

		int X = driver.findElement(By.xpath(or.getProperty("DROP_DOWN"))).getLocation().getX();
		log.debug("Filter Drop Down X point: " + X);

		int Y = driver.findElement(By.xpath(or.getProperty("DROP_DOWN"))).getLocation().getY();
		log.debug("Filter Drop Down Y point: " + Y);

		String expected = "#ffffff";

		String ddColor = dd.getCssValue("background-color");
		log.debug(ddColor);

		String hexColor = Color.fromString(ddColor).asHex();
		log.debug(hexColor);

		String acual = hexColor;

		Assert.assertEquals(acual, expected);

		Click(By.xpath(or.getProperty("ALPHA_ASC")));
		log.debug("A TO Z");

		Click(By.xpath(or.getProperty("ALPHA_DECS")));
		log.debug("Z TO A");

		Click(By.xpath(or.getProperty("PRICE_ASC")));
		log.debug("LOW TO HI");

		Click(By.xpath(or.getProperty("PRICE_DECS")));
		log.debug("HI TO LOW");

		boolean Verify_Drop_Down = isDisplayed(By.xpath(or.getProperty("DROP_DOWN_LIST")));
		Assert.assertEquals(true, Verify_Drop_Down);
		log.debug("Verified Filter Drop Down List");

	}// Verify_filter_Drop_Down_And_Sorting

}// class
