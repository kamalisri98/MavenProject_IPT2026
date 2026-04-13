package com.pageobjectmodel;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.base.Base_Class;
import com.interfaceelements.LoginPageInterfaceElements;
import com.pageobjectmanager.PageObjectManager;

public class LoginPage extends Base_Class implements LoginPageInterfaceElements {
	
	@FindBy(xpath = login_xpath)
	private WebElement login;
	
	@FindBy (id = username_id)
	private WebElement username;
	
	@FindBy (css = password_css)
	private WebElement password;
	
	@FindBy (xpath = signin_xpath)
	private WebElement signin;
	
	@FindBy (id = title_id)
	private WebElement title;
	
	 public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void validLoginPage() throws IOException, InterruptedException {
		explicitWait(login,30);
		clickOnElement(login);
		explicitWait(username,30);
		passInput(username, PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("username")) ;
		explicitWait(password,30);
		passInput(password, PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("password"));
		explicitWait(signin,30);
		clickOnElement(signin);
		//showText(title);
		//takeScreenshot("C:\\\\Users\\\\Win10\\\\eclipse-workspace\\\\MavenProject\\\\Screenshots\\.png");
	}
	public static void main (String args[]) {
		validloginpage();
	}
	

}
