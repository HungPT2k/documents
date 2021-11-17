package javacore;

import java.util.Scanner ;
public class Sap_sep_noi_bot_nguoc {
    
    public static void main(String[] args)
    {
        int n, t,dem=0;
        Scanner s=new Scanner(System.in);
       t=s.nextInt();
       while(t>0)
       {
           t--;
        n=s.nextInt() ;
        int[] A= new int[n];
        int[][] B = new int[n][n];
    for ( int i=0 ; i<n ; i++)
    {
        A[i]=s.nextInt();
    }
    dem=0;
    for (int i = 0; i < n- 1; i++)
	{	int check=0;
        for (int j = 0; j < n - i - 1; j++)
           {
		    if (A[j] > A[j + 1])
			 {
			check=1;
			int temp = A[j];
            A[j]=A[j+1];
            A[j+1]=temp;
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