package com.simplilearn.thread;

public class ThredDemo1 implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+ " is running");
	}
	
public static void main(String[] args) {
		
		ThredDemo1 t1=new ThreadDemo1();
		
		ThreadDemo1 t=new ThreadDemo1(t1);
		
		t.start();
	}
	
}