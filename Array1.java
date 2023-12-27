package Recursion;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		boolean arr[] = new boolean[5];
//		System.out.println(arr[0]);
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int[] arr = new int[10];
	
	for(int i = 0; i<n ; i++) {
		System.out.println("Enter element at" + i + "th index");
		arr[i] = s.nextInt();
	}
	for(int i = 0; i<n ; i++) {
	System.out.print(arr[i] + " ");
	}
	}
}
