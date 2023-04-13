package javaProgram;

public class ArrayZeroLeftShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,0,3,0,4,0,5,6,0,0};
		for(int i=0; i<arr.length; i++) {
			for(int j=1+i; j<arr.length; j++) {
				if(arr[i]!=0 && arr[j]==0) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

}
