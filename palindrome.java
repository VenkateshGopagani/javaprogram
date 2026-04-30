import java.util.Scanner;
class palindrome
{
public static void main(String[] args)
{
  int n,temp,rem,rev=0;
  Scanner s= new Scanner (System.in);
  System.out.println("enter number:");
     n=s.nextInt();
   temp=n;
     while(temp!=0)
{ 
 rem=temp%10;
 rev=rev*10+rem;
 temp=temp/10;
}
 if( rev == n)
 System.out.println("number is palindrome"); 
 else 
 System.out.println(" number is not a palindrome");
}
}