package tsetpkg;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Fbloginpage;

public class Fblogintest extends Baseclass{
	WebDriver driver;
	@Test
	public void test()
	{
		Fbloginpage ob=new Fbloginpage(driver);  //object creation
		ob.setValue("abc@gamil.com", "123abc");
		ob.loginclick();
		driver.navigate().back();	
	}

}
