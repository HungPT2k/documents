package javacore;

import java.util.Scanner;
public class Chia_tam_giac {
    public static void main(String[] args)
{
            int k,t;
            double a,h;
        Scanner s = new Scanner (System.in);
t=s.nextInt();
while(t>0)
{
        t--;
    k=s.nextInt();
    h=s.nextDouble();

            for( int i=1 ; i<k ; i++)
            {
    System.out.print(String.format("%.6f ", h*Math.sqrt((double)i/k)));
            }
            System.out.print("\n");
}    
}
}
