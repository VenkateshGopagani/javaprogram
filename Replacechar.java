package Java26;
import java.util.Scanner;
public class Replacechar {

	public static void main(String[] args) {
		String s="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter sting:");
		s=sc.nextLine();
		System.out.println(s);
		int index;
		Scanner i=new Scanner(System.in);
		System.out.println("enter index");
		index=i.nextInt();
		System.out.println(index);
		char ch;
	      String R;
		ch=s.charAt(index);
		System.out.println(ch);
		Scanner r=new Scanner(System.in);
		System.out.println("enter char");
		 R=r.next();
		 System.out.println(R);
		 
		s=s.substring(0,index)+R;
		System.out.println("after replace charcter:"+ s);

	}

}
