package javacore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Tim_tu_thuan_nghich {
    public static void main (String[] args)
    {

        Scanner sc = new Scanner(System.in);
        String S1,S2,S;
        ArrayList<String> str = new ArrayList<String>();
        int[] dem = new int[1000];
       // sc.nextLine();
            while (1>0) {
                S2 = sc.nextLine();

                if(S2.length()<1)
                {
                    break;
                }
                String[] w = S2.split("\\s");
                for (int i = 0; i < w.length; i++) {
                    StringBuilder s = new StringBuilder(w[i]);
                    s = s.reverse();
                    if (w[i].equals(s.toString())) {
                        str.add(w[i]);

                    }
                }
            }
        Arrays.fill(dem,0);
        int len=0,max=0;
        for ( int i=0 ; i<str.size() ; i++)
        {
            len=str.get(i).length();
            if(len>max)
            {
                max=len;
            }
        }
        for ( int i=0 ; i<str.size() ; i++)
        {
            if(str.get(i).length()==max)
            {
                dem[(int)(str.get(i).charAt(0))]++;
            }
        }
        for ( int i=0 ; i<str.size() ; i++)
        {
            if(dem[(int)(str.get(i).charAt(0))]>0)
            {
                System.out.print(str.get(i) + " "+dem[(int)(str.get(i).charAt(0))]+" ");
            }
            dem[(int)(str.get(i).charAt(0))]=0;
        }

    }
}
