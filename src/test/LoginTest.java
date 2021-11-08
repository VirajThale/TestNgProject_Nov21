package test;


//import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.LoginPage ;

public class LoginTest extends Baseclass

{

	@Parameters({"Username","Password"})
	@Test
	public void NegativeLogin(String UsernameVal, String PasswordVal) 
	
	{
		test= report.startTest("Negative Login Test");
		LoginPage login = new LoginPage();
		login.Login(UsernameVal, PasswordVal);
		report.endTest(test);
		
//		WebElement error= dr.findElement(By.id("msg_box"));
//		String Actualmsg= error.getText();
//		String Expmsg ="The email or password you have entered is invalid.";
//		
//		//Assert.assertEquals(Actualmsg, Expmsg); //only can use in @Test
//		
//		SoftAssert soft =new SoftAssert();
//		soft.assertEquals(Actualmsg, Expmsg);
//		System.out.println("After Assertion:Login check");
//		soft.assertAll();
		
	}
	
	@Parameters({"Username","CPassword"})
	@Test
	public void PositiveLogin(String UsernameVal, String PasswordVal) {
		
		test= report.startTest("Positive Login Test");
		LoginPage login = new LoginPage();
		login.Login(UsernameVal, PasswordVal);
		report.endTest(test);
		
	}
		
	
	
	
	

}

