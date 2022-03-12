package Arrays;

import java.util.Scanner;

public class Kthsamllest {
		
	private static int partition(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		int x = a[i];
		int l = i;
		for(int r = i + 1; r <= j; r++) {
			if(a[r] <= x) {
				l += 1;
				int t = a[l];
				a[l] = a[r];
				a[r] = t;
			}
		}
		int t = a[i];
		a[i] = a[l];
		a[l] = t;
		return l;
	}
	
	private static void selepro(int a[], int i, int j, int k) {
		// TODO Auto-generated method stub
		if(i == j) {
			if(i == k) {
				System.out.println(a[i]);
			}
			else {
				System.out.println(-1);
			}
		}
		else {
			
			int m = partition(a, i, j);
			if(m == k) {
				System.out.println(a[m]);
			}
			else if(m > k) {
				selepro(a, i, m - 1, k);
			}else {
				selepro(a, m + 1, j, k);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scn.nextInt();
		}
		int k = scn.nextInt();
		selepro(a, 0, n - 1, k - 1);
		
	}

}
