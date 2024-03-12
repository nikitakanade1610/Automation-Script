package webDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaytmAssignment {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.paytm.com/");
		String actualTitle = driver.getCurrentUrl();	
		String expectedTitle = ("Paytm: secure&fast UPI Payments");
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("test case is pass");
		}
		else
		{
			System.out.println("test case is fail");
		}
		
	}

}
