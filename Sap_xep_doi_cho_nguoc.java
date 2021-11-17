package javacore;

import java.util.Scanner ;
public class Sap_xep_doi_cho_nguoc {
    
    public static void main(String[] args)
    {
        int n, t,dem;
        Scanner s=new Scanner(System.in);
       t=s.nextInt();
       while(t>0)
       {
           t--;
        n=s.nextInt() ;
        int[] A= new int[n+1];
        int[][] B = new int[n+1][n+1];
    for ( int i=0 ; i<n ; i++)
    {
        A[i]=s.nextInt();
    }
    dem=0;
    for (int i = 0; i < n - 1; i++)
	{	int check=0;
        for (int j = i+1; j < n ; j++)
           {
		    if (A[i] > A[j])
			 {
			check=1;
			int temp = A[i];
            A[i]=A[j];
            A[j]=temp;
             }
           }
	if(check>0)
	{	
        dem++;
		for ( int k=0 ; k<n ; k++)
	{	
		 B[dem][k]=A[k] ;
    }
    }
}       for( int j=dem ; j>=1 ; j--)
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
}