package recursionrevision;

import java.util.Scanner;

public class chechknuminarr {
	
	public static boolean checknum(int input[], int x) {
		return checknumhelper(input, x, 0);
	}

	public static boolean checknumhelper(int input[], int x, int idx) {
		if(idx == input.length) {
			return false;
		}
		if(input[idx]==x) {
			return true;
		}
		return checknumhelper(input, x, idx+1);
	}
 
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int input[] = new int[n];
	for(int i = 0; i < n; i++) {
		input[i] = s.nextInt();
	}
	int x = s.nextInt();
	System.out.println(checknum(input, x));
}
}