package Java26;
import java.util.Scanner;
public class Reversestring {

	public static void main(String[] args) {
		String s="";
		String rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String");
		s=sc.nextLine();
		System.out.println(s);
		int l=s.length();
		System.out.println(l);
        for(int i=l-1;i>=0;i--)
        {
        	rev=rev+s.charAt(i);
        }
         System.out.println("reverse string is:" + rev);
	}

}
