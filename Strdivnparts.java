package Java26;

import java.util.Scanner;

public class Strdivnparts {

	public static void main(String[] args) {
		String s="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		s=sc.nextLine();
		System.out.println(s);
		int n,i,len,extrachars,pl;
		System.out.println("enter how many part:");
		n=sc.nextInt();
		len=s.length();
		pl=len/n;
		int start=0,end;
		extrachars=len%n;
		 for(i=0;i<n;i++) {
			end=start+pl+(i < extrachars ? 1:0);
			String part=s.substring(start,end);
			System.out.println("part"+ (i+1)+ ";"+part);
			start=end;
		}
		
	}

}
