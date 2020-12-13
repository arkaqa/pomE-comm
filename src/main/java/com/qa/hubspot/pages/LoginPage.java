package com.qa.hubspot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.hubspot.base.BasePage;

public class LoginPage extends BasePage{
	private WebDriver driver;
	//By locators: OR
	private By emailid=By.xpath("//input[@name='email']");
	private By password=By.xpath("//input[@name='password']");
	private By loginBtn=By.xpath("//input[@type='submit']");
	private By forgottenPasswordLink=By.linkText("Forgotten Password");
	
	//Constructor of the page class :
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Page Actions :
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	public boolean isForgottenLinkExists() {
		return driver.findElement(forgottenPasswordLink).isDisplayed();
	}
	public void doLogin(String un,String pwd) {
		driver.findElement(emailid).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginBtn).click();
		
	}
}
