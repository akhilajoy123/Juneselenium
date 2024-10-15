package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbloginpage {
	WebDriver driver;
	
	By fbemail=By.id("email");  //object repository
	By fbpassword=By.id("pass");
	By fbloginbutton=By.name("login");
	
	public Fbloginpage(WebDriver driver)  //constructor
	{
		this.driver=driver;
	}
	
	public void setValue(String email,String password) //action method
	{
		driver.findElement(fbemail).sendKeys(email);
		driver.findElement(fbpassword).sendKeys(password);
	}
	
	public void loginclick()  //action method
	{
		driver.findElement(fbloginbutton).click();
	}

}
