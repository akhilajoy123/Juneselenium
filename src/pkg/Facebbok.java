package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebbok {
	
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		
	}
	
	@Test
	public void titleverification()
	{
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("abc@gamil.com");
		driver.findElement(By.id("pass")).sendKeys("123");
		driver.findElement(By.xpath("login")).click();
				
	}
	
	
	 

}
