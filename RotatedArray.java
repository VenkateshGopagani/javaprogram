package Array26;

import java.util.Scanner;

public class RotatedArray {
	
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
			
			int j=0,k=2;
			int temp[]=new int[size];
			for(i=size-1;i>size-k;i++)
			{
				temp[j]=arr[i];
				j++;
			}
			for(i=0;i<k;i++) {
				temp[j]=arr[i];
				j++;
			}
			for ( i = 0; i < size; i++) {
	            arr[i] = temp[i];
	        }
			print1(arr,size);
			}
		}
