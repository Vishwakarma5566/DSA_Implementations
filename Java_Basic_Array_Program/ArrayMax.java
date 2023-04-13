package javaProgram;

public class ArrayMax {
	public static void arrmax(int[] array) {
//		if(array.length==0) {
//			throw 
//		}
		int max=array[0];
		int min = array[0];
		for(int i=1; i<array.length; i++) {
			 if(array[i]>max) {
				 max=array[i];
			 }
			 if(array[i]<min) {
				 min=array[i];
			 }
		}
		System.out.println("Max = "+max + " Min = "+min);
	}

	public static void main(String[] args) {
		int[] arr = {1,4,5,3,8,9};
		arrmax(arr);
		
		
	}

}
