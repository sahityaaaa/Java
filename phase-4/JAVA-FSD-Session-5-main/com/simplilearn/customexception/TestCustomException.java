package com.simplilearn.customexception;

public class TestCustomException {

	void check(int age) throws NotValidAgeException
	{
		if(age<18)
			throw new NotValidAgeException("Age is less than 18");
		else
			System.out.println("Valid");
	}
	
	public static void main(String[] args) throws NotValidAgeException {
		
		TestCustomException t=new TestCustomException();
		
		t.check(67);
	}
}
