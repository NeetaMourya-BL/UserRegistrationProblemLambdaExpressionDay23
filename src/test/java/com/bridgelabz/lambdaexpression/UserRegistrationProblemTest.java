package com.bridgelabz.lambdaexpression;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
public class UserRegistrationProblemTest{
	
    boolean result;
	UserRegistrationProblem userTest = new UserRegistrationProblem();
	
	@Test
	public void firstName_IsValid_PassTest() {
		result = userTest.isValidUserFirstName("Neeta");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void firstName_IsValid_FailTest() {
		result = UserRegistrationProblem.isValidUserFirstName("Neeta");
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void lastName_IsValid_PassTest() {
		result = userTest.isValidUserLastName("Mourya");
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void lastName_IsValid_FailTest() {
		result = userTest.isValidUserLastName("Mourya");
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void Email_IsValid_PassTest() {
		result = userTest.isValidUserEmail("abc.123@gmail.com");
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void Email_IsValid_FailTest() {
		result = userTest.isValidUserEmail("abc123");
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void mobileNumber_IsValid_PassTest() {
		result = userTest.isValidMobileNo("91 9545525252");
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void mobileNumber_IsValid_FailTest() {
		result = userTest.isValidMobileNo("98956646455454");
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void password_IsValid_PassTest() {
		result = userTest.isValidPassword("dfhbhfdbd#A");
		Assert.assertEquals(true,result);
	}
	@Test
	public void password_IsValid_FailTest() {
		result = userTest.isValidPassword("jdkdhjkf.-");
		Assert.assertEquals(true,result);
	}
}