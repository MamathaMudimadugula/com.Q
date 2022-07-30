package com.Q;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\cherry\\com.Q\\src\\main\\resources\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://id.atlassian.com/login");

	}

}
