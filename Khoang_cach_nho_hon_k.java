package javacore;

import java.util.Arrays;
import java.util.Scanner;
public class Khoang_cach_nho_hon_k {
    public static int N, dem = 0;
    public static long K;
    public static int[] X = new int[10001];
    public static long[] b = new long[10001];

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t > 0) {
            t--;
            N = sc.nextInt();
            K = sc.nextLong();
            for (int i = 1; i < N + 1; i++) {
                b[i] = sc.nextLong();
            }
            Arrays.sort(b);
            for (int i = 1; i < N + 1; i++) {
                System.out.printf(b[i] + " ");
            }

            /*Try(1);
            System.out.println(dem);
            dem=0;
            Arrays.fill(X,0);
            Arrays.fill(b,0);
        }
    }

    public static void Try( int i ) {
        for (int j =X[i-1]+1; j<=N-2+ i; j++){
            X[i] = j;
            if ( i == 2)
            {
                if((b[X[2]]-b[X[1]]) < K) dem++;
                else if((b[X[2]]-b[X[1]]) > K) break;
            }
            else Try (i+1);}}*/
        }
    }
}