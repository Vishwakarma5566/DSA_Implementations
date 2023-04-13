package Java.LinkedList;

public class Fibonacci_Series_Recursion {
	static int a=0, b=1, c=0;
	public static void Fibo(int n) {
		if (n<=0) {
//			System.out.println("Invalid Number");
			return;
		}
//		if(n>=1) {
//			c=a+b;
//			System.out.print(c+" ");
//			a=b;
//			b=c;
//			Fibo(n-1);
//		}
		else {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			Fibo(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(a+" "+b+" ");
		Fibo(3-2);
		

	}

}
