package Java.LinkedList;
import java.util.Arrays;


public class IntersectionArr {
	public static int[] Intersection(int[] array1, int[] array2) {
		int i=0, j=0, n=array1.length, m=array2.length,x=0;
		int[] res = new int[n+m];
		while(i<n && j<m) {
			if (array1[i]<array2[j]) {
				i++;
			}
			else if (array1[i]>array2[j]) {
				j++;
			}
			else {
				res[x]=array2[j];
				i++;
				j++;
				x++;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,3,5,2,7,8,9};
		int[] arr2 = {4,5,0,6,8,8,10,11};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for (int i : Intersection(arr1, arr2)) {
			System.out.print(i+" ");
		}
		
		

	}

}
