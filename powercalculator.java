package recursionrevision;

import java.util.Scanner;

public class powercalculator {
	
	public static int power(int a,int n) {
		if (n==0) {
			return 1;
		}
		int result = a*power(a, n-1);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int n = s.nextInt();
		
		int result = power(a, n);
		System.out.println(result);
		
	}

}
