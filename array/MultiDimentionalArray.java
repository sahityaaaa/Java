package com.simplilearn.array;

public class MultiDimentionalArray {
	public static void main(String[] args) {
	
		int array[][]= {{1,2,4},{3,4,5},{9,7,4}};
		
		System.out.println("Let's Print elements");
		for(int row=0;row<3;row++)
		{
			for(int col=0;col<3;col++)
			{
				System.out.print(array[row][col]+"\t");
			}
			
			System.out.println();
		}
	}

}
