package javacore;

import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;
public class Chia_het_11 {
    public static void main (String[] args)
    {
        int t,d=0;
        String S;
    Scanner n = new Scanner(System.in);
        t=n.nextInt();
    while(t>0)
    {
        t--;
    S=new Scanner(System.in).nextLine();
    d=S.length();
    long ch=0;
    if(d%2==1) 
    {ch=S.codePointAt(d-1)-48;d-=1;}
    for ( int i=0 ; i< d ;i+=2)
    {
        ch+=((S.codePointAt(i)-48)-(S.codePointAt(i+1)-48));
    }   
    if(Math.abs(ch)%11==0 )
    {
        System.out.println("1");
    }
    else  System.out.println("0");
    }


    }

    }
