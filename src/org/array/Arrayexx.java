package org.array;

public class Arrayexx {

	public static void main(String[] args) {
	
		int a[][]=new int[3][3];
		
		a[0][0]=10;
		a[0][1]=12;
		a[0][2]=13;
		a[1][0]=14;
		a[1][1]=15;
		a[1][2]=16;
		a[2][0]=17;
		a[2][1]=18;
		a[2][2]=19;
		
		System.out.println();
		
		for (int[] is : a) {
			for (int i : is) {
				System.out.println(i);
				
			}
			
		}
	
		
	}
	
}



