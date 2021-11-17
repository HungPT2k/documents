package javacore;

import java.util.Scanner;

public class cat_chuoi {
    public static void main(String[] args) {
        int t;
        String S;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            S = sc.next();
            String s = "0";
            boolean check = true;
            for (int i = 0; i < S.length(); i++) {
                if ((int) S.charAt(i) - 48 == 0) s += String.valueOf(0);
                else if ((int) S.charAt(i) - 48 == 1) s += String.valueOf(1);
                else if ((int) S.charAt(i) - 48 == 8) s += String.valueOf(0);
                else if ((int) S.charAt(i) - 48 == 9) s += String.valueOf(0);
                else {
                    check = false;
                    System.out.println("INVALID");
                    break;
                }
            }
            if (check) {
                int i = 0;
                while (s.charAt(i) == '0' && i<s.length()-1) i++;
               // System.out.println(i);
                if (i== s.length()-1) {
                    System.out.println("INVALID");
                }
                else
                {
                    for (int j = i; j < s.length(); j++) {
                        System.out.print(s.charAt(j));
                    }
                    System.out.println();
                }
            }
        }
    }
}
