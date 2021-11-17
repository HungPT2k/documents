
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;
import java.util.Scanner;

public class Day_con_co_tong_Nt {
    public static int N;
    public static int[] X = new int[15];
    public  static int[] b = new int[15];
    public   static ArrayList<Integer> numbers = new ArrayList<Integer>();
    public   static ArrayList<Integer> numbers2 = new ArrayList<Integer>();
    public   static ArrayList<ArrayList<Integer> > matrix = new ArrayList<ArrayList<Integer> >();

    public static void main(String[] args)
    {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while(t>0)
        {
            t--;
            N = sc.nextInt();
            for( int i=1 ; i<=N ; i++)
            {
                b[i] = sc.nextInt();
            }
            for( int i=1 ; i<N ; i++)
            {
                for( int j=i+1 ; j<=N ; j++)
                {	    if(b[i]<b[j])
                {
                    int temp = b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
                }
            }

            for ( int i=1 ; i<=N ; i++)
            { Try(1,i);}
            Collections.sort(matrix, new Comparator<ArrayList<Integer>>() {
                @Override
                public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                    String sum1 ,sum2;
                    sum1=null;
                    for (int o : o1)
                    {   sum1+=String.valueOf((o));}
                    sum2=null;
                    for (int o : o2)
                    {   sum2+=String.valueOf((o));}
                    return sum1.compareTo(sum2);
                }
            });
            for ( int i=0 ; i<matrix.size() ; i++)
            {
                for ( int j=0 ; j<matrix.get(i).size() ; j++) {
                    System.out.print(matrix.get(i).get(j) + " ");
                }
                System.out.println();
            }

            matrix.clear();
            numbers2.clear();
        }
    }

    public static void Try( int i,int K ) {
        for (int j =X[i-1]+1; j<=N-K+i; j++){
            X[i] = j;
            if ( i == K)
            {   int sum=0;
                for( int a=1 ; a<=K ; a++)
                {
                    sum+=b[X[a]];
                }
                if(Check(sum))
                {
                    for( int a=1 ; a<=K ; a++)
                    {
                        numbers.add(b[X[a]]);
                    }
                    //   numbers.sort(Comparator.reverseOrder());
                    numbers2 = (ArrayList<Integer>)numbers.clone();
                    matrix.add(numbers2);
                    numbers.clear();
                }
            }
            else Try (i+1,K);}}
    public static boolean Check(int n)
    {

        if (n <= 1)  return false;
        if (n <= 3)  return true;
        if (n%2 == 0 || n%3 == 0) return false;

        for (int i=5; i*i<=n; i=i+6)
        {if (n%i == 0 || n%(i+2) == 0)  return false;}

        return true;
    }
}
//2       number1
//3 4     number2
//3 4 5   number3
//
//matrix {(2);(3,4);(3,4,5)}