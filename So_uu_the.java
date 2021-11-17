package javacore;

import java.util.Scanner;

public class So_uu_the {
    public static void main(String[] args) {
        int t, d = 0;
        String S;
        Scanner n = new Scanner(System.in);
        t = n.nextInt();
        while (t > 0) {
            t--;
            S = n.next();
            d = S.length();
            int dem = 0;
            boolean check=true;
            if(S.codePointAt(0)==48)  System.out.println("INVALID");
            else {
                for (int i = 0; i < d; i++) {
                    int k = S.codePointAt(i)-48;
                    if (k >= 0 && k <= 9) {
                        if (k % 2 == 0) dem++;
                    }
                    else {
                        check=false;
                        System.out.println("INVALID");
                        break;
                    }
                }
                if ((d - dem > dem) && d % 2 == 1 && check) System.out.println("YES");
                else if ((d - dem < dem) && d % 2 == 0 && check) System.out.println("YES");
                else if(check) System.out.println("NO");
            }
        }
    }
}
