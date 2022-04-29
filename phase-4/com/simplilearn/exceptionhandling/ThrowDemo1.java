package com.simplilearn.exceptionhandling;

public class ThrowDemo1 {
	
	//my created method throwing exception
		//throwing checked exception 
		void check(int age) throws Exception
		{
			if(age<18)
				throw new Exception("Age is not valid for vote");
			else
				System.out.println("Valid");
		}
		
		public static void main(String[] args) {
			ThrowDemo1 t=new ThrowDemo1();
			//handle exception try catch
			try {
			t.check(67);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}

}
