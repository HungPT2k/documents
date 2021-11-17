package javacore;

import java.util.Scanner ;
public class Sap_xep_chon_nguoc {
    
    public static void main(String[] args)
    {
        int n, t,dem=0;
        Scanner s=new Scanner(System.in);
        n=s.nextInt() ;
        int[] A= new int[n+1];
        int[][] B = new int[n+1][n+1];
    for ( int i=0 ; i<n ; i++)
    {
        A[i]=s.nextInt();
    }
    int min;
    for (int i = 0; i < n-1; i++)
    {	
        min = i;
        for (int j = i + 1; j < n; j++)
           {
			if (A[j] < A[min]) min = j;
           }
			int temp = A[i];
            A[i]=A[min];
            A[min]=temp;
		for ( int k=0 ; k<n ; k++)
	{	
		 B[i+1][k]=A[k] ;
    }
    }
      for( int j=n-1 ; j>=1 ; j--)
        {
    System.out.printf("Buoc " + j + ": ");
		for ( int k=0 ; k<n ; k++)
	{	
		System.out.printf( B[j][k]+ " ");
    }
        System.out.print("\n");
}
    }
}
