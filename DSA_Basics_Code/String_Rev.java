package Java.LinkedList;

public class String_Rev {
	
	int top;
	Character[] arr;
	public String_Rev(int size) {
		// TODO Auto-generated constructor stub
		this.arr=new Character[size];
		top=-1;
	}
	public void push(String data) {
		for (int i = 0; i <data.length() ; i++) {
			top++;
			arr[top]=data.charAt(i);
		}
	}
	public char pop() {
		char res = arr[top];
		top--;
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_Rev atRev = new String_Rev(10);
		atRev.push("Harsh");
		System.out.print(atRev.pop());
		System.out.print(atRev.pop());
		System.out.print(atRev.pop());
		System.out.print(atRev.pop());
		System.out.print(atRev.pop());

	}

}
