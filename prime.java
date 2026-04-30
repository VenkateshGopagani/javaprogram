import java.util.Scanner;
 class prime
{
 public static void main(String [] args)
{
   int i,n,temp=0;
   Scanner s=new Scanner(System.in);
    System.out.println(" enter number");
    n=s.nextInt();
    for(i=2;i<=n/2;i++)
{
     if(n%i==0)
    temp=1;
}
 if (temp==0)
 System.out.println( "given number is prime number");
 else
System.out.println("given number is not a prime number");
}
}