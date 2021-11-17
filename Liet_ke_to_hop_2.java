package javacore;

import java.util.Scanner ;
public class Liet_ke_to_hop_2 {
  static int[] X = new int[100];
  static int dem=0;
    public static void main(String[] args)
    {
        int n;
        int N,k;
        Scanner s=new Scanner(System.in);
        n=s.nextInt() ;
        k=s.nextInt();
        Try(1,n,k);
        System.out.print("\n");
        System.out.print("Tong cong co "+dem+" to hop");
       
    }
    public static   void Try(int i,int N ,int k)
    {
       
            for (int j =X[i-1]+1; j<=N-k+i; j++){
            X[i] = j;
            if ( i == k) 
            {   dem++;
                for ( int a=1 ; a<=k ; a++)
                {
                    System.out.print(X[a]);
                }
                System.out.print(" ");
            }   
            else Try (i+1,N,k);
             }}
    }
