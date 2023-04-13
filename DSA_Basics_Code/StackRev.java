package Java.LinkedList;

import java.util.Scanner;

public class StackRev {
	private int top;
	private Character[] arry;
	
	
	
	public StackRev(int capacity) {
		top = -1;
		arry=new Character[capacity];
	}
	public StackRev() {
		this(10);
	}
	public int size() {
		return top+1;
	}
	public boolean isEmpty() {
		return top<0;
	}
	public boolean isFull() {
		return arry.length==size();
	}
	public void push(String data) {
		if(isFull()) {
			throw new RuntimeException("Stack is full!!!");
		}
		for(int i=0; i<data.length(); i++) {
			top++;
			arry[top]=data.charAt(i);
		}
	}
	public Character pop() {
		if(isEmpty()) {
			throw new RuntimeException("Stack is empty!!!");
		}
		Character resultStr=arry[top];
		top--;
		return resultStr;
	}
	public Character peek() {
		if(isEmpty()) {
			throw new RuntimeException("Stack is empty!!!");
		}
		return arry[top];
	}
	 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackRev stack = new StackRev(50);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String string = sc.nextLine();
		
		stack.push(string);
		
		while(!stack.isEmpty()) {
			System.out.print(stack.pop());
		}

	}

}
