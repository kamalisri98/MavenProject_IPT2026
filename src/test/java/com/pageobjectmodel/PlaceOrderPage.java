package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelements.PlaceOrderInterfaceElements;
import com.pageobjectmanager.PageObjectManager;

public class PlaceOrderPage extends Base_Class implements PlaceOrderInterfaceElements {
	
	@FindBy(xpath = name_xpath)
	private WebElement name;
	
	@FindBy(id = country_id)
	private WebElement country;
	
	@FindBy(id = city_id)
	private WebElement city;
	
	@FindBy(xpath = credit_xpath)
	private WebElement credit;
	
	@FindBy(id = month_id)
	private WebElement month;
	
	@FindBy(id = year_id)
	private WebElement year;
	
	@FindBy(xpath = purchase_xpath)
	private WebElement purchase;
	
	@FindBy(xpath = ok_xpath)
	private WebElement ok;
	
	public PlaceOrderPage() {
		PageFactory.initElements(driver, this);
	}


public void validatePageOrderPage() throws InterruptedException, IOException {
	Thread.sleep(3000);
	passInput(name, PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("name"));
	passInput(country, PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("country"));
	passInput(city, PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("city"));
	passInput(credit, PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("credit"));
	passInput(month, PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("month"));
	passInput(year, PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("year"));
	clickOnElement(purchase);
	clickOnElement(ok);
}
	
}