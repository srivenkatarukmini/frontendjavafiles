package day6;

import java.util.Arrays;
import java.lang.reflect.Array;
public class Reflectarrays {
	public static void main(String[] args) {
		int arr[]=(int[])Array.newInstance(int.class,5);
		System.out.println(Arrays.toString(arr));
	}

}
