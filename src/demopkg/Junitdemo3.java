package demopkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo3 {
	ChromeDriver driver;
	
	
	@Before
	public void setUp()
	{
		 driver=new ChromeDriver();
		driver.get("https://google.com");
	}
	
	@Test
	public void titleverfication()
	{
		String actualtitle=driver.getTitle();
		String exptitle="Google";
		System.out.println("title="+actualtitle);
		
		if(actualtitle.equals(exptitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	
	@Test
	public void textverification()
	{
		String src=driver.getPageSource();
		
		if(src.contains("Image"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	
	@After
	public void teardown()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
}
