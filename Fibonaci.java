package javacore;

import java.util.Scanner;
public class Fibonaci {
    public static void main(String[] args)
    {
        int n,t;
        Scanner s= new Scanner(System.in);
        t = s.nextInt();
    while(t>0)
    {
        t--;
        n= s.nextInt();
        System.out.println(Fibo(n));
    }


    }
     public static long Fibo(int n)
    {
        long a = 1, b = 0, temp;

        while (n > 0){
          temp = a;
          a = a + b;
          b = temp;
          n--;
        }
        return b;
    }
    
}
