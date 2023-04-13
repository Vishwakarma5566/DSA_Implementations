package javaProgram;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array= ");
		int n = sc.nextInt();
		System.out.print("Enter the elements= ");
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt(); 
		}
		for(int j :arr) {
			System.out.print(j+" ");
		}
		
	}

}
