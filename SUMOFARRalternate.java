package recursionrevision;

import java.util.Scanner;

public class SUMOFARRalternate {
	
	public static int sum(int input[]) {
		int sum = 0;
int n = input.length;
for(int i = 0; i<n ;i++) {
sum += input[i];
}
return sum;
}
/* Your class should be named Solution
 * Don't write main().
 * Don't read input, it is passed as function argument.
 * Return output and don't print it.
	 * Taking input and printing output is handled automatically.
*/


public static void printarray(int arr[]) {
int n = arr.length;
for(int i = 0; i<n;i++) {
	System.out.println(arr[i]);
}
}
public static int[] takeinput() {
Scanner s = new Scanner(System.in);
int n = s.nextInt();
int[] arr = new int[n];

for(int i = 0; i<n; i++) {
	arr[i] = s.nextInt();
}
return arr;
}


public static void main(String[] args) {
int[]arr = takeinput();
printarray(arr);
int ans = sum(arr);
System.out.println(ans);

}
}
