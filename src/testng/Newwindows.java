package testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Newwindows {
	WebDriver d;
	
	@BeforeTest
	public void beforetest()
	{
		d=new ChromeDriver();
	}
	@Test
	public void test()
	{
		d.get("https://demo.guru99.com/popup.php");
		
		String parentWindow=d.getWindowHandle();//currentwindow
		
		System.out.println("Parent window Title "+d.getTitle());
		d.findElement(By.xpath("/html/body/p/a")).click();//click here
		
		Set<String>allWindowHandles =d.getWindowHandles();
		for(String handle :allWindowHandles )
		{
			if(!handle.equalsIgnoreCase(parentWindow))
			{
				d.switchTo().window(handle);
				d.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("abc@gmail.com");
				d.close();
			}
		//	d.switchTo().window(parentWindow);
		}
		
	}
	
	
	

}