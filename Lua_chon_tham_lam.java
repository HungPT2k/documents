package javacore;

import java.util.Arrays;
import java.util.Scanner;

public class Lua_chon_tham_lam {
    public static void main(String[] args)
    {

    int t,S,D;
		Scanner sc = new Scanner(System.in);
        D = sc.nextInt();
        S = sc.nextInt();
        int[] a = new int[D+1];
        int[] b = new int[D+1];
        Min(S,D,a);
        System.out.print(" ");
         Max(S,D,b);
    }
    public static void Max(int S , int D , int b[])
{
        if(S>D*9 || D<=0 || S<=0 ) System.out.print(-1);
        else
        {
    Arrays.fill(b,0);
    int k=1;
    if(S<=9) b[k]=S;
    else
    {
    while(S>9)
    {	b[k]=9;
        k+=1;
        S-=9;
    }
      b[k] = S;
    }
    for(int i=1 ; i<=D ; i++)
    {	System.out.print(b[i]) ;}
    }
}
     public static void Min(int S , int D , int b[])
    {
        if(S>D*9 || D<=0 || S<=0 ) System.out.print(-1);
			else
			{
                Arrays.fill(b,0);
		int n;
			n=D;
			while(S>9 && D>1)
		{	b[D]=9;
			D--;
			S-=9;}
			if(D>1)
		{	b[1] = 1;
			b[D] = S-1;
			}
			else
			{	b[1] = S;
			}
		for(int i=1 ; i<=n ; i++)
		{	System.out.print(b[i]) ;}
		}
    }
}
