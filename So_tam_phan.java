package javacore;

import java.util.Arrays;
import java.util.Scanner;

public class So_tam_phan {
    public static void main ( String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        while (t-- > 0) {
            String s;
            s = sc.next();
            boolean[] check = new boolean[10];
            Arrays.fill(check,false);
            boolean ck=true;
            check[0]=check[1]=check[2]=true;
            for (int i = 0; i < s.length() ; i++) {
                if (!check[s.codePointAt(i)-48]) {
                    ck= false;
                    break;
                }
            }
            if (ck) System.out.println("YES");
            else System.out.println("NO");
        }
    }}