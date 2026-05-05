package Java26;
import java.util.Scanner;
public class Getchar {

	public static void main(String[] args) {
		 String s="";
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter String:");
		 s=sc.nextLine();
		 System.out.println(s);
		  int index;
		  Scanner i=new Scanner(System.in);
		   System.out.println("enter index:");
		   index=i.nextInt();
		   System.out.println(index);
		   char ch;
		  ch=s.charAt(index);
		  System.out.println(ch);

	}

}
