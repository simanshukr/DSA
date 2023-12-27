package recursionrevision;

import java.util.Scanner;

public class reversecounting {
	
	public static void reverse(int n) {
		if(n==0) {
			return;
		}
		reverse(n-1);
		System.out.println(n + " ");
	
}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
	
		reverse(n);
	}

}
