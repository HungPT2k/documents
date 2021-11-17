package javacore;

import java.util.Scanner ;
public class Sap_xep_chen_nguoc {
    
    public static void main(String[] args)
    {
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt() ;
        int[] A= new int[n+1];
        int[][] B = new int[n+1][n+1];
    for ( int i=0 ; i<n ; i++)
    {
        A[i]=s.nextInt();
    }
   int l=A[0];
   int i,j, key;
   for ( i = 1; i < n; i++)
   {
       key = A[i];
       j = i-1;
       while (j >= 0 && A[j] > key)
       {
           A[j+1] = A[j];
           j = j-1;
       }
       	A[j+1] = key;
		for ( int k=0 ; k<=i ; k++)
	{	
		 B[i][k]=A[k] ;
    }
    }
       for(  j=n-1 ; j>=1 ; j--)
        {
    System.out.printf("Buoc " + j + ": ");
		for ( int k=0 ; k<=j ; k++)
	{	
		System.out.printf( B[j][k]+ " ");
    }
        System.out.print("\n");
}   
        System.out.println("Buoc "+0+": "+l );
    }
}
