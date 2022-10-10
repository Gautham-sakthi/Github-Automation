package com.github.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumBase {

	protected RemoteWebDriver driver = null;
	protected WebDriverWait wait = null;

	public void click(WebElement ele, WebDriverWait wait) {
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();

	}

	public String getTitle() {
		return driver.getTitle();
	}

	public void type(WebElement ele, String data) {
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.clear();
		ele.sendKeys(data);
	}

}
