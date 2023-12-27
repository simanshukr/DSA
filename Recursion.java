package Recursion;

import java.util.Scanner;

public class Recursion {
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		int smallOutput = fact(n-1);
		int output = n * smallOutput;
		return output;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int result = fact(n); 
		System.out.println(result);
	}

}
