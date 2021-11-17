package javacore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Sap_xep_thoi_gian {
    public static void main ( String[] args)
    {
        int t;
        Scanner sc = new Scanner(System.in);
        ArrayList<String> str = new ArrayList<String>();
        t=sc.nextInt();
        sc.nextLine();
        while(t-- >0)
        {
            String s;
            s=sc.nextLine();
            str.add(s);
        }
        Collections.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] S1 = o1.split("\\s");
                String[] S2 = o2.split("\\s");
                if(S1[0].equals(S2[0]))
                {
                    if(S1[1].equals(S2[1])) return Integer.parseInt(S1[2])-Integer.parseInt(S2[2]);
                    else return Integer.parseInt(S1[1])-Integer.parseInt(S2[1]);
                }
                else return Integer.parseInt(S1[0])-Integer.parseInt(S2[0]);

            }
        });
        for ( int j=0 ; j<str.size() ; j++) {
            System.out.print(str.get(j) + " \n");
        }
    }

}
