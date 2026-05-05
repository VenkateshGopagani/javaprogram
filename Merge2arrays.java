package Array26;

import java.util.Scanner;

public class Merge2arrays {

	public static void main(String[] args) {
		int size,size2;
		Scanner sc=new Scanner(System.in);
		  System.out.println("enter size");
		   size=sc.nextInt();
		  System.out.println(size);
		  int arr[]=new int[size];
		  int i;
		  for( i=0;i<size;i++)
		  {
			  arr[i]=sc.nextInt();
			  
		  }
		  System.out.println("display array elements:");
		  for(i=0;i<size;i++)
		  {
			 System.out.println(arr[i]);
		  }
		  
			Scanner c=new Scanner(System.in);
			  System.out.println("enter size2");
			   size2=c.nextInt();
			  System.out.println(size2);
			  int brr[]=new int[size2];
			  for( i=0;i<size2;i++)
			  {
				  brr[i]=c.nextInt();
				  
			  }
			  System.out.println("display second array elements:");
			  for(i=0;i<size2;i++)
			  {
				 System.out.println(brr[i]);
			  }
			   int size3=size+size2;
			   int crr[]=new int[size3];
			    for(i=0;i<size;i++)
			    {
			    	crr[i]=arr[i];
			    }
			    for(i=0;i<size2;i++)
			    {
			    	crr[size+i]=brr[i];
			    }
			     for(i=0;i<size3;i++) {
			    	 System.out.println(crr[i]);
			     }
					  	}
				  	}
	


	


