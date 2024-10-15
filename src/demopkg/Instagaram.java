package demopkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagaram {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		 driver=new ChromeDriver();
		 driver.get("https://www.Instagram.com");
	}
	@Test
	public void textverification()
	{
		driver.findElement(By.name("username")).sendKeys("abc@gamil.com");
	}

}
