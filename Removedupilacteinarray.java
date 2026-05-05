package javaprogram;
 import java.util.*;
public class Removedupilacteinarray {

	public static void main(String[] args) {
		 int i,n,j,k;
		  System.out.println(" enter number of elements:");
		   Scanner s=new Scanner(System.in);
				   n=s.nextInt();
		    int a[]=new int[100];
		     
		    for(i=0;i<n;i++)
		    {
		    	 a[i]=s.nextInt();
		    }
		     for(i=0;i<n;i++)
		     {
		   	  System.out.print(a[i] +" ");
		     }
		     
			  System.out.println("\n");
			   for(i=0;i<n;i++)
			   {
				   for(j=i+1;j<n;j++)
				   {
					   if(a[i]==a[j])
					   {
						   for(k=j;k<n;k++)
						   {
							   a[k]=a[k+1];
						   }
						    j--;
						    n--;	
				
					   }
				   }
			   }
			   
			   for(i=0;i<n;i++)
			     {
			   	  System.out.print(a[i] +" ");
			     }
			     
	}

}
