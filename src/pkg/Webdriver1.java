package pkg;

import org.openqa.selenium.edge.EdgeDriver;

public class Webdriver1 {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://google.com");
		driver.close();
	}

}





