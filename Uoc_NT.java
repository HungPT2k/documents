package javacore;

import java.util.Arrays;
import java.util.Scanner;
public class Uoc_NT {
  public static void main(String[] args) {
    int t;
    long n;
    Scanner s = new Scanner(System.in);
    t=s.nextInt();
    while(t>0)
    {   t--;
        n=s.nextLong();
        if(Check(n)==true)  System.out.println(n);
        else
        {
        boolean[] check = new boolean[1000000001];
        Arrays.fill(check,true);
          for (int i = 2; i <= n; i++) {
            if (check[i] == true) {
              for (int j = 2 * i; j <= n; j += i)
               {
                check[j] = false;
              }
          }
        }
            
          for (int i = (int)(n)/2; i>=2; i--) 
            {
            if (check[i] == true && (int)n%i==0) 
          {  
                System.out.println(i);
                break;
          } 
           }
             }
            }
    }
    public static boolean Check(long n)
    {
        
        if (n <= 1)  return false;
        if (n <= 3)  return true;
        if (n%2 == 0 || n%3 == 0) return false;
    
        for (int i=5; i*i<=n; i=i+6)
           {if (n%i == 0 || n%(i+2) == 0)  return false;}
      
        return true;
    }
}

