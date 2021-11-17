package javacore;

import java.util.Scanner;
import java.math.BigDecimal;
public class Tong_so_nguyen_lon_2 {
    public static void main(String[] args)
    {
        
        Scanner input = new Scanner(System.in);
        BigDecimal x,y,sum;
        x = new BigDecimal(input.next());
        y = new BigDecimal(input.next());
        
        sum = x.add(y);
        System.out.println(sum);
    }
}
