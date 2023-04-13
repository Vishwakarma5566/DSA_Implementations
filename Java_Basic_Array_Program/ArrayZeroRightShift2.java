package javaProgram;

//TIME COMPLEXITY IS O(n);
public class ArrayZeroRightShift2 {
	public static int[] RightShift(int[] array) {
		int first=0;
		int last=array.length-1;
		int[] newarr=new int[array.length];
		for(int i=0; i<array.length; i++) {
			if(array[i]==0) {
				newarr[last--]=array[i];
			}
			else {
				newarr[first++]=array[i];
			}
		}
		return newarr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,0,2,0,0,3,4,0,5};
		for(int i : RightShift(arr))
			System.out.print(i+" ");

	}

}
