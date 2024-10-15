package demopkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.Amazon.in");
	}
	@Test
	public void textverification()
	{
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("mobiles",Keys.ENTER);
		driver.findElement(By.xpath("Hello signin")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("cart")).click();
		driver.findElement(By.xpath("By again")).click();
		driver.findElement(By.xpath("hamburger menu")).click();
		
	}
	
	
	
	
	
}
