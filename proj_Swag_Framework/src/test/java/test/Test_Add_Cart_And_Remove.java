package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.TestBase;

public class Test_Add_Cart_And_Remove extends TestBase {

	@Test
	void Verify_Add_Cart_And_Remove() {

		Click(By.xpath(or.getProperty("SELECT_ITEM")));
		log.debug("Item in Cart");

		isElementPresent(By.tagName(or.getProperty("CART")));
		log.debug("Add a Cart Exist");

		boolean Verify_Add_Cart = isDisplayed(By.tagName(or.getProperty("CART")));
		Assert.assertEquals(true, Verify_Add_Cart);
		log.debug("Add a Cart is Displayed");

		WebElement cp = driver.findElement(By.tagName(or.getProperty("CART")));

		String position = cp.getCssValue("position");
		log.debug("Cart Position is: " + position);

		int X = driver.findElement(By.tagName(or.getProperty("CART"))).getLocation().getX();
		log.debug("CART X point: " + X);

		int Y = driver.findElement(By.tagName(or.getProperty("CART"))).getLocation().getY();
		log.debug("CART Y point: " + Y);

		String expected = "#777777";

		String cartColor = cp.getCssValue("color");
		log.debug("Add a Cart Color is: " + cartColor);

		String carthexColor = Color.fromString(cartColor).asHex();
		log.debug(carthexColor);

		String cartactual = carthexColor;
		Assert.assertEquals(cartactual, expected);

		Click(By.tagName(or.getProperty("CART")));
		log.debug("Add a Cart Clicked");

		boolean verify_Saved_Item = isDisplayed(By.xpath(or.getProperty("SAVED_ITEM")));
		Assert.assertEquals(true, verify_Saved_Item);
		log.debug("Verified Add A Cart");

		// REMOVE
		isElementPresent(By.xpath(or.getProperty("REMOVE")));
		log.debug("Remove Button Exist");

		boolean Verify_Remove_Button = isDisplayed(By.xpath(or.getProperty("REMOVE")));
		Assert.assertEquals(true, Verify_Remove_Button);
		log.debug("Remove button is Displayed");

		WebElement rm = driver.findElement(By.xpath(or.getProperty("REMOVE")));

		String rmposition = rm.getCssValue("text-transform");
		log.debug("Remove button Case type: " + rmposition);

		int x = driver.findElement(By.xpath(or.getProperty("REMOVE"))).getLocation().getX();
		log.debug("Remove button X point: " + x);

		int y = driver.findElement(By.xpath(or.getProperty("REMOVE"))).getLocation().getY();
		log.debug("Remove button Y point: " + y);

		String rmexpected = "#474c55";

		String removeColor = rm.getCssValue("color");
		log.debug("Remove Border Color is: " + removeColor);

		String hexColor = Color.fromString(removeColor).asHex();
		log.debug(hexColor);

		String actual = hexColor;
		Assert.assertEquals(actual, rmexpected);

	}// Verify_Add_Cart_And_Remove

}// class
