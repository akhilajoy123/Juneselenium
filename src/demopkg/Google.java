package demopkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
	    driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
	}
	
	@Test
	public void textverification()
	{
		driver.findElement(By.name("q")).sendKeys("watch",Keys.ENTER);
		driver.findElement(By.name("btnk")).click();
	}
	
	
}
