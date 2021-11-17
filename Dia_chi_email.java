package javacore;

import java.util.Arrays;
import java.util.Scanner;
//import java.lang.Integer.parseInt;
public class Dia_chi_email {
    public static void main (String[] args)
    {
        int t;
    Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        sc.nextLine();
        String S1 ,S2,str,s;
        int[] dem = new int[1000];
       Arrays.fill(dem,1);
       str=" ";
    while(t>0)
    {
        t--;
       
    S1 = sc.nextLine();
    S2 = S1.trim().toLowerCase();
    S2 = S2.replaceAll("\\s+", " ");
    String[] w = S2.split("\\s");
    s= w[w.length-1];
    for (int i=0 ; i<w.length-1 ; i++)
    {
       s+= String.valueOf(w[i].charAt(0));
    }
    if(str.indexOf(s)>=0)
    {   dem[s.codePointAt(0)]++;
        System.out.println(s +dem[s.codePointAt(0)]+"@ptit.edu.vn");
    }
    else System.out.println(s + "@ptit.edu.vn");
    str=str + s;
  str= str + String.valueOf('.');
    }
    }
}
