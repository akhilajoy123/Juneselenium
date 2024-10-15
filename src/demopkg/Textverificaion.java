package demopkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Textverificaion {

	public static void main(String[] args) {
     
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		
		String src=driver.getPageSource();
		if(src.contains("Images"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		
		
		
		
	}

}
