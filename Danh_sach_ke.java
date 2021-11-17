package javacore;

import java.util.Scanner;
public class Danh_sach_ke {
    public static void main(String[] args)
    {
        int t,m;
    Scanner sc = new Scanner(System.in);
        m=sc.nextInt();
    int[][] a = new int[m+1][m+1];
    for( int i=0 ; i<m ; i++)
    {
    for( int j=0 ; j<m ; j++)
    {
        a[i][j]=sc.nextInt();
    }
    }
    for(int i =0; i < m; i++) {
        System.out.print ( "List("+(i+1)+") = " );
        for(int j =0; j < m; j++) {
         if(a[i][j]==1)
         {
            System.out.print((j+1)+" ") ;
         }
        }
        System.out.print("\n");
       }
    }
}

