package javacore;

import java.util.Arrays;
import java.util.Scanner ;
public class Tong_uoc_so {

    public static void main(String[] args)
    {
      
        int a,b,dem=0;
        Scanner s=new Scanner(System.in);
       a=s.nextInt();
        b=s.nextInt();
        boolean[] check = new boolean[b+1];
        Arrays.fill(check,true);
          for (int i = 2; i <= b; i++) {
            if (check[i] == true) {
              for (int j = 2 * i; j <=b; j += i)
               {
                check[j] = false;
              }
          }
        }
    for(int n=a ; n<=b;n++)
    {
        if(check[n]==true) continue;
        else
        {
       int sum=1,k;
       k=n;
       for (int i = 2; i <= Math.sqrt(n); i++)
       {    
           if (n % i == 0 )
           {
              sum+=i;
               if(i != (n / i))
               {
                   if (i * i != n)
                   {
                      sum+=(n/i);
                      check[n/i]=true;
                   }
               }
           }
       }
    if(sum>k && k!=1) dem++;
        }
    }
    System.out.println(dem);
    }
}  


