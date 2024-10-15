package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo {
	@BeforeTest
	public void setUp()
	{
		System.out.println("beforetest");
	}
	@BeforeMethod
	public void urlloading()
	{
		System.out.println("beforemethod url loading");
	}
	@Test(groups= {"smoke,sanity"})
	public void test1()
	{
		System.out.println("test1");
	}
	@Test(groups= {"sanity"})
	public void test2()
	{
		System.out.println("test2");
	}
	@Test(groups= {"regression"})
	public void test3()
	{
		System.out.println("test3");
	}
	@Test(groups= {"sanity"})
	public void test4() 
	{
		System.out.println("test4");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("aftermethod");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("aftertest");
	}

}
