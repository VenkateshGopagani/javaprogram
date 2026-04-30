import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Vector <String> v1=new Vector<>();
        v1.add("A1");
        v1.add("A2");
        v1.add("A3");
        System.out.println(v1);
        System.out.println(v1.size());
        System.out.println(v1.capacity());
        Vector <String> v2=new Vector<>();
        v2.add("b1");
        v2.add("b2");
        v2.add("b3");
        System.out.println(v2);
        v1.addAll(v2);
        System.out.println(v1);
         v1.add(0,"e1");
        System.out.println(v1);
        System.out.println(v1.get(1));
         v1.remove(1);
        System.out.println(v1);
        v1.remove("A3");
        System.out.println(v1);
        v1.removeAll(v2);
        System.out.println(v1);
        v1.clear();
        System.out.println(v1);
        
        
        
        
        
    }
}




import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Vector<String> v1=new Vector<>();
        v1.add("A1");
        v1.add("A2");
        v1.add("A3");
        System.out.println(v1);
        System.out.println(v1.size());
        System.out.println(v1.capacity());
        Vector <String> v2=new Vector<>();
        v2.add("b1");
        v2.add("b2");
        v2.add("b3");
        System.out.println(v2);
        v1.addAll(v2);
        System.out.println(v1);
        System.out.println(v1.get(1));
        System.out.println(v1.contains("b2"));
        System.out.println(v1.contains("b5"));
        System.out.println(v1.containsAll(v2));
        
        
    }
}

import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Vector <String> v1=new Vector<>();
        v1.add("A1");
        v1.add("A2");
        v1.add("A3");
        System.out.println(v1);
        System.out.println(v1.size());
        System.out.println(v1.capacity());
        Vector<String> v2=new Vector<>();
        v2.add("b1");
        v2.add("b2");
        v2.add("b3");
        System.out.println(v2);
        v1.addAll(v2);
        System.out.println(v1);
        System.out.println(v1.get(1));
          v1.set(1,"e3");
          System.out.println(v1);
          System.out.println(v1.indexOf("e3"));
        
        
    }
}


