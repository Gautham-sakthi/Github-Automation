package com.github.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.base.SeleniumBase;

public class HomePage extends SeleniumBase {

	public HomePage(RemoteWebDriver driver, WebDriverWait wait) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.wait = wait;
	}

	public void clicksignin() {
		click(driver.findElement(By.xpath("//a[normalize-space()='Sign in']")), wait);

	}
}
