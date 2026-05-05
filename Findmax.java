package Array26;
import java.util.Scanner;
public class Findmax
{
	
	static int arr[]= {45,35,42,58,65,54,65,76};
		  public static int large()
		  {
			  int max=arr[0];
			  for(int i=0;i<arr.length;i++)
			  {
				  if(max < arr[i])
				  {
					  max=arr[i];
				  }
			  }
			return max;
		  }
		  public static void main(String[] args) {
		  System.out.println(large());
		  }
}

	


