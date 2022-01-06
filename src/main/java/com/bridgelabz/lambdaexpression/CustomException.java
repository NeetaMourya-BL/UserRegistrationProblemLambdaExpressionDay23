package com.bridgelabz.lambdaexpression;
public class CustomException extends Exception{
	
    String message;
  //Invalid FirstName Custom Exception
	public static class InvalidFirstName extends RuntimeException{
		public InvalidFirstName(String message) {
			super(message);
		}
	}
   //Invalid LastName CustomException
	public static class InvalidLastName extends RuntimeException{
		public InvalidLastName(String message) {
			super(message);
		}
	}
	
	//Invalid Email Custom Exception
	public static class InvalidEmail extends RuntimeException{
		public InvalidEmail(String message) {
			super(message);
		}
	}
	//Invalid Mobile Custom Exception
	public static class InvalidMobile extends RuntimeException{
		public InvalidMobile(String message) {
			super(message);
		}
	}
	//Invalid Password Custom Exception
	public static class InvalidPassword extends RuntimeException{
		public InvalidPassword(String message) {
			super(message);
		}
	}			
}