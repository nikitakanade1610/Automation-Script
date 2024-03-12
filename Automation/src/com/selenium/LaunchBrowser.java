package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getsizeandposition {
	
	public static void main(String[] args) {
		Dimension size = driver.manage().windows().getsize();
		System.out.println(size);
		point position=driver.manage().windows().getposition();
		System.out.println(position);
		driver.get(https://www.google.com);
		
	}

}
