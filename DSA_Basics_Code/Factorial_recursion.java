package Java.LinkedList;

public class Factorial_recursion {
	
	public static int Factorial(int n) {
		if (n<=0) {
			System.out.println("Invalid number");
			return -1;
		}
		else if (n==1) {
			return 1;
		}
		else {
			return n* Factorial(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Factorial(5));

	}

}
