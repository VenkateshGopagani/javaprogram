import java.util.Scanner;
 class armstrong
{
 public static void main(String[] args)
{
  int n ,rem,sum=0,temp;
 Scanner s=new Scanner(System.in);
   System.out.println("enter number");
   n= s.nextInt();
   temp=n;
	while(temp!=0)
	{
	 rem=temp%10;
	 sum=sum+rem*rem*rem;
	 temp=temp/10;
	}
 if(n==sum)

 System.out.println(" number is armstrong");
else
 System.out.println("number is not a armstrong");
}
}