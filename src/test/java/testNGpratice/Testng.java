package testNGpratice;

import org.testng.annotations.Test;

public class Testng {
	@Test(priority=-1)
	public void createcustomer() {
		System.out.println("customer is created");
	}
	@Test(priority=-1)
	public void modifiedcustomer() {
		System.out.println("customer is modified");
	}
	@Test(priority=-1)
	public void deletecustomer() {
		System.out.println("customer is deleted");
	}
	
	

}
