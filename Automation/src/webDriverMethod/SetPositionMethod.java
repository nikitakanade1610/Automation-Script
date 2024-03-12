package webDriverMethod;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	
		Point p = new Point(100, 2000);
		
		driver.manage().window().setPosition(p);
		driver.get("https://www.google.com");
	}

}
