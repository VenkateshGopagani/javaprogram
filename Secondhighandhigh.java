package javaprogram;
 import java.util.*;
public class Secondhighandhigh {

	public static void main(String[] args) {
		 int i,n,h,sh;
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
		  	  System.out.print("\n");
		  	     
		  	  if(a[0]>a[1])
		  	  {
		  		  h=a[0];
		  		  sh=a[1];
		  	  }
		  	  else 
		  	  {
		  		  h=a[1];
		  		  sh=a[0];
		  	  }
		  	    for(i=2;i<n;i++)
		  	    {
		  	    	if (a[i]>h)
		  	    	{
		  	    		sh=h;
		  	    		h=a[i];
		  	    	}
		  	    	else if( a[i]<h && a[i]>sh)
		  	    	{
		  	    		 sh=a[i];
		  	    	}
		  	    	
		  	    }
		  	     
		  	  System.out.println(" highest element is:"+ h);
			  System.out.println(" second highest element is:" + sh);

	}

}
