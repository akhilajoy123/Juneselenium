package pkg;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Fileupload {
	ChromeDriver driver;
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		
	}
@Test
public void main() throws Exception
{
	driver.get("https://www.ilovepdf.com/word_to_pdf");
	driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
	Thread.sleep(3000);
	Runtime.getRuntime().exec("C:\\Users\\AKHILA JOY\\Downloads\\Autoit\\T15.exe");
	Thread.sleep(3000);
		
}
}
