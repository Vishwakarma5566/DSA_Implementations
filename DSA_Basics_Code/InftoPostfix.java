package Java.LinkedList;

import java.util.Scanner;


class Stacknotation{
	private int top=-1;
	private Character[] ch = new Character[100];
	void push(char c) {
		try {
			ch[++top]=c;
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("Stack full, no room to push, size=100");
			System.exit(0);
		}
	}
	char pop() {
		return ch[top--];
	}
	boolean isEmpty() {
		return (top==-1)?true:false;
	}
	char peek() {
		return ch[top];
	}
	
}

public class InftoPostfix {
	
	static String toPostfix(String infix) {
		char symbol;
		String postfix ="";
		for (int i = 0; i < infix.length(); i++) {
			symbol=infix.charAt(i);
			if(Character.isLetter(symbol)) {
				postfix=postfix+symbol;
			}
			else if(symbol=='(') {
				operators.push(symbol);
			}
			else if (symbol==')') {
				while (operators.peek()!='(') {
					postfix=postfix+operators.pop();
				}
				operators.pop();
			}
			else {
				while(!operators.isEmpty() &&!(operators.peek()=='(') && preced(symbol)<=preced(operators.peek()) ) {
					postfix=postfix+operators.peek();
					operators.pop();
				}
				operators.push(symbol);
			}
		}
		
		while(!operators.isEmpty()) {
			postfix=postfix+operators.pop();
		}
		return postfix;
	}
	static int preced(char X) {
		if(X=='+' || X=='-')
		return 1;
		else if (X=='*' || X=='/')
		return 2;
		return 0;
		
	}
	
 
	static Stacknotation operators = new Stacknotation();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the infix expression you want to convert: ");
		String infix = sc.next();
		System.out.println("Postfix expression for the given infix expression is: "+toPostfix(infix));
		
		
	}
}
