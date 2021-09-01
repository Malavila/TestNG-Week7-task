package MyTestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestNGClass {
	
	@Test
	public void test()
	{
		System.out.println("Hello TestNG");
	}
	@AfterTest
	public void test2()
	{
		System.out.println("Hello TestNG test2");
	}
	@BeforeTest
	public void test1()
	{
		System.out.println("Hello TestNG test1");
	}

}
