package javacore;

import java.util.Scanner;
public class Danh_sach_canh {
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
        for(int j = i; j < m; j++) {
         if(a[i][j]==1)
         {
            System.out.println("("+(i+1)+","+(j+1)+")") ;
         }
        }
       }
    }
}

