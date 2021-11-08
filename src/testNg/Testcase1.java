package testNg;

import org.testng.annotations.Test;

public class Testcase1 extends Baseclass
{
	
	@Test(description="This test is for Home Loan")
	public void HomeLoanTest() {
		
		System.out.println("Inside Home Loan");
	}
	@Test
	public void HomeLoanTest1() {
		System.out.println("Inside Home Loan 1");
	}
	@Test(description="This is is Car Loan" )
	public void CarLoanTest() {
		System.out.println("Inside car Loan");
		
	}
	@Test(description="This is is Car Loan" )
	public void CarLoanTest1() {
		System.out.println("Inside Car Loan 1");
		
	}
	@Test(groups="sanity")
	public void CarLoansanityTest1() {
		System.out.println("Inside car Loan sanitytest 1");
	}

}
