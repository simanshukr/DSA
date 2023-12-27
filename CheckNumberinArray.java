package Recursion;

import java.util.Scanner;

public class CheckNumberinArray {
	
	public static boolean checkNumber(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		int result = helper(input, 0,x);
		if (result == -1){
			return false;
		}else{
			return true;
		}
	}
	public static int helper(int a[], int si, int x){
		if(si == a.length){
			return -1;
		}
		if(a[si] == x){
			return si;
		}
		return helper(a, si+1,x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		int x = s.nextInt();
		System.out.println(checkNumber(input, x));
	}

}
