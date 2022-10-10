package com.github.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.base.SeleniumBase;

public class SignInPage extends SeleniumBase {

	public SignInPage(RemoteWebDriver driver, WebDriverWait wait) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.wait = wait;
	}

	public void login() {

		WebElement usernname = driver.findElement(By.xpath("//input[@id='login_field']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		type(usernname, "gauthamroses@gmail.com");
		type(password, "gouthampass1996");
		click(driver.findElement(By.xpath("//input[@name='commit']")), wait);

	}

}
