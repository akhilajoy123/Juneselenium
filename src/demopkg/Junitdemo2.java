package demopkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo2 {
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		 driver=new ChromeDriver();
		driver.get("https://google.com");
	}
	
	@Test
	public void titleverifcation()
	{
		String actualtitle=driver.getTitle();
		String exptitle="Google";
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
