package Java.LinkedList;
import java.util.Stack;

public class Stack2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		
		int[] array = {4,10,5,8,20,15,3,12};
		for(int i=0; i<array.length; i++) {
			while(!stack.isEmpty() && stack.peek()<=array[i]) {
				stack.pop();
			}
			if(stack.isEmpty()) {
				System.out.print(-1+" ");
			}
			else {
				System.out.print(stack.peek()+" ");
			}
			stack.push(array[i]);
		}
		
		int[] array2 = {3,10,5,1,15,10,7,6};
		for(int i=array2.length-1; i>=0; i--) {
			while(!stack.isEmpty() && stack.peek()>=array2[i]) {
				stack.pop();
			}
			if(stack.isEmpty()) {
				System.out.print(-1+" ");
			}
			else {
				System.out.print(stack.peek()+" ");
			}
			stack.push(array2[i]);
		}
	}

}
