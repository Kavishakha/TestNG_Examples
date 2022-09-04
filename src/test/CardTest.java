package test;

import org.testng.annotations.Test;

public class CardTest extends BaseClass{
	
	@Test(groups = {"Sanity","regression"})
	public void CCTest() {
		
		System.out.println("Inside CC Test");
	}

}
