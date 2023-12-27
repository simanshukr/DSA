
// Given an array of length N and an integer x, you need to find 
//if x is present in the array or not. Return true or false.Do this recursively.

package Recursion;

//import java.lang.reflect.Array;
import java.util.Scanner;

public class Array2 {
	
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
//	public static int sum(int arr[]) {
//		int sum = 0;
//		int n = arr.length;
//		for(int i = 0; i<n ;i++) {
//		sum += arr[i];
//		}
//		return sum;
//	}
	
	public static void check(int arr[]) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int n = arr.length;
		for(int i =0; i<n; i++) {
			if(x==arr[i]) {
				System.out.println("true");
				//return;
			}else {
				System.out.println("false");
				//return false;
			}
		}
		
	}
	
	public static void main(String[] args) {
		int[]arr = takeinput();
		printarray(arr);
		check(arr);
		//int ans = sum(arr);
		//System.out.println(ans);
	}
}