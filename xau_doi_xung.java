package javacore;

import java.io.IOException;
import java.util.Scanner;
import java.lang.String;
public class xau_doi_xung {
    public static void main (String[] args)
    {
        int t,d=0,check;
        String S;
        Scanner n = new Scanner(System.in);
        t=n.nextInt();
        while(t>0)
        {
            t--;
            S=n.next();
            d=S.length();
     int dem=0;
                for ( int i=0 ; i< d/2 ;i++)
                {
                    if(S.charAt(i)!=S.charAt(d-i-1)) 
                    {
                        dem++;
                    }
                }
         if(d%2==1 && dem==0) System.out.println("YES");
        else if(dem==1) System.out.println("YES");
         else System.out.println("NO");
        }
    }
}
