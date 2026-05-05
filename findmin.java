package Array26;

public class findmin {
 static int arr[]= {102,34,56,78,90,43,23,14};
  public static int small()
  {
	  int min=arr[0];
	  for(int i=0;i<arr.length;i++)
	  {
		  if(min>arr[i])
		  {
			  min=arr[i];
		  }
	  }
	  return min;
	  
  }
	public static void main(String[] args) {
		System.out.println(small());
		

	}

}
