package testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	
	@BeforeTest(alwaysRun=true)
	public void BeforeTestMethod() {
		System.out.println("Inside Before Test");
	}
	
	@BeforeClass
	public void BeforeClassM() {
		System.out.println("Inside Before Class");
	}
	
	@BeforeMethod(alwaysRun=true)
	public void setup() {
		System.out.println("Inside Before Method");
	}
	
	@AfterMethod (alwaysRun=true)
	public void teardown()
	{
		System.out.println("Inside After method");
	}
	
	@AfterClass
	public void AfterClassM() {
		System.out.println("Inside After class");
	}
	
	@AfterTest(alwaysRun=true)
	public void AfterTest(){
		System.out.println("Inside After test");
	}
	

}
