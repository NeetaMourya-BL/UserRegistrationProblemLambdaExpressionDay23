package com.bridgelabz.lambdaexpression;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Use Of Functional Interface and Lambda Expression 
 */
@FunctionalInterface
interface IFirstName {
//To check valid first name method	
	public boolean isFirstName(String fname);
}

@FunctionalInterface
interface ILastName{
//To check valid last name method 
public boolean isLastName(String lname);
}


@FunctionalInterface
interface IEmail{
//To check valid email	
public boolean isValidEmail(String email);
}

@FunctionalInterface
interface IMobile{
//To check valid mobile	
public boolean isValidMobileNumber(String phone);
}

@FunctionalInterface
interface IPassword{
//To check password
public boolean isValidPassword(String fname);
}

public class UserRegistrationProblem {
    
	// method for check first name pattern
	public static boolean isValidUserFirstName(String fname) {
		String regex = "^[A-Z][a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Predicate<String> predicateObj = pattern.asPredicate();
		return predicateObj.test(fname);
		/*
		 * other logic Predicate<Pattern> predicateObj = matcher ->
		 * matcher.matcher(fname).matches();
		 */
	}
	
	// method for check last name pattern
	public boolean isValidUserLastName(String lname) {
		String regex = "^[A-Z][a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Predicate<String> predicateObj = pattern.asPredicate();
		return predicateObj.test(lname);     
	}
    
	// method for check valid Email pattern
	public boolean isValidUserEmail(String email) {
		String regex = "^[a-z.+_-]+[.a-z0-9]*+@[a-z0-9]+[.a-z]+[.a-z0-9]*$";
		Pattern pattern = Pattern.compile(regex);
		Predicate<String> predicateObj = pattern.asPredicate();
		return predicateObj.test(email);     
	}
	
	// method for check mobileNumber pattern
	public boolean isValidMobileNo(String phone) {
			String regex = "^[0-9]{2}+[ ][0-9]{10}$";
			Pattern pattern = Pattern.compile(regex);
			Predicate<String> predicateObj = pattern.asPredicate();
			return predicateObj.test(phone);     		
	 }
	 
	// method for check password pattern
	public boolean isValidUserPassword(String pass)  {
			String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!#@%^&*(){}])[a-zA-Z0-9+-_!@#$%^&*(){}'.,]{8,}$";
			Pattern pattern = Pattern.compile(regex);
			Predicate<String> predicateObj = pattern.asPredicate();
			return predicateObj.test(pass);     			 
	 }

	public static void main(String[] args) {
		UserRegistrationProblem user = new UserRegistrationProblem();
		System.out.println(user.isValidUserFirstName("Neeta")); 
		System.out.println(user.isValidUserFirstName("Mourya")); 
		System.out.println(user.isValidUserEmail("abc@gmail.com")); 
		System.out.println(user.isValidMobileNo("91 8955652666"));
        System.out.println(user.isValidUserPassword("kdfnjdhfjsdjfh#A"));
	}
}