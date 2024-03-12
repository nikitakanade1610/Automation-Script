package webDriverMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentDemoShopTri {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys("nikitanpatil1610@gmail.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("123456");
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.linkText("Books")).click();
        //driver.findElement(By.xpath("//ul[@class='top-menu']/descendant::a[contains(text(),'book')]")).click();
		driver.findElement(By.xpath("//a[text()='Health Book']/ancestor::div[@class='item-box']/descendant::input[@ type='button']")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
		driver.findElement(By.xpath("//input[@name='termsofservice']")).click();
		driver.findElement(By.xpath("//button[@value='checkout']")).click();
		driver.findElement(By.xpath("//input[@onclick='Billing.save()' ]")).click();
		driver.findElement(By.xpath("//input[@onclick='Shipping.save()' ]")).click();
		driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()' ]")).click();
		driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']")).click();
		driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']")).click();
        driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']")).click();

		


		



}
}