package webDriverMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wokingWithExplicitWait {


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@placeholder='What is your name?']")).sendKeys("xyz");
		driver.findElement(By.xpath("//input[@placeholder='Tell us your Email ID']")).sendKeys("xyz@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='(Minimum 6 characters)']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@placeholder='Enter your mobile number']")).sendKeys("7894561230");
		driver.findElement(By.xpath("//h2[@class='main-3']")).click();
		driver.findElement(By.xpath("//input[@name='currentCity']")).sendKeys("Pune Maharshtra");
		driver.findElement(By.xpath("//a[@class='checkbox-wrap   ']")).click();
		driver.findElement(By.xpath("//input[@name='currentCountry']")).sendKeys("Australia");
		//driver.findElement(By.xpath("//a[@class='checkbox-wrap  on']")).click();
		WebElement submitButton= driver.findElement(By.xpath("//button[@type='submit']"));
		WebDriverWait Wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	   Wait.until (ExpectedConditions.elementToBeClickable(submitButton));
		

		

}
	}