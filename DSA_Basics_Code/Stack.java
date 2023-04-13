package Java.LinkedList;

public class Stack {
	int[] arr;
	int top;
	
	public Stack(int len) {
		// TODO Auto-generated constructor stub
		this.arr=new int[len];
		this.top=-1;	
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public boolean isFull() {
		return top==arr.length-1;
	}
	public int Size() {
		return top;
	}
	
	public void push(int data) {
		if (isFull()) {
			System.out.println("Stack is Full (Overflow)");
			return;
		}
		top++;
		arr[top]=data;
	}
	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is Empty (Underflow)");
			return -1;
		}
		
		int temp=arr[top];
		top--;
		return temp;
		
	}
	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is Empty !!");
			return -1;
		}
		return arr[top];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st = new Stack(8);
		st.push(3);
		st.push(2);
		st.push(1);
		st.push(0);
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		

	}

}
