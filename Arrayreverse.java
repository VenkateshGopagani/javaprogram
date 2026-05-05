package javaprogram;

 import java.util.*;
public class Arrayreverse {

	public static void main(String[] args) {
		   int i,n,temp;
		    System.out.println(" enter number of elements");
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
		       
		       for(i=0;i<n/2;i++)
		       {
		    	    temp=a[i];
		    	    a[i]=a[n-1-i];
		    	    a[n-1-i]=temp;
		       }
		       for(i=0;i<n;i++)
		       {
		    	   System.out.print(a[i]+" ");
		       }
		       
		       

	}

}
