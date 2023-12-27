 package Recursion;

public class IsArraySortedBetter {
	
	public static boolean isSortedbetter(int a[], int si) {
		if(si == a.length) {
			return true;
		}
		if(a[si]>a[si+1]) {
			return false;
		}
		boolean isSmallArraySorted = isSortedbetter(a, si+1);
		return isSmallArraySorted;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
