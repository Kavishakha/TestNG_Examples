package test;

import org.testng.annotations.Test;

@Test(groups = {"GroupTest"})

public class LoanTest extends BaseClass{
	
	@Test(groups = {"Sanity","regression"}, priority=1)
	public void HomeLoanTest() {
		
		System.out.println("Inside Home Loan Test");
	}
	
	@Test(groups = {"regression"})
	public void PersonalLoanTest() {
		
		System.out.println("Inside Personal Loan Test");
	}
	
	@Test(priority=0)
	public void PersonalLoanTest1() {
		
		System.out.println("Inside Personal Loan Test1");
	}
}
