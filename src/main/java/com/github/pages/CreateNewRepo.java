package com.github.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.base.SeleniumBase;

public class CreateNewRepo extends SeleniumBase {

	public CreateNewRepo(RemoteWebDriver driver, WebDriverWait wait) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.wait = wait;
	}

	public void enterreponame(String reposname) {

		WebElement reponame = driver.findElement(By.xpath("//input[@id='repository_name']"));
		type(reponame, reposname);
		boolean isit = typeselected();

		if (!isit) {
			click(driver.findElement(By.xpath("//input[@id='repository_visibility_public']")), wait);
		}

		click(driver.findElement(By.xpath("//button[normalize-space()='Create repository']")), wait);
	}

	public Boolean typeselected() {
		return driver.findElement(By.xpath("//input[@id='repository_visibility_public']")).isSelected();
	}

}
