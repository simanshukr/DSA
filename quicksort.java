package recursionrevision;

import java.util.Scanner;

public class quicksort {

	public static int partition(int a[],int si,int ei){
        int pivotElement=a[si];
        int smallerNumCount=0;
        for(int i=si+1;i<=ei;i++){
            if(a[i]<pivotElement){
                smallerNumCount++;
            }
        }
        int temp=a[si+smallerNumCount];
        a[si+smallerNumCount]=pivotElement;
        a[si]=temp;
        int i=si;
        int j=ei;
        while(i<j){
            if(a[i]<pivotElement){
                i++;
            }else if(a[j]>=pivotElement){
                j--;
            }else{
                 temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            }
        }
        return si+smallerNumCount;
    }	
	public static void quickSort(int[] input,int startIndex, int endInedx) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */

   // public static void quickSort(int a[],int si,int ei){
        if(startIndex>=endInedx){
            return;
        }
        int pivotIndex=partition(input,startIndex,endInedx);
        quickSort(input,startIndex,pivotIndex-1);
        quickSort(input,pivotIndex+1,endInedx);	
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int a[] = new int[n];
		for(int i = 0; i<=n; i++) {
			a[i] = s.nextInt();
		}
		
		quickSort(a, 0, a.length-1);
		for(int i = 0; i<a.length; i++) {
			System.out.println(a[i] + " ");
		}
	}

}
