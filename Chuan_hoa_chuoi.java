package javacore;

import java.util.Scanner;
public class Chuan_hoa_chuoi {
    public static void main (String[] args)
    {
        int t;
    Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        String S1,S2,s;
        sc.nextLine();
    while(t>0)
    {
        t--;
    S1 = sc.nextLine();
    S2 = S1.trim().toLowerCase();
    S2 = S2.replaceAll("\\s+", " ");
    String[] w = S2.split("\\s");
    s = null;
    for (int i=0 ; i<w.length-1 ; i++)
    {
       s= String.valueOf(w[i].charAt(0)).toUpperCase() + w[i].substring(1);
       System.out.print(s+" ");
    }
    s= String.valueOf(w[w.length-1].charAt(0)).toUpperCase() + w[w.length-1].substring(1);
    System.out.print(s);
    System.out.print("\n");
    }
    }
}
