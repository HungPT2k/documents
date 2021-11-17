package javacore;

import java.util.Scanner;
public class Tich_ma_tran_chyen_vi {
    public static void main(String[] args)
    {
        int t,m,n,k;
    Scanner sc = new Scanner(System.in);
    t = sc.nextInt();
    k=t;
    while(t>0)
    {
        t--;
        m=sc.nextInt();
        n=sc.nextInt();
    int[][] a = new int[m+1][n+1];
    int[][] b = new int[m+1][n+1];
    int[][] c = new int[m+1][n+1];
    for( int i=0 ; i<m ; i++)
    {
    for( int j=0 ; j<n ; j++)
    {
        a[i][j]=sc.nextInt();
        b[j][i]=a[i][j];
    }
    }
    for(int i = 0; i < m; i++) {
        for(int j = 0; j < m; j++) {
         for(int l = 0; l < n; l++) {
          c[i][j] += a[i][l] * b[l][j];
         }
        }
       }
       int x=k-t;
       System.out.println("Test "+x+":");
       for(int i = 0; i < m; i++) {
        for(int j = 0; j < m; j++) {
        System.out.print(c[i][j] + " ");
        }
        System.out.print("\n");
    }

    }
}  
}
