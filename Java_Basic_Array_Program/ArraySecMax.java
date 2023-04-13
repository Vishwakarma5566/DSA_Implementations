package javaProgram;

public class ArraySecMax {
	public static int SecMax(int[] arr) {
		int max=arr[0];
		int secmax=max;
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>max) {
				secmax=max;
				max=arr[i];
			}
			if(arr[i]<max && arr[i]!=max) {
				secmax=arr[i];
			}
		}
		return secmax;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,6,2,3,8,9};
		System.out.println(SecMax(arr));

	}

}
