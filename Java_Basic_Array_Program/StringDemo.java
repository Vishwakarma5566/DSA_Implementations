package javaProgram;

public class StringDemo {

	public static void main(String[] args) {
		// String vs StringBuffer
		String s = new String("Hare");
		s.concat("Shyam");
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer("Hari");
		sb.append("Rama");
		System.out.println(sb);
		
		String s1 = new String("Krsna");
		String s2 = new String("Krsna");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		StringBuffer sb1 = new StringBuffer("Shyam");
		StringBuffer sb2 = new StringBuffer("Shyam");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));

	}

}
