package Java.LinkedList;

import java.util.Scanner;
import java.util.Stack;

public class BracketValidator {
	

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter a string of brackets: ");
		String s = inp.nextLine();
		Stack<Character> st = new Stack<>();
		
		for (Character ch : s.toCharArray()) {
			if("({[".indexOf(ch)>=0) {
				st.push(ch);
			}
			else if(")}]".indexOf(ch)>=0 && !st.isEmpty()) {
				Character cc = st.pop();
				boolean f = (cc=='(' && ch==')') || (cc=='{' && ch=='}') || (cc=='[' && ch==']');
				if(!f) {
					System.out.println("Error");
					break;
				}
			}
		}
		if(!st.isEmpty()) {
			System.out.println("Error");
		}
	}

}
