package javacore;

import java.util.Scanner;

public class Dien_thoai {
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        String S1;
        sc.nextLine();
        while (t > 0) {
            t--;
            S1 = sc.nextLine();
            S1 = S1.toLowerCase();
            String S = "";
            for (int i = 0; i < S1.length(); i++) {
                int k = S1.codePointAt(i);
                if (k <= 99 && k >= 97) S += String.valueOf('2');
                else if (k <= 102 && k >= 100) S += String.valueOf('3');
                else if (k <= 105 && k >= 103) S += String.valueOf('4');
                else if (k <= 108 && k >= 106) S += String.valueOf('5');
                else if (k <= 111 && k >= 109) S += String.valueOf('6');
                else if (k <= 115 && k >= 112) S += String.valueOf('7');
                else if (k <= 118 && k >= 116) S += String.valueOf('8');
                else if (k <= 122 && k >= 119) S += String.valueOf('9');
                else {
                    System.out.println("NO");
                    break;
                }
            }
            StringBuilder s = new StringBuilder(S);
            s.reverse();
            if (S.equals(s.toString())==true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
