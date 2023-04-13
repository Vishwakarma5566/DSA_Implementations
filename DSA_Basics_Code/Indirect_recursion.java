package Java.LinkedList;

public class Indirect_recursion {
	
	public static void odd(int n) {
		if (n<=0) {
			return;
		}
		else if(n%2!=0){
			System.out.print(n+" ");
			n--;
			even(n);
		}
		else {
			even(n);
		}
	}
	public static void even(int n) {
		if (n<=0) {
			return;
		}
		else if(n%2==0){
			System.out.print(n+" ");
			n--;
			odd(n);
		}
	}
	
	public static void main(String[] args) {
		odd(10);
	}

}
