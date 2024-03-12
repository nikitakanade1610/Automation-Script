package webDriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class WorkingWithEnable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		//Identify the button is enable or not
		WebElement Registerbutton=driver.findElement(By.xpath("//button[text()='Register']"));
		System.out.println("RegisterButton.isEnable()");

}
}