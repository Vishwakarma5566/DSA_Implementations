package Java.LinkedList;
import java.util.*;

public class Priorityb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(5);
		pq.add(10);
		pq.add(50);
		System.out.println(pq.size());
		while (!pq.isEmpty()) {
			System.out.print(pq.peek()+" ");
			pq.poll();
		}
	}

}
