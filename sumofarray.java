package recursionrevision;

import java.util.Scanner;

public class sumofarray {

	public static int sumofarr(int input[]) {
		return sumhelper(input, 0);
	}
	
	
	public static int sumhelper(int input[], int idx) {
		
		if(idx==input.length) {
			return 0;
		}
		return input[idx]+ sumhelper(input, idx+1);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[]=new int[n];
		for(int i=0; i<n; i++) {
			input[i]=s.nextInt();
		}
		System.out.println(sumofarray.sumofarr(input));
	}

}
