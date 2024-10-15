package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		
	}
	
	@Test
	public void titleverification()
	{
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[5]")).sendKeys("abc@gamil.com");
		driver.findElement(By.id("pass")).sendKeys("123");
		driver.findElement(By.name("login")).click();
				
	}

}
