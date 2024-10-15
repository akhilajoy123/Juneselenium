package pkg;

import java.net.HttpURLConnection;
import java.net.URI;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {
	
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com"); 
	}
	
	@Test
	public void test()
	{
		List<WebElement> linklist=driver.findElements(By.tagName("a"));
		System.out.println("total count of links="+linklist.size());
		
		for(WebElement linklist1:linklist)
		{
			String linkTest=linklist1.getText();
			String linkHerf=linklist1.getAttribute("herf");
			
			//System.out.println("link Name:"+linkTest);
			//System.out.println("link URL:"+linkHerf);
			//System.out.println();
		
			verifylink(linkHerf);
		}
		
	
		
		
	}

	private void verifylink(String linklist) {
		try
		{
			URI ob=new URI(linklist);
			HttpURLConnection con=(HttpURLConnection)ob.toURL().openConnection();
			if(con.getResponseCode()==200)
			{
				System.out.println("successfull response code is 200--"+linklist);
			}
			else if(con.getResponseCode()==404)
			{
				System.out.println("broken link response code is 404--"+linklist);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	
	
	
	

}
