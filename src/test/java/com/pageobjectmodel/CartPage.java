package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelements.CartPageInterfaceElements;

public class CartPage extends Base_Class implements CartPageInterfaceElements {

	@FindBy (xpath = cart_xpath)
	private WebElement cart;
	
	@FindBy (xpath = placeorder_xpath)
	private WebElement placeorder;
	
	public CartPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void validateCartPage() throws InterruptedException {
		explicitWait(cart, 30);
		clickOnElement(cart);
		takeScreenshot("C:\\\\Users\\\\Win10\\\\eclipse-workspace\\\\MavenProject\\\\Screenshots\\home.png");
		explicitWait(placeorder, 30);
		clickOnElement(placeorder);
	}
}
