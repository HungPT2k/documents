package javacore;

import java.util.Arrays;
import java.util.Scanner;

public class Giao_2_day {
    public static void main(String[] args) {
        int t, x;
        Scanner n = new Scanner(System.in);
        t = n.nextInt();
        x = n.nextInt();
        int[] a = new int[t + 2];
        int[] b = new int[x + 2];
        for (int i = 1; i <= t; i++) {
            a[i] = n.nextInt();
        }
        for (int i = 1; i <= t-1; i++) {
            for (int j = i+1; j <= t; j++) {
                if(a[i]>a[j])
                {
                    int tem=a[i];
                    a[i]=a[j];
                    a[j]=tem;
                }
            }
        }
        for (int i = 1; i <= x; i++) {
            b[i] = n.nextInt();
        }
        for (int i = 1; i <= t; i++) {
            for (int j = 1; j <=x; j++) {
                if (a[i] == b[j]) {
                    System.out.print(a[i] + " ");
                    break;
                }
            }
        }
    }
}
