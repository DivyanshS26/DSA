package Arrays;

import java.util.Scanner;

public class MaxcontiguousSum {

	private static long sol(int[] a, int n) {
		// TODO Auto-generated method stub
		long sum = Integer.MIN_VALUE;
		long currSum = 0;
		for(int i = 0; i < n; i++) {
			if(currSum < 0) {
				currSum = 0;
			}
			currSum += a[i];
			sum = Math.max(currSum, sum);	
		}
		return sum;

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		System.out.println(sol(a, n));
	}

}
