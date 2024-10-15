package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
	 driver=new ChromeDriver();
	 driver.get("https://demo.guru99.com/test/drag_drop.html");
	}
	@Test
	public void test()
	{
		Actions act=new Actions(driver);
		WebElement source=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement destination=driver.findElement(By.xpath("//*[@id=\"shoppingCart4\"]/h3"));
		act.dragAndDrop(source, destination).perform();
		
		WebElement source1=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement destination1=driver.findElement(By.xpath("//*[@id=\"shoppingCart3\"]/h3"));
		act.dragAndDrop(source1, destination1).perform();
		
		WebElement source2=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement destination2=driver.findElement(By.xpath("//*[@id=\"shoppingCart3\"]/h3"));
		act.dragAndDrop(source2, destination2).perform();
		
		WebElement source3=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement destination3=driver.findElement(By.xpath("//*[@id=\"shoppingCart1\"]/h3"));
		act.dragAndDrop(source3, destination3).perform();
		
		
		
		
		
		
		
	}
	

}
