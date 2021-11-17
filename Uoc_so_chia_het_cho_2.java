package javacore;

import java.util.Scanner ;
public class Uoc_so_chia_het_cho_2 {

    public static void main(String[] args)
    {
        long n,k;
        int t;
        Scanner s=new Scanner(System.in);
       t=s.nextInt();
    while(t>0)
    {
        t--;
    n=s.nextLong();
       int  dem=0;
       for (int i = 2; i <= Math.sqrt(n); i++)
       {
           if (n % i == 0 )
           {
              if(i%2==0) dem++;
               if(i != (n / i) && (n/i)%2==0)
              {
                   if (i * i != n)
                   {
                       dem++;
                   }
               }
           }
       }
    if(n%2==0) dem++;
    System.out.println(dem);
    }
}  
}

