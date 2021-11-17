package javacore;

import java.io.IOException;
import java.util.Scanner;
public class PT {
    public static void main(String[] args)
    {
        int t,a,b;
        Scanner s =new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        double n = Math.round(((double)b/(double)a)*100.00) / 100.00;
        if(a==0 && b==0) System.out.println("VSN");
        else if (a==0 && b!=0) System.out.println("VN");
        else   System.out.println(-n);
        
      //  if(a*b>0) System.out.print("-");
    //    System.out.println(String.format("%.2d", b/a));
    
    
}

}
