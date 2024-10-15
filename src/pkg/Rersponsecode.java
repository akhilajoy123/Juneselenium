package pkg;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rersponsecode {
	
	String link="http://www.google.com";
	@Test
	public void test() throws IOException, Exception
	{
		URI ob=new URI(link);
		HttpURLConnection con= (HttpURLConnection)ob.toURL().openConnection();
		int code=con.getResponseCode();
		System.out.println(code);
				
	}
	
	
	
	

}
