package javacore;

import java.util.Scanner;
public class Test_Fibo {
    public static void main(String[] args)
    {
        int t;
        Long n;
        Scanner s= new Scanner(System.in);
        t = s.nextInt();
    while(t>0)
    {
        t--;
        n= s.nextLong();
        int  i=1;
        long k;
        while(n>=0)
        {  
          
            k=n-Fibo(i);
            if(n==0)
            {
                System.out.println("YES");
                break;
            }
            if(k==0)
            {
                System.out.println("YES");
                break;
            }
             if(k<0)  
            {
                System.out.println("NO");
                break;
            }  
            else i++;
        }   
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
