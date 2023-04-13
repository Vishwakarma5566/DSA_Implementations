package Java.LinkedList;

import java.util.LinkedList;


public class Linkedlistdemo {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add("durga");
		l1.add(30);
		l1.add(null);
		l1.add("durga");
		System.out.println(l1);
		l1.set(0, "software");
		l1.add(0,"venky");
		l1.addFirst("CCC");
		l1.removeLast();
		System.out.println(l1);
	}

}
