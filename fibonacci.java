import java.util.Scanner;
 class fibonacci
{
 public static void main( String [] args)
{
  int n,n1=0,n2=1,n3=n1+n2,i;
Scanner s= new Scanner (System.in);
  System.out.println("enter number");
   n=s.nextInt();
     System.out.println(n1);
     System.out.println(n2);
       for(i=2;i<n;i++)
{ 
   System.out.println(n3);
    n1=n2;
    n2=n3;
   n3=n1+n2;
}
}
}

