package javacore;

import java.util.Arrays;
import java.util.Scanner;

public class Dem_4_7 {
    public static void main ( String[] args) {

        Scanner sc = new Scanner(System.in);
            String s;
            s = sc.next();
            boolean[] check = new boolean[10];
            Arrays.fill(check,false);

            int dem=0;
            check[4]=check[7]=true;
            for (int i = 0; i < s.length() ; i++) {
                if (check[s.codePointAt(i)-48]) {
                    dem++;
                }
            }
            if (dem==7 || dem==4) System.out.println("YES");
            else System.out.println("NO");
        }
    }