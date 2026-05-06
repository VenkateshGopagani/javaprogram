package Array26;
import java.util.Scanner;
public class Arrayreverse {
public static void print(int arr[],int n) {
	int i ;
	for(i=0;i<n;i++)
	{
		System.out.print(arr[i]);
		break;
	}
}
	public static void main(String[] args) {
		int n,i;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number of elements:");
     n=sc.nextInt();
     int arr[]=new int[n];
     System.out.println("enter array elemeents:");
     for(i=0;i<n;i++)
     {
    	 arr[i]=sc.nextInt();
     }
     print(arr,n);
     int j=0,k=n-1;
     while(j<k)
     {
    	int temp=arr[j];
    	arr[j]=arr[k];
    	arr[k]=temp;
    	j++;
    	k--;
     }
     print(arr,n);
	}

}
