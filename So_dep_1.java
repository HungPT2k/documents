package javacore;

import java.io.IOException;
import java.util.Scanner;
import java.lang.String;
public class So_dep_1 {
    public static void main (String[] args)
    {
        int t,d=0,check=1,l;
        String S;
        int ch=0,ck=0;
    Scanner n = new Scanner(System.in);
        t=n.nextInt();
    while(t>0)
    {
        t--;
    S=n.next();
    d=S.length();
    if(d%2==0) l=d/2;
    else l=(d/2)+1;
    check=1;
    ch=S.codePointAt(0)-48;
    if(ch==0)
    {
        check=0;
        
    }
    else
    {
    for ( int i=0 ; i< l ;i++)
    {
        ch=S.codePointAt(i)-48;
        ck=S.codePointAt(d-i-1)-48;
    if(ch != ck || ch%2==1 || ck%2==1 )
    {
        check =0;
        break;
    }
    }
}
    if(check==1) System.out.println("YES");
    else System.out.println("NO");

    }

    }
}
