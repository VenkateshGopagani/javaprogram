package Java26;
import java.util.Scanner;
public class Addstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="";
		String ns="";
		String as="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		s=sc.nextLine();
		System.out.println(s);
		int l=s.length();
		 System.out.println("String length is:"+l);
		Scanner nc=new Scanner(System.in);
      System.out.println("enter adding string:");
      ns=nc.nextLine();
       
       int index;
       Scanner in=new Scanner(System.in);
       System.out.println("enter index:");
       index=in.nextInt();
       System.out.println(index);
      
        for(int i=0;i<l;i++)
        {
        	if(i==index)
       	 {
       		 as=as+ns;
       	 
       		 
       	 }
        	as=as+s.charAt(i);
        	
        }
         System.out.println(as);
	}

}
