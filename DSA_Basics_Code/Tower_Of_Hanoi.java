package Java.LinkedList;

public class Tower_Of_Hanoi {
	
	public static void TOH(int n, String s, String d, String h) {
		if (n<=0) {
			return;
		}
		else {
			TOH(n-1, s, h, d);
			System.out.println("Disk "+n+" moved from "+s+" to "+d);
			TOH(n-1, h, d, s);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TOH(2, "Source", "Destination", "Helper");

	}

}
