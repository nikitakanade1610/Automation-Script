package SelectionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithgetAllselectedOptions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		driver.findElement(By.xpath("//a[text()='Multi Select']")).click();

		WebElement multiselectDropdown = driver.findElement(By.id("select-multi"));
		Select s = new Select(multiselectDropdown);
		for (int i=0;i<5;i++)
		{
			s.selectByIndex(i);
			Thread.sleep(2000);
		}
		//for(WebElement option:WorkingWithgetAllselectedOptions)
		//{
		//System.out.println(option.getText());

}
}


