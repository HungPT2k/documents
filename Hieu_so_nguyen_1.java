package javacore;

import java.util.Scanner;
import java.math.BigInteger;
public class Hieu_so_nguyen_1 {
    public static void main(String[] args)
    {
        
        Scanner input = new Scanner(System.in);
        String x,y,z;
        BigInteger a,b,sub;
        int t,d1,d2,max;
        t = input.nextInt();
        while(t>0)
        {
            t--;
        x = input.next();
        y = input.next();
        d1=x.length();
        d2=y.length();
        if(d1>d2) max=d1;
        else max=d2;
         a = new BigInteger(x, 10);
         b= new BigInteger(y,10);
        sub = a.subtract(b);
        sub=sub.abs();
        z = sub.toString();
        d1 = z.length();
    while(max-d1>0)  
    {
        System.out.print("0");
        d1++;
    }
        System.out.print(sub);
        System.out.print("\n");
        }
    }
}
