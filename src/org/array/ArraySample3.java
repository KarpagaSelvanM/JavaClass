package org.array;

public class ArraySample3 {
	public static void main(String[] args) {
	
		int a[]= {78,90,78,45,4536,90,67};
		
//		int a[]=new int[6];
//		a[0]=10;
//		a[1]=34;
//		a[2]=23;
//		a[3]=35;
//		a[4]=56;
//		a[5]=46;
//		
//		for(int i=0;i<a.length;i++) {
//				
//				System.out.println(a[i]);
//		}
		
		int sum=0;
		
		for (int c:a) {  //for each loop 
			sum += c;     //syntax for sum of an array
		}
		
		System.out.println(sum);
		   
		System.out.println(a.length);
		
		
		int average=sum/a.length;
		System.out.println("Average of an array is :");
		System.out.println("Addition of an array elements/No of elements ="+average);
		
	}
	}
		
