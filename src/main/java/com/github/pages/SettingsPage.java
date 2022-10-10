package com.github.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.base.SeleniumBase;

public class SettingsPage extends SeleniumBase {

	public SettingsPage(RemoteWebDriver driver, WebDriverWait wait) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.wait = wait;
	}

	public void clickDeleteRepo(String reponame, String username) {
		click(driver.findElement(By.xpath("//summary[normalize-space()='Delete this repository']")), wait);
		type(driver.findElement(By.xpath(
				"//input[@aria-label='Type in the name of the repository to confirm that you want to delete this repository.']")),
				username.concat("/" + reponame));
		click(driver.findElement(By.xpath("//div[@class='Box-body overflow-auto']//button[@type='submit']")), wait);
	}

	public String getDeleteMessage() {
		return driver.findElement(By.xpath("//div[@id='js-flash-container']//div[contains(@class,'px-2')]")).getText();
		// text : Your repository "Gautham-sakthi/ress" was successfully deleted.
	}
}
