package pkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rishiherbal {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		 driver=new ChromeDriver();
		driver.get("https://rishiherbalindia.linker.store/");
	}
	@Test
	public void titleverification()
	{
	   String actualtitle=driver.getTitle();
	   String expectedtitle="rishiherbal";
	   if(actualtitle.equalsIgnoreCase(expectedtitle))
	   {
		   System.out.println("text is present");
	   }
	   else
	   {
		   System.out.println("text is not present");
	   }
	}
	@Test
	public void linkcount()
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("total count of links="+li.size());
		int count=li.size();
		if(count==30)
		{
			System.out.println("link count is match");
		}
		else
		{
			System.out.println("link count is not matching");
		}
	}
}
		
		

