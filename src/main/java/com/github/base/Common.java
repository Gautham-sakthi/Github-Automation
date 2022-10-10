package com.github.base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Common extends SeleniumBase {

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
//		System.setProperty("webdriver.chrome.driver",
//				"/Users/goutham/eclipse-workspace/repocreation/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://github.com");
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	}

	@AfterTest
	public void teardown() {
		// driver.quit();
	}

}
