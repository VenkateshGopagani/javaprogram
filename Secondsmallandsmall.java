package javaprogram;
 import java.util.*;
public class Secondsmallandsmall {

	public static void main(String[] args) {
		 int i,n,ssmall,small;
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
		    		  System.out.print(a[i]+" ");
		       }
		 	  System.out.print(" \n");
                 if(a[0]<a[1])
                 {
                	 small=a[0];
                	 ssmall=a[1];
                 }
                 else 
                 {
                	 ssmall=a[0];
                	 small=a[1];
                 }
                   for(i=2;i<n;i++)
                   {
                	    if(a[i]<small)
                	    {
                	    	ssmall=small;
                	    	small= a[i];
                	    }
                	    else if(a[i]>small && a[i]<ssmall)
                	    {
                	    	ssmall=a[i];
                	    }
                   }
            System.out.println(" second smallest element is:"+ ssmall);
      	  System.out.println(" smallest element is:" + small);
	}

}
