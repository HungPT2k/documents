package javacore;

import java.util.Scanner;
import java.math.BigInteger;
public class UCNL_2_so_lon {
    
    public static void main (String[] args)
    {
        int t;
        Scanner s=new Scanner(System.in);
        BigInteger UCLN,m,n;
    t=s.nextInt();
    while(t>0)
    {
        t--;
        n = new BigInteger(s.next());
        m = new BigInteger(s.next());
       UCLN =   m.gcd(n);
    System.out.println(UCLN);
    }
}
   

}

