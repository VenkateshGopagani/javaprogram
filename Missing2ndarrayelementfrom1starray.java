package javaprogram;
 import java.util.*;
public class Missing2ndarrayelementfrom1starray {

	public static void main(String[] args) {
		int i,n,sum=0;
		 System.out.println("enter number of elements:");
		 Scanner s=new Scanner(System.in);
		  n=s.nextInt();
		  
		     int a[]=new int[100];
		     int b[]=new int[100];
		      for(i=0;i<n;i++)
		      {
		    	   a[i]=s.nextInt();
		      }
		       for(i=0;i<n;i++)
		       {
		    	    System.out.print(a[i]+" ");
		       }
		        System.out.print("\n");
		       for(i=0;i<n;i++)
		       {
		    	    b[i]=s.nextInt();
		    	    
		       }
		       for(i=0;i<n;i++)
		       {
		    	    System.out.print(b[i]+" ");
		       }
		        System.out.print("\n");
		       
                  for(i=0;i<n;i++)
                  {
                	  sum=sum+a[i]-b[i];
                  }
        System.out.println("missing number from2nd array"+sum);
	}

}
