package Java.LinkedList;

import java.util.Scanner;

public class Nontail_recursion {
	
	public static void fun(int n) {
		if (n<=0) {
			return;
		}
		else {
			fun(n-1);
			System.out.print(n+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fun(n);

	}

}
