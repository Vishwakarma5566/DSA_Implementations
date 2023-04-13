package Java.LinkedList;

//import java.util.LinkedList;

public class LinkedList{
	
	
	public static void rev(LinkedList<Integer> p, int listsize) {
		if(listsize==0) {return;}
		rev(p,listsize--);
		System.out.println(p);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> array = new LinkedList<>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		array.add(6);
		array.add(7);
		array.add(8);
		array.add(9);
		array.add(10);
		
		System.out.println(array.size());
		rev(get(array.size()),array.size());

	}

}
