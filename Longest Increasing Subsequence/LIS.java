package jashu;
import java.util.Scanner;

import java.util.Arrays;

public class LIS {
	public static int longest_increasing_subsequence_length(int a[] , int l[] , int n)
	  {
	      int i,j;
	       
	         for(i=0;i<n;i++)
	       {
	           for(j=0;j<i;j++)
	          {
	              if(a[i]>=a[j])
	               
	                l[i]=Math.max(l[j]+1,l[i]);
	          }
	       }
	       
	       Arrays.sort(l);
	         
	         return l[n-1];
	  }
	  
	       public static void main(String[] args)
	  
	  {
	    	   System.out.println("enter n values: ");
	      Scanner scan = new Scanner (System.in);
	      
	      
	        int n = scan.nextInt();
	      
	        int a[] = new int[n];
	        
	            int l[] = new int[n];
	            System.out.println("enter input values: ");
	        
	          int i;
	          
	          for(i=0;i<n;i++)
	         
	          {
	             a[i] = scan.nextInt();
	             
	               l[i]=1;
	         }
	         
	         System.out.println("your output is: "+longest_increasing_subsequence_length(a,l,n));
	         
	         
	  }

}
