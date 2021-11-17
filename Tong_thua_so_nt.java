package javacore;

import java.util.Arrays;
import java.util.Scanner;
public class Tong_thua_so_nt {
  public static void main(String[] args) {
    int n,t,max=0,k;
    long dem=0;
    Scanner s = new Scanner(System.in);
    t=s.nextInt();
    int[] a= new int[t+1];
    for( int i=1 ; i<=t ; i++)
    {
        a[i]=s.nextInt();
        if(a[i]>max) max=a[i];
    }
        boolean[] check = new boolean[max+1];
        Arrays.fill(check, true);
          check[0]=check[1]=false;
          for (int i = 2; i <= max; i++) {
            if (check[i] == true) {
              for (int j = 2 * i; j <= max; j += i) {
                check[j] = false;
              }
            }
          }
          for( int j=1 ; j<=t ; j++)
          { 
            if(check[a[j]]==true) dem+=a[j];
            else
            {
             
          for (int i = 2; i <=a[j]; i++) {
            if (check[i] == true) 
          {  while(a[j]%i == 0) 
            {dem+=i;a[j]/=i;}
          if(check[a[j]]==true) 
          {
              dem+=a[j];
              break;
          } 
        }
          }
        }
    }    
        System.out.println(dem);
      }      
   
}
