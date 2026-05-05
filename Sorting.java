package Array26;

import java.util.Scanner;

public class Sorting {
 static int size;
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	size=sc.nextInt();
	int arr[]=new int[size];
	System.out.println("enter elements: ");
	int i,j;
	for( i=0;i<size;i++)
	{
	arr[i]=sc.nextInt();

	}
	 System.out.println("Array elements is;");
	 for(i=0;i<size;i++)
	 {
		 System.out.println(arr[i]);
	 }
	 
	 for(i=0;i<size;i++)
	 {
		for(j=i+1;j<size;j++)
		{
			if(arr[i]>arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	 }
	 System.out.println("After sorting:");
	 for(i=0;i<size;i++)
	 {
		 System.out.println(arr[i]);
	 }
	  

}
}
