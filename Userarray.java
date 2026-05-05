package Array26;
import java.util.Scanner;
public class Userarray {

	public static void main(String[] args) {
		int size;
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
				  	}

}
