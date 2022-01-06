package com.bridgelabz.lambdaexpression;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistrationProblem {
    public static boolean isValidUserFirstName(String firstname) throws CustomException.InvalidFirstName
    {
        // Regex to check valid userfirstname.
        String regex = "^[A-Za-z]\\w{3,29}$";
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
        // If the userfirstname is empty
        // return false
        if (firstname == null) {
			throw new CustomException.InvalidFirstName("First name starts with Cap and has minimum 3 characters");
        }
        // Pattern class contains matcher() method
        // to find matching between given userfirstname
        // and regular expression.
        Matcher m = p.matcher(firstname);
        // Return if the userfirstname
        // matched the ReGex
        return m.matches();
    }
  	// Function to validate the userlastname
        public static boolean isValidUserLastName(String lastname) throws CustomException.InvalidLastName
        {
            // Regex to check valid userlastname.
            String regex = "^[A-Za-z]\\w{3,29}$";
      
            // Compile the ReGex
            Pattern p = Pattern.compile(regex);
      
            // If the userlastname is empty
            // return false
            if (lastname == null) {
    			throw new CustomException.InvalidLastName("Last name starts with Cap and has minimum 3 characters");
            }
            // Pattern class contains matcher() method
            // to find matching between given userlastname
            // and regular expression.
            Matcher m = p.matcher(lastname);
            // Return if the userlastname
            // matched the ReGex
            return m.matches();
        }
        // Function to validate the useremail
        public static boolean isValidUserEmail(String email) throws CustomException.InvalidEmail
        {
            // Regex to check valid useremail.
            String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
      
            // Compile the ReGex
            Pattern p = Pattern.compile(regex);
      
            // If the useremail is empty
            // return false
            if (email == null) {
            	throw new CustomException.InvalidEmail("enter a valid email - E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl&co) and 2 optional (xyz & in) with precise @ and . positions");
            }
            // Pattern class contains matcher() method
            // to find matching between given useremail
            // and regular expression.
            Matcher m = p.matcher(email);
            // Return if the useremail
            // matched the ReGex
            return m.matches();
        }
        // Function to validate the usermobilenumnber
        public static boolean isValidMobileNo(String mobileNumber)throws CustomException.InvalidMobile
        {  
        Pattern ptrn = Pattern.compile("^((\\+|00)(\\d{1,3})[\\s-]?)?(\\d{10})$");
        //the matcher() method creates a matcher that will match the given input against this pattern  
        Matcher match = ptrn.matcher(mobileNumber);  
        //returns a boolean value  
    	throw new CustomException.InvalidMobile("Mobile Format - E.g. 91 9919819801 - Country code follow by space and 10 digit number");  
        }  
        // Function to validate the userpassword
     // Function to validate the password.
        public static boolean isValidUserPassword(String password)throws Exception
        {
            // Regex to check valid password.
//        	^ represents starting character of the string.
//        	(?=\\S+$) white spaces don’t allowed in the entire string. 
//        	.{8, 20} represents at least 8 characters and at most 20 characters.
//        	(?=.*[a-z]) represents a lower case alphabet must occur at least once.
//        	 (?=.*[A-Z]) represents an upper case alphabet that must occur at least once.
//        	 (?=.*[0-9]) represents a digit must occur at least once.
//        	(?=.*[@#$%^&-+=()] represents a special character that must occur at least once.
//        	$ represents the end of the string.
            String regex ="^(?=.*[0-9])"
                    + "(?=.*[a-z])(?=.*[A-Z])"
                    + "(?=.*[@#$%^&+=])"
                    + "(?=\\S+$).{8,20}$";
            // Compile the ReGex
            Pattern p = Pattern.compile(regex);
            // If the password is empty
            // return false
            if (password == null) {
            	throw new Exception("Invalid password");
            }
            // Pattern class contains matcher() method
            // to find matching between given password
            // and regular expression.
            Matcher m = p.matcher(password);
            // Return if the password
            // matched the ReGex
            return m.matches();
        }
      
    // main function
    public static void main(String[] args)
    {
        String str1 = "Abcd"; //firstname
        System.out.println(isValidUserFirstName(str1));
        String str2 = "Wxyz"; //lastname
        System.out.println(isValidUserLastName(str2));
        String str3 ="abc.xyz@bl.co.in"; //email
        System.out.println(isValidUserEmail(str3));  
        String str4 ="+91-9919819801"; //usermobilenumnber
        System.out.println(isValidMobileNo(str4));  
        String str5 ="BridgeLabz@123"; //userpassword
        try {
			System.out.println(isValidUserPassword(str5));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        
        ArrayList<String> emails = new ArrayList<String>();  
        emails.add("abc@yahoo.com");  
        emails.add("abc-100@yahoo.com"); 
        emails.add("abc.100@yahoo.com");  
        emails.add("abc111@abc.com");  
        emails.add("abc-100@abc.net"); 
        emails.add("abc.100@abc.com.au");  
        emails.add("abc@1.com"); 
        emails.add("abc#@gmail.com.com"); 
        emails.add("abc+100@gmail.com");  
        //Add invalid emails in list  
        emails.add("abc");  
        emails.add("abc@.com.my");  
        emails.add("abc123@gmail.a");  
        emails.add("abc123@.com");  
        emails.add("abc123@.com.com");  
        emails.add(".abc@abc.com");  
        emails.add("abc()*@gmail.com");  
        emails.add("abc@%*.com");  
        emails.add("abc..2002@gmail.com");  
        emails.add("abc.@gmail.com");  
        emails.add("abc@abc@gmail.com");  
        emails.add("abc@gmail.com.1a");  
        emails.add("abc@gmail.com.aa.au");  
        //Regular Expression   
        String regex = "^(.+)@(.+)$";  
        //Compile regular expression to get the pattern  
        Pattern pattern = Pattern.compile(regex);  
        //Iterate emails array list  
        for(String email : emails){  
            //Create instance of matcher   
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }  
    }   
}