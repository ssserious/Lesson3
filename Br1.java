/**
* Java 1. Lesson 3
*@author Sergey Sergeev
*@version 18.10.2021
*/
   

   
import java.util.Arrays;


public class Br1 {
    
	public static void main(String[] args) {

        int[] arr = { 1, 0, 1, 0, 0, 1 };
	    System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
        arr[i] = (arr[i] > 0) ? 0 : 1;
	    System.out.println(Arrays.toString(arr));
	    }
	
	    int[] arr1 = new int[100];
        for (int i = 0; i < arr1.length; i++) {
        arr1[i] = i +1;
	    System.out.print((arr1[i] + " "));
        }

	    int[] arr2 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr2.length; i++) {
        if (arr2[i] < 6) {
        arr2[i] *= 2;
        System.out.println((arr2[i]));
	    }
		int[][] arr3 = new int[4][4];  
        for (int w = 0; i < 4; w++) {
	    arr3[w][w] = 1;
		arr3[w][4 - w -1] = 1;
		{
        System.out.println(Arrays.toString(arr3[w]));
		}
		}
		}
	}
}
        