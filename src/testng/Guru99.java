package testng;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeGroups;

public class Guru99 {
	ChromeDriver driver;
	@BeforeGroups
	public void setUp()
	{
		 driver=new ChromeDriver();
		 driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
	@Test
	public void rightclick()
	{
		WebElement rightclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		WebElement edit=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]"));

		
        driver.findElement(By.xpath("//*[@id=\"authentication\"]/button")).click();
        
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		System.out.println("alerttext="+alerttext);
		a.accept();
		
		
		
	}
}
