package javaProgram;

//TIME COMPLEXITY IS O(n*2);
public class ArrayZeroRightShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {0,2,0,4,0,0,6,7,0};
		for(int i=0; i<array.length; i++) {
			for(int j=1+i; j<array.length; j++) {
				if(array[i]==0 && array[j]!=0) {
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		for (int i : array) {
			System.out.print(i+" ");
		}
	}

}
