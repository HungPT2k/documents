package javacore;

import java.io.IOException;
import java.util.Scanner;
import java.lang.String;
public class So_dep_3 {
    public static void main (String[] args)
    {
        int t,d=0,check;
        String S;
        Scanner n = new Scanner(System.in);
        boolean[] Check = new boolean[9];
        t=n.nextInt();
        while(t>0)
        {
            t--;
            S=n.next();
            d=S.length();
            check=1;
        Check[2]=Check[3]=Check[5]=Check[7]=true;
        int ch=0,ck=0;
                for ( int i=0 ; i< d/2 ;i++)
                {
                    ch=S.codePointAt(i)-48;
                    ck=S.codePointAt(d-i-1)-48;
                    if(ch != ck || Check[ck]!=true || Check[ch]!=true)
                    {
                        check =0;
                        break;
                    }
                }
            if(check==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
