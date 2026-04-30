 import java.util.Scanner;
 class factorial
{
 public static void main( String [] args)
{
  int fact=1,i,n;
 Scanner s=new Scanner(System.in);
 System.out.println("enter number");
 n=s.nextInt();
   for(i=2;i<=n;i++)
    {
     fact=fact*i;
   }
System.out.println(fact);
 }
 }
 
