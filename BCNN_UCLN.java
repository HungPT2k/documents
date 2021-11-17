package javacore;

import java.util.Scanner;
import java.util.stream.LongStream;
public class BCNN_UCLN {
    
    public static void main (String[] args)
    {
        int t;
        Long BCNN,k,m,n;
    Scanner s=new Scanner(System.in);
    t=s.nextInt();
    while(t>0)
    {
        t--;
        n=s.nextLong();
        m=s.nextLong();
        k=USCLN(m,n);
        BCNN =m*n/k;
    System.out.println(BCNN +" " +k);
    }
}
    public static long USCLN(long a, long b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }

}

