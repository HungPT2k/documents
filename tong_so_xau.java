package javacore;

import java.util.ArrayList;
import java.util.Scanner;

public class tong_so_xau {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String xau=sc.nextLine();
        String s="";
        ArrayList<String> Str= new ArrayList<String>();
        int sum=0;
        for ( int i=0 ; i<xau.length();i++)
        {
            if(xau.codePointAt(i)>=48 && xau.codePointAt(i)<=57 )
            {
                s+=String.valueOf(xau.charAt(i));
            }
            else
            {
                if(!s.equals("")) Str.add(s);
                s="";
            }
        }
        for (int i=0 ; i<Str.size() ; i++)
        {
            sum+=Integer.parseInt(Str.get(i));
        }
        System.out.println(sum);
    }

}
