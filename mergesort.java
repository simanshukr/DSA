package recursionrevision;

public class mergesort {
	//write a function for merging two sorted arrays
	public static void merge(int a1[], int a2[], int d[]) {
		int i = 0;
		int j = 0;
		int k = 0;
		
		while (i<a1.length && j<a2.length) {
			if (a1[i]<a2[j]) {
				d[k] = a1[i];
				i++;
				k++;
			}
			if (a1[i]>a2[j]) {
				d[k] = a2[j];
				k++;
				j++;
			}
		}
		//now for rest of element in array written directly merged array
		if(i<a1.length) {
			while(i<a1.length) {
				d[k] = a1[i];
				i++;
				k++;
			}
		}
		if(j<a2.length) {
			while(j<a2.length) {
				d[k] = a2[j];
				k++;
				j++;
			}
		}
	}
	
	

	public static void mrgesort(int a[], int l , int r) {
		l = a[0];
		r= a.length;
		if (a.length <= 1) {
			return;
		}
		//split the array into two unsorted array
		int b[] = new int[a.length/2];
		int c[] = new int[a.length - b.length];
		
		for(int i=0; i<a.length/2; i++) {
			b[i] = a[i];
		}
		for (int i=a.length/2; i<a.length; i++) {
			c[i-a.length/2] = a[i];
		}
		mrgesort(b,l,r);
		mrgesort(c,l,r);
		merge(b, c, a);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,4,9,3,2,17,12,5,21};
		int l = a[0];
		int r = a.length;
		mrgesort(a,l,r);
		for (int i =0; i<a.length; i++) {
			System.out.print(a[i]);
		}
	}

}
