package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class Test_Burger_Menu extends TestBase {

	@Test
	void Verify_Burger_Menu() {
		isElementPresent(By.xpath(or.getProperty("BURGER_MENU")));
		log.debug("Burger Menu Exist");

		boolean Verify_Menu = isDisplayed(By.xpath(or.getProperty("BURGER_MENU")));
		Assert.assertEquals(true, Verify_Menu);
		log.debug("Verified Burger Menu");

		WebElement bm = driver.findElement(By.xpath(or.getProperty("BURGER_MENU")));

		String position = bm.getCssValue("position");
		log.debug("Burger Menu position is: " + position);

		int X = driver.findElement(By.xpath(or.getProperty("BURGER_MENU"))).getLocation().getX();
		log.debug("Burger Menu X point: " + X);

		int Y = driver.findElement(By.xpath(or.getProperty("BURGER_MENU"))).getLocation().getY();
		log.debug("Burger Menu Y point: " + Y);

		String expected = "#4a4a4a";

		String bmColor = bm.getCssValue("color");
		log.debug(bmColor);

		String hexColor = Color.fromString(bmColor).asHex();
		log.debug(hexColor);

		String acual = hexColor;

		Assert.assertEquals(acual, expected);

		Click(By.xpath(or.getProperty("MENU_CLICK")));
		log.debug("Burger Menu Clicked");

		boolean Verify_Menu_List = isDisplayed(By.xpath(or.getProperty("BURGER_MENU_LIST")));
		Assert.assertEquals(true, Verify_Menu_List);
		log.debug("Verified Burger Menu List");

	}// Verify_Burger_Menu

}// class
