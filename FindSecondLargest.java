package week1.day2;

import java.util.Arrays;


public class FindSecondLargest {
	public static void main (String[]args) {
		int[] data= {3,2,11,4,6,7};
		int length=data.length;
		Arrays.sort(data);
		System.out.println("sorted array:"+Arrays.toString(data));
		System.out.println("Last second largest number :"+data[length-1]);
	}

}
