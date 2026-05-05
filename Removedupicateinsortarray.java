package javaprogram;
 import java.util.*;

public class Removedupicateinsortarray {

	public static void main(String[] args) {
		 int i,n,j=0;
		  System.out.println("enter number of elements:");
		   Scanner s=new Scanner(System.in);
		   n=s.nextInt();
		    int a[]=new int[100];
		    for(i=0;i<n;i++)
			  {
				  a[i]=s.nextInt();
			  }
			  for(i=0;i<n;i++)
			  {
				  System.out.print(a[i]+" ");
			  }
			  System.out.println("\n");
			  for(i=0;i<n;i++)
			  {
				 if( a[i] != a[i+1])
				 {
				   a[j]=a[i];
				    j++;
				 }
			  }
			  for(i=0;i<j;i++)
			  {
				  System.out.print(a[i]+" ");
			  }


		

	}

}
