package org.array;

import java.util.Scanner;

public class ArraySample2 {
	public static void main(String[] args) {
		
		//int []a = new int[1];
		int a[]= {101,20,30,10,10,90,100,110};
		
		int b=a.length;
		
		for(int i=0;i<b;i++) {
			if(a[i]==110) {
				System.out.println(i);			
			}
		}
		
		
		
		System.out.println(a[2]);
		//System.out.println(a[8]); //Exception will came
		System.out.println(a[5]);
		System.out.println(a[3]);
		
		
		for(int i=0;i<b;i++) {
			if (a[i]==10) {    //this method will show you the index of all methods
				System.out.println(i);
				//break; //This will show you the index of first one
			}
		}
		
		
		System.out.println("Index position Found");
	
	}	
}
	
	  
	  
	  
	  
	  
	
