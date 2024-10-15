package tsetpkg;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import basepkg.Createapagebase;
import pagepkg.Createapage;

public class Createapagetest extends Createapagebase {
	WebDriver driver;
	
	@Test()
	public void test1()
	{
		Createapage ob=new Createapage(driver);  //object creation
		ob.signupclick();
		ob.textverification();
	}

}
