package javacore;

import java.util.Scanner;
import java.math.BigDecimal;
public class Hieu_so_nguyen_2 {
    public static void main(String[] args)
    {
        
        Scanner input = new Scanner(System.in);
        BigDecimal x,y,sub;
        x = new BigDecimal(input.next());
        y = new BigDecimal(input.next());
        
        sub = x.subtract(y);
        
        System.out.println(sub);
    }
}
