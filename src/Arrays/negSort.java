package Arrays;

import java.util.Iterator;
import java.util.Scanner;

public class negSort {

	private static void sol(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		int x = 0;
		int l = i;
		for (int r = i; r <= j; r++) {
			if(a[r] < x) {
				int t = a[r];
				a[r] = a[l];
				a[l] = t;
				l += 1;
			}
		}
		for (int k = 0; k <= j; k++) {
			System.out.print(a[k] + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		sol(a, 0, n - 1);
	}

}
