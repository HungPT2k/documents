package javacore;

import java.util.Arrays;
import java.util.Scanner;

public class So_lien_ke {
    public static void main ( String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        while (t-- > 0) {
            String s;
            s = sc.next();
            boolean check = true;
            for (int i = 0; i < s.length() - 1; i++) {
                if (Math.abs(s.codePointAt(i) - s.codePointAt(i + 1)) != 1) {
                    check = false;
                    break;
                }
            }
            if (check) System.out.println("YES");
            else System.out.println("NO");
        }
    }}