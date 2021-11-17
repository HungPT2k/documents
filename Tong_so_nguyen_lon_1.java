package javacore;

import java.util.Scanner;
public class Tong_so_nguyen_lon_1 {
    public static void main(String[] args)
    {
        String S1,S2;
       int t,d1,d2,max,ch,k=0,l=0;
       Scanner s = new Scanner(System.in);
       t=s.nextInt();
       while(t>0)
       {
        t--;
        S1 = new Scanner(System.in).nextLine();
        S2 = new Scanner(System.in).nextLine();
        d1=S1.length();
        d2=S2.length();
        if(d1>d2) max=d1;
        else max=d2;
        int[] a = new int[max+1];
        ch=l=k=0;
    for ( int i=0 ; i<max ;i++)
    {  
        if((d1-1-i)>=0) 
       {
            k=S1.codePointAt(d1-1-i)-48;
       }
       if( (d2-i-1)>=0)
       {
        l=S2.codePointAt(d2-1-i)-48;
       }
       ch+=(k+l);
        if(ch>9)
        {   
            if(i==max-1)
            {
                a[i]=ch;
              //  max+=1;
                break;
            }
            a[i]=ch%10;
            ch=1;
        }
        else
        {
            a[i]=ch;
            ch=0;
        }
        l=k=0;
    }
    for ( int i= max-1 ;i>=0 ; i-- )
    {
        System.out.print(a[i]);
    }
        System.out.print("\n");
}
}
}
