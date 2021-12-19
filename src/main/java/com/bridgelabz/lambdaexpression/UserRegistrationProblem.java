package com.bridgelabz.lambdaexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationProblem {
	// Function to validate the userfirstname
    public static boolean isValidUserFirstName(String firstname)
    {
        // Regex to check valid userfirstname.
        String regex = "^[A-Za-z]\\w{3,29}$";
  
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
  
        // If the userfirstname is empty
        // return false
        if (firstname == null) {
            return false;
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
        public static boolean isValidUserLastName(String lastname)
        {
            // Regex to check valid userlastname.
            String regex = "^[A-Za-z]\\w{3,29}$";
      
            // Compile the ReGex
            Pattern p = Pattern.compile(regex);
      
            // If the userlastname is empty
            // return false
            if (lastname == null) {
                return false;
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
        public static boolean isValidUserEmail(String email)
        {
            // Regex to check valid useremail.
            String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
      
            // Compile the ReGex
            Pattern p = Pattern.compile(regex);
      
            // If the useremail is empty
            // return false
            if (email == null) {
                return false;
            }
            // Pattern class contains matcher() method
            // to find matching between given useremail
            // and regular expression.
            Matcher m = p.matcher(email);
            // Return if the useremail
            // matched the ReGex
            return m.matches();
        }

    // main function
    public static void main(String[] args)
    {
        String str1 = "Neeta"; //firstname
        System.out.println(isValidUserFirstName(str1));
        String str2 = "Mourya"; //lastname
        System.out.println(isValidUserLastName(str2));
        String str3 ="neeta.mourya@bl.co.in"; //email
        System.out.println(isValidUserEmail(str3));  
    }   
}