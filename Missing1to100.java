package javaprogram;
import java.util.*;
public class Missing1to100 {

	public static void main(String[] args) {
		int i,n,sum=0;
  System.out.println(" enter number of elements");
  Scanner s=new Scanner(System.in);
    n=s.nextInt();
     int a[]=new int[10];
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
    	   sum=sum+a[i];
       }
        int m =(n*(n+1))/2-sum;
        
        System.out.println( " missing number is "+m);
	}

}
