package Array26;

import java.util.Scanner;

public class Removeduplicate {
	static void print1(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		int size;
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		System.out.println("Size is: " +size);
		int i;
		int arr[]=new int[size];
		for(i=0;i<size;i++)
				{
			  arr[i]=sc.nextInt();
				}
		print1(arr,size);
		int j=0;
		for(i=1;i<size;i++) {
			if(arr[i]!=arr[j])
			{ 
				j++;
				 arr[j]=arr[i];
			}
		}
		print1(arr,j);
		
		

	}



}
