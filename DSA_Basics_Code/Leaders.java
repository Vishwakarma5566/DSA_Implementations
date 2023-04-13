package Java.LinkedList;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Scanner;

public class Leaders {
	
	static ArrayList<Integer> leader(int[] num, int n){
		ArrayList<Integer> res = new ArrayList<>();
		Stack<Integer> st = new Stack<>();
		int max = num[n-1];
		st.push(max);
		for (int i = num.length-2; i >=0; i--) {
			if(num[i]>max) {
				st.push(num[i]);
				max=num[i];
			}
		}
		while(!st.isEmpty()) {
			res.add(st.pop());
		}
		return res;
		
	}

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n=inp.nextInt();
		int[] array = new int[n];
		System.out.print("Enter the elements: ");
		for (int i = 0; i < array.length; i++) {
			array[i]=inp.nextInt();
		}
		
		
		leader(array, n);
		System.out.print("Leaders are: ");
		for (int i : leader(array, array.length)) {
			System.out.print(i+" ");
		}

	}

}
