package javacore;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.Scanner;

public class Day_con_co_tong_le {
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
            X[0]=0;
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
                if(sum%2==1)
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
            else Try (i+1,K);}}}
/*import java.util.Scanner;
import java.util.Arrays;
public class a{
    public static void dequi(int[] a,int j,String s,int tong){
        if(tong%2==1){
            System.out.println(s);
        }
        for(int i=0;i<j;i++){
            dequi(a,i,s+Integer.toString(a[i])+" ",tong+a[i]);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            for(int i=0;i<n;i++){
                dequi(a,i,Integer.toString(a[i])+" ",a[i]);
            }

            t-=1;
        }
    }
}*/