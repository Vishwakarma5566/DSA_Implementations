package Java.LinkedList;
import java.util.Arrays;


public class Main {
	public static int[] Union(int[] array1, int[] array2) {
		int i=0, j=0, n=array1.length, m=array2.length,x=0;
		int[] res = new int[n+m];
		while(i<n && j<m) {
			if (array1[i]<array2[j]) {
				res[x]=array1[i];
				i++;
				x++;	
			}
			else if (array1[i]>array2[j]) {
				res[x]=array2[j];
				j++;
				x++;
			}
			else {
				res[x]=array2[j];
				i++;
				j++;
				x++;
			}
		}
		while(i<n) {
			res[x]=array1[i];
			i++;
			x++;
		}
		while(j<m) {
			res[x]=array2[j];
			j++;
			x++;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,3,5,2,7,9};
		int[] arr2 = {4,5,0,6,8,10,11};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for (int i : Union(arr1, arr2)) {
			System.out.print(i+" ");
		}
		
		

	}

}
