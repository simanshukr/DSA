package Recursion;

import java.util.Scanner;

public class CountingofDigits {
	public static int count(int n) {
		if (n == 0) {
			return 0;
		}
		else {
		return 1 + count(n/10);
	
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	
		int n = s.nextInt();
		
		int ans = count(n);
		System.out.println(ans);
	}

}
