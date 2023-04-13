package Java.LinkedList;

import java.util.Scanner;
import java.util.Stack;

public class PostfixSolve {
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter a postfix equation ");
		String s = inp.nextLine();
		Stack<Integer> st = new Stack<>();
		
		for (Character ch : s.toCharArray()) {
			if(Character.isDigit(ch)) {
				st.push(ch-'0');
			}
			else if(!Character.isDigit(ch)) {
				if(ch=='+' ) {	
					int a1 = st.pop();
					int a2 = st.pop();
					int res = a2+a1;
					st.push(res);
				}
				if(ch=='-' ) {
					int a1 = st.pop();
					int a2 = st.pop();
					int res = a2-a1;
					st.push(res);
					}
				if(ch=='*' ) {
					int a1 = st.pop();
					int a2 = st.pop();
					int res = a2*a1;
					st.push(res);
					}
				if(ch=='/' ) {
					int a1 = st.pop();
					int a2 = st.pop();
					int res = a2/a1;
					st.push(res);
					}
			}
		}
		System.out.println(st.peek());
	}

}
