
//Taking input and printing elements of an array using function
package Recursion;

//import java.lang.reflect.Array;
import java.util.Scanner;

public class Array3 {
	
	public static void printarray(int arr[]) {
		int n = arr.length;
		for(int i = 0; i<n;i++) {
			System.out.println(arr[i]);
		}
	}
	public static int[] takeinput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	public static int sum(int arr[]) {
		int sum = 0;
		int n = arr.length;
		for(int i = 0; i<n ;i++) {
		sum += arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int[]arr = takeinput();
		printarray(arr);
		int ans = sum(arr);
		System.out.println(ans);
	}
}