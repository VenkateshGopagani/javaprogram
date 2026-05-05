package javaprogram;
public class Constructor {
	int id ;
	String name;

	 public Constructor ( int c,String d)
	 {
		 id=c;
		 name=d;
		 
		
	 }

	public static void main(String[] args) {
		Constructor s1= new Constructor ( 20 ,"venkat");
		System.out.println( s1.id);
		System.out.println( s1.name);
		 
		

	}

}
