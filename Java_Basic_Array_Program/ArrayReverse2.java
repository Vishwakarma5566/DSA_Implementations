package javaProgram;

import java.util.Iterator;

public class ArrayReverse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,3,4,5};
		int[] arr2=new int[arr1.length];
		for(int i=0; i<arr1.length; i++) {
			arr2[arr1.length-1-i]=arr1[i];
		}
		for (int i : arr2) {
			System.out.print(i+" ");
		}

	}

}
