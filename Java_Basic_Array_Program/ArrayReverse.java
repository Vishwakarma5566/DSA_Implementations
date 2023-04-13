package javaProgram;

public class ArrayReverse {

	public static void main(String[] args) {
		int[] array= {2,3,4,5,6,7,8};
		//now to reverse array we will use loop concept
		int a=0;
		int e=array.length-1;
		while(a<e) {
			int temp =array[a];
			array[a]=array[e];
			array[e]=temp;
			a++;
			e--;
		}
		for(int k : array)
			System.out.print(k+" ");
	}

}
