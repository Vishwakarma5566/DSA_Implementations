package Java.LinkedList;

import java.util.Scanner;

public class RecursionDemo {
		
		public static void rec(int i) {
			if(i>0) {
				System.out.println(i);
				rec(i-1);
				System.out.println(i);
				
			}
		}
		public static int recsum(int i) {
			if(i>0) {
				return i+recsum(i-1);
			}
			return 0;
		}
		public static String Str(String s, int n ) {
			if(n>=0) {
				return Str(s,n-1) +s.charAt(n);
			}
			return "";
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String string = "java";
		System.out.print(Str(string,string.length()));
		
		// TODO Auto-generated method stub

	}

}
