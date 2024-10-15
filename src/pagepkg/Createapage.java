package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Createapage {
	WebDriver driver;
	

	By fbcreateapage=By.xpath("//*[@id=\"reg_pages_msg\"]/a");  //object repository
	By fbsignup=By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a");
	
	public Createapage(WebDriver driver)  //constructor
	{
		this.driver=driver;
	}
	public void signupclick()  //action method
	{
		driver.findElement(fbcreateapage).click();
		driver.findElement(fbsignup).click();
	}
	public void textverification()  //text verification
	{
		String src=driver.getPageSource();
		if(src.contains("create a page"))
		{
			System.out.println("text is present");
		}
		else
		{
			System.out.println("text is not present");
		}
	}

}
