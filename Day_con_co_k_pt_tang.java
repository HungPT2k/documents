package javacore;

import java.util.Arrays;
import java.util.Scanner;
public class Day_con_co_k_pt_tang {
    static int N,K;
    static int[] X = new int[100001];
	static int[] b = new int[100001];	
        public static void main(String[] args)
        {
            int t;
            Scanner sc = new Scanner(System.in);
            t = sc.nextInt();
        while(t>0)
        {
            t--;
            N = sc.nextInt();
            K = sc.nextInt();
            for( int i=1 ; i<=N ; i++)
            {	
             b[i] = sc.nextInt();
            }
            for( int i=1 ; i<N ; i++)
            {	
                for( int j=i+1 ; j<=N ; j++)
            {	    if(b[i]>b[j])
                {
                    int temp = b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
            }
            Try(1);
        }
    }   
      		
		public static void Try( int i ) {
					for (int j =X[i-1]+1; j<=N-K+ i; j++){
					X[i] = j;
					if ( i == K) 
					{
						for( int a=1 ; a<=K ; a++)
						{
							System.out.print( b[X[a]] + " ");
                        }
					
                        System.out.print("\n");
                    }
					else Try (i+1);}}
}
