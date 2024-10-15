package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertprgrm {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/AKHILA%20JOY/OneDrive/%EB%AC%B8%EC%84%9C/Alert2.html");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		System.out.println("alerttext="+alerttext);
		a.accept();
	     //a.dismiss();
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("akhila");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("joy");
	}
			
	
	
}
