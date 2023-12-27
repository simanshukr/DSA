package Recursion;

public class SumofNnumnbers {
	public static int sumofn(int n) {
		if(n==0) {
			return 0;
		}
		int smalloutput = sumofn(n-1);
		int output = n + smalloutput;
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumofn(10));
	}

}
