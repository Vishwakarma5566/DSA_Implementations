package Java.LinkedList;

public class Fibonacci_Series {

//	private static int Fibo(int n) {
//		
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Fibo(4);
		System.out.print("Fibonacci Series upto terms is:");
		int a=0, b=1, c;
		System.out.print(a+" "+b +" ");
		for (int i = 1; i < 5; i++) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			
		}

	}

}
