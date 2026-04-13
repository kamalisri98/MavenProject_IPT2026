package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;


import com.base.Base_Class;
import com.interfaceelements.SearchPageInterfaceElements;

public class SearchPage extends Base_Class implements SearchPageInterfaceElements {

	@FindBy (xpath = laptop_xpath)
	private WebElement categorylaptop;
	
    @FindBy(linkText = sony_linkText)
	private WebElement sony;
    
    @FindBy(xpath = addcart_xpath)
    private WebElement addcart;
	
    
    public SearchPage() {
		PageFactory.initElements(driver, this);
	}

	public void searchProduct() throws InterruptedException {
		explicitWait(categorylaptop,30);
		clickOnElement(categorylaptop);
		explicitWait(sony,30);
		clickOnElement(sony);
		explicitWait(addcart,30);
		clickOnElement(addcart);
		handleAlert("action", "gettext");
		
	}
}
