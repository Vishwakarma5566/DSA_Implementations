package Java.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Notations {
	

	public static void main(String[] args) {
		 Scanner  inp = new Scanner(System.in);
		 Stack<Character> st = new Stack<>();
		 System.out.print("Enter a postfix notation: ");
		 String s = inp.nextLine();
		 System.out.println(s);
		 
		 for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='(') {
				st.push(s.charAt(i));
			}
			if(s.charAt(i)>=97 || s.charAt(i)<=122 ) {
				System.out.print(s.charAt(i));
			}
			if(s.charAt(i)=='+' || s.charAt(i)=='-' || s.charAt(i)=='*' || s.charAt(i)=='/') {
				while(!st.isEmpty()) {
					st.peek();
				}
				if(st.isEmpty()) {
					st.push(s.charAt(i));
				}
				else {
					
				}
			}
		}
	}
}
