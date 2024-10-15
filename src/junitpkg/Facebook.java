package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		 driver=new ChromeDriver();
		driver.get("https://www.Facebook.com");
	}
	@Test
	public void fbtest()
	{
		driver.findElement(By.id("email")).sendKeys("abc@gamil.com");//emailfield
		driver.findElement(By.id("pass")).sendKeys("3235");//passwordfield
		driver.findElement(By.name("login")).click();//loginbutton
	}

}
