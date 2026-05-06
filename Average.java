package Array26;

import java.util.Scanner;

public class Average {
public static void print(int arr[],int n) {
	for(int i=0;i<n;i++) {
		System.out.println(arr[i]);
	}
}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elements:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int i;
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			}
		print(arr,size);
		int sum=0;
		for(i=0;i<size;i++)
		{
			sum=sum+arr[i];
		}
		int average=sum/size;
		System.out.println("average is:"+average);
		

	}

}
