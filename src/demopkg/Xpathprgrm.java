package demopkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathprgrm {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void textverification()
	{
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("abcgsh,com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123");
		driver.findElement(By.xpath("login")).click();
		
	}
	
	
	
	
	
	
}
