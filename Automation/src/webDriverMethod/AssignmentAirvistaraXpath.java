package webDriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentAirvistaraXpath {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.airvistara.com/in/en");
		driver.findElement(By.id("acceptAllBtn")).click();
	   // driver.findElement(By.xpath("//img[@src ='/etc.clientlibs/airvistara/clientlibs/clientlib-site/resources/images/widget/Pin.png']")).click();
		//driver.findElement(By.id("from")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("[//input[@name='flightSearchFrom']")).sendKeys("PNQ");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()'PNQ']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("[//input[@name='flightSearchTo']")).sendKeys("DEL");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()'DEL']")).click();


}
}