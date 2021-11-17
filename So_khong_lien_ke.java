package javacore;

import java.util.Arrays;
import java.util.Scanner;

public class So_khong_lien_ke {
    public static void main ( String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        while (t-- > 0) {
            String s;
            s = sc.next();
            boolean check = true;
            int Sum=s.codePointAt(s.length()-1)-48;
            for (int i = 0; i < s.length() - 1; i++) {
                if (Math.abs(s.codePointAt(i) - s.codePointAt(i + 1)) != 2) {
                    check = false;
                    break;
                } else {
                    Sum += s.codePointAt(i) - 48;
                }
            }
            if (check && Sum%10==0) System.out.println("YES");
            else System.out.println("NO");
        }
    }}