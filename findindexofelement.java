package Array26;
import java.util.Scanner;
public class findindexofelement{

	public static void main(String[] args) {
		int size,i;
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		System.out.println(size);
		int arr[]= new int[size] ;

		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<size;i++)
		{
			System.out.println(arr[i]);
			
		}
		   System.out.println("enter element:");
		   Scanner c=new Scanner(System.in);
		   int el=c.nextInt();
		   System.out.println(el);
		   int flag=0;
		   for(i=0;i<size;i++)
		   {
			  
			  if( arr[i]==el)
			  {
				  flag=1;
				  break;
				  
			  } 
			  
			
			   
		   }
		   
		   if(flag==1)
		   {
			   System.out.println("element exist at position is: " +i);
		   }
		   
		   else {
			   System.out.println("element does not exist");
		   }
	}
	
	}
