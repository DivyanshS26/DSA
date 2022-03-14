package Arrays;

import java.util.Scanner;

public class Rotate {

	private static void sol(int[] a, int n) {
		// TODO Auto-generated method stub
		for (int i = n - 1; i > 0; i--) {
			int t = a[i];
			a[i] = a[i - 1];
			a[i - 1] = t;
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
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
	}

}
