package com.github.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.base.SeleniumBase;

public class ClickToNewRepo extends SeleniumBase {
	public ClickToNewRepo(RemoteWebDriver driver, WebDriverWait wait) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.wait = wait;

	}

	public void createnewrepo() {

		click(driver.findElement(By.xpath(
				"//div[@data-target='loading-context.details']//a[@class='btn btn-sm btn-primary'][normalize-space()='New']")),
				wait);

	}
}
