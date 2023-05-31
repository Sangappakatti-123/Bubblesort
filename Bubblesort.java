package com.jspider.p11;

import java.util.Arrays;

public class Bubblesort {
 public static void main(String[] args) {
	int[]a= {1,5,5,8,3,4,7,9,10,6,72,15,6};
	bubblesort(a);
}
 public static int[] bubblesort(int[] a) {
	   for(int i=0;i<=a.length-1;i++) {
		   for(int j=0;j<=a.length-2;j++) {
			   if(a[j]<a[j+1]) {
				   int temp=a[j];
				   a[j]=a[j+1];
				   a[j+1]=temp;
			   }
		   }
	   }
	System.out.println(Arrays.toString(a));
	System.out.println("array sorting is done");
	 return a;
 }
}
