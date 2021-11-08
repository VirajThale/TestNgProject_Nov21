package testNg;
import org.testng.annotations.Test;

public class Testcase2 extends Baseclass
{
	@Test(enabled = true)
public void CreditCardTest() {
		
		System.out.println("Inside Credit Card");
	}
	@Test(groups="sanity", dependsOnMethods="CCTest")
	public void CreditCardSanityTest2() {
		System.out.println("Inside credit card sanitytest 2");
	}

	@Test(groups="sanity")
	public void CCTest() {
		System.out.println("Inside CCTest Depends");
	}
}
