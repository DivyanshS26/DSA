package Arrays;
import java.util.*;

public class MaxAndMin {
	public static int max(int[] a, int n){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(max < a[i]){
                max = a[i];
            }
        }
        return max;
    }
    public static int min(int[] a, int n){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(min > a[i]){
                min = a[i];
            }
        }
        return min;
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(max(a, n));
        System.out.println(min(a, n));
	}
}
