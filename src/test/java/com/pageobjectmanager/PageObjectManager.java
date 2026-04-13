package com.pageobjectmanager;

import com.pageobjectmodel.CartPage;
import com.pageobjectmodel.LoginPage;
import com.pageobjectmodel.PlaceOrderPage;
import com.pageobjectmodel.SearchPage;
import com.utility.FileReaderManager;

public class PageObjectManager {
	
	private FileReaderManager fileReader;
	private static PageObjectManager pageObjectManager;
	private LoginPage loginPage;
	private SearchPage searchPage;
	private CartPage cartPage;
	private PlaceOrderPage placeOrderPage;
	
	public FileReaderManager getFileReader() {
		if (fileReader ==null) {
			fileReader = new FileReaderManager();
		}
		return fileReader;
	}
	public static PageObjectManager getPageObjectManager() {
		if (pageObjectManager ==null) {
			pageObjectManager = new PageObjectManager();
		}
		return pageObjectManager;
	}
	public LoginPage getLoginPage() {
		if (loginPage ==null) {
			loginPage = new LoginPage();
		}
		return loginPage;
	}
	
	public SearchPage getSearchPage() {
		if (searchPage == null) {
			searchPage = new SearchPage();
		}
		return searchPage;
		
		
	}
	
	public CartPage getCartPage() {
		if (cartPage == null) {
			cartPage = new CartPage();
		}
		return cartPage;
	}
	public PlaceOrderPage getplaceOrderPage() {
		if (placeOrderPage == null) {
		placeOrderPage = new PlaceOrderPage();
		}
		return placeOrderPage;
	}
	
	}
	
	
