package com.runner;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.Base_Class;
import com.pageobjectmanager.PageObjectManager;

public class RunnerClass extends Base_Class {
	public static void main(String args[]) throws IOException, InterruptedException {
		launchBrowser(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("browser"));
		launchUrl(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("Url"));
		PageObjectManager.getPageObjectManager().getLoginPage().validLoginPage();
		PageObjectManager.getPageObjectManager().getSearchPage().searchProduct();
		PageObjectManager.getPageObjectManager().getCartPage().validateCartPage();
		PageObjectManager.getPageObjectManager().getplaceOrderPage().validatePageOrderPage();
	}
}
	
		

