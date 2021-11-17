package javacore;

import java.util.Scanner;
public class Diem_can_bang {
    public static void main(String[] args)
    {
        int t,n;
        long sum,S;
       Scanner  s = new Scanner(System.in);
       t = s.nextInt();
    while(t>0) 
    {
        t--;
        n = s.nextInt();
        S=0;
        int[] a = new int[n+1];
    for ( int i=0 ; i<n ;i++)
    {
        a[i]=s.nextInt();
        S+=a[i];
    }
    a[n]=0;
    sum=0;
    int k=0;
    for ( int i=0 ;i<n ;i++)
    {
        sum+=a[i];
        if(sum == (S-a[i+1])/2 && (S-a[i+1])%2==0 )
        {   k=1;
            System.out.println(i+2);
            break;
        }
    }
    if(k==0)  System.out.println(-1);
    }


    }
}
