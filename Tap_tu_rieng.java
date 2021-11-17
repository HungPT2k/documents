package javacore;
import java.util.*;

public class Tap_tu_rieng {

    public static  void main(String[] args)
    {
        int t;
        Scanner sc= new Scanner(System.in);
        t = sc.nextInt();
        sc.nextLine();
        while(t>0)
        {
            t--;
            String s1,s2;
            s1=sc.nextLine();
            s2=sc.nextLine();
            Set<String> world  = new HashSet<String>();
            String[] w1 = s1.split("\\s");
            String[] w2 = s2.split("\\s");
            boolean check=true;
            for(String o:w1)
            {   check=true;
                for( String o2:w2)
                {
                    if(o.equals(o2))
                    {
                        check=false;
                        break;
                    }
                }
                if(check) world.add(o);
            }

        for(String s:world)
        {
            System.out.print(s+' ');
        }
            System.out.println();
        world.clear();
        }
    }
}
