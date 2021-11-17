package javacore;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Hop_2_day {
    public static void main(String[] args) {
        Set<Long> setA = new HashSet<Long>();
        Scanner sc = new Scanner(System.in);
        Long[] a= new Long[101];
        Long[] b= new Long[101];
        int m, n;
       // Long a;
        m = sc.nextInt();
        n = sc.nextInt();
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextLong();
            setA.add(a[i]);
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextLong();
            setA.add(b[i]);
        }
        for (Long x : setA) {
            System.out.print(x + " ");
        }
    }
}