package javacore;

import java.util.Scanner;
import java.math.BigDecimal;
public class Tong_so_nguyen_1 {
    public static void main(String[] args)
    {
        
        Scanner input = new Scanner(System.in);
        BigDecimal x,y,sum;
        int t;
        t = input.nextInt();
        while(t>0)
        {
            t--;
        x = new BigDecimal(input.next());
        y = new BigDecimal(input.next());
        sum = x.add(y);
        System.out.println(sum);
        }
    }
}
