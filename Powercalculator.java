	package Recursion;

import java.util.Scanner;

public class Powercalculator {
	public static int power(int a, int n) {
		if (n == 0) {
			return 1;
		}
		int result = a * power(a,n-1);
		return result;
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int n = s.nextInt();
		
		int ans = power(a,n);
		System.out.println(ans);
	}

}
