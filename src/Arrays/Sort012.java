package Arrays;

import java.util.Iterator;
import java.util.Scanner;

public class Sort012 {

	private static void sol(int[] a, int n) {
		// TODO Auto-generated method stub
		int c1 = 0;
		int c2 = 0;
		int c0 = 0;

		for (int i = 0; i < n; i++) {
			if (a[i] == 0) {
				c0++;
			} else if (a[i] == 1) {
				c1++;
			} else {
				c2++;
			}
		}
		int j = 0;
		if(c0 != 0) {			
			for(int i = j; i < c0; i++) {
				a[i] = 0;
				j++;
			}
		}
		if(c1 != 0) {			
			for(int i = j; i < c1 + c0; i++) {
				a[i] = 1;
				j++;
			}
		}
		if(c2 != 0) {			
			for(int i = j; i < c1 + c0 + c2; i++) {
				a[i] = 2;
				j++;
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		sol(a, n);
	}

}
