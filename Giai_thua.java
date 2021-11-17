package javacore;

import java.util.Scanner;

public class Giai_thua {
    public static void main (String[] args)
    {
        int t;
        Scanner n = new Scanner(System.in);
        t= n.nextInt();
        long S=0;
        for (int i=1 ; i<=t ; i++)
        {
                S+=Gt(i);
        }
        System.out.println(S);
    }
    public static long Gt( int t)
    {
        long s=1;
        for( int i=1 ; i<=t ; i++)
        {
            s*=i;
        }
        return s;
    }


}
