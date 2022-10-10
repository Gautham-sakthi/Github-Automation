package com.github.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.base.SeleniumBase;

public class RepoCodePage extends SeleniumBase {
	public RepoCodePage(RemoteWebDriver driver, WebDriverWait wait) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.wait = wait;
	}

	public boolean isrepocreated(String reponame) {
		return driver.findElement(By.xpath("//a[normalize-space()='" + reponame + "']")).isDisplayed();
	}

	public void clickSettings() {

		click(driver.findElement(By.xpath("//a[@id='settings-tab']")), wait);

	}

}
