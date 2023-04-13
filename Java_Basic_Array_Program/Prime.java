// package javaProgram;

public class Prime {
	public static void prime(int n) {
		if(n<=0 || n==1)
			System.out.println("Not a prime number");
		int count=1;
		for(int i=2;i<=n;i++) {
			if(n%i==0)
				count++;
		}
		if(count==2)
			System.out.println("Prime number");
		else {
			System.out.println("Not Prime Number");
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prime(11);

	}

}
