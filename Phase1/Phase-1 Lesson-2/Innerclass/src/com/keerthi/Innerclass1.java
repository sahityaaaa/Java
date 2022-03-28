package com.keerthi;

public class Innerclass1 {
	private String message="Hi Ankit"; 
	class Inner{ 
	 void hello(){System.out.println(message+", Let us start learning Inner Classes...");} 
	} 
	public static void main(String[] args) {
		Innerclass1 obj=new Innerclass1();
		Innerclass1.Inner in=obj.new Inner(); 
	    in.hello(); 

	}

}
