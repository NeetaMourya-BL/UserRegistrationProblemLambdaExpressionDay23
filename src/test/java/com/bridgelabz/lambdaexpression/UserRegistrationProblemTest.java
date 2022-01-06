package com.bridgelabz.lambdaexpression;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
@RunWith(Parameterized.class)
public class UserRegistrationProblemTest{
	private UserRegistrationProblem user;
    private final boolean expected;
    private String email;

    @Before
    public void initializeClass(){
    	user = new UserRegistrationProblem();
    }

    public UserRegistrationProblemTest(UserRegistrationProblem user, boolean expected) {
        this.user = user;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<boolean[]> regexList(){
        return Arrays.asList(new boolean[][] {
                {"abc@yahoo.com" != null,true} , {"abc-100@yahoo.com" != null,true} ,
                {"abc.100@yahoo.com" != null,true} , {"abc111@abc.com" != null,true},
                {"abc-100@abc.net" != null,true} , {"abc.100@abc.com.au" != null,true},
                {"abc@1.com" != null,true} , {"abc@yahoo.com.com" != null,true},
                {"abc+100@yahoo.com" != null,true} , {"abc@.com" != null,false}
        });
    }
//    @Test
//	public void testUserRegistration(){
//        Assert.assertEquals(expected,user.isValidUserEmail(email));
//    }
	
	
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
		try {
			result = userTest.isValidUserPassword("dfhbhfdbd#A");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(true,result);
	}
	@Test
	public void password_IsValid_FailTest() {
		try {
			result = userTest.isValidUserPassword("jdkdhjkf.-");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(true,result);
	}
}