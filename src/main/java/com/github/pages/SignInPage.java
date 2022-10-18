package com.github.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

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

	public void login() throws IOException {
		InputStream input = new FileInputStream("./Data.properties");
		Properties prop = new Properties();
		prop.load(input);
		WebElement usernname = driver.findElement(By.xpath("//input[@id='login_field']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		// enter login credentials
		type(usernname, prop.getProperty("email"));
		type(password, prop.getProperty("password"));
		click(driver.findElement(By.xpath("//input[@name='commit']")), wait);

	}

}
