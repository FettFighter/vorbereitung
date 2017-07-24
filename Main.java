import java.util.Iterator;

public class Main {
  public static void main(String... args) {
/*
    DVL<String> dvl = new DVL<String>();
    dvl.prepend("mke:");
    dvl.prepend("kmeeeee");
    dvl.append("hannes");
    try {
      dvl.insert("DAU", 1);
    } catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println(dvl.length());
    System.out.println(dvl);
    
    Iterator<String> it = dvl.iterator();

    System.out.println("liefer erstes elemnt mit iterator");
    
    System.out.println(it.next());
  
    System.out.println("iteriere mit iterator");

    while(it.hasNext()) {
      System.out.println(it.next());
    }
 
    System.out.println("und nochmal ohne");
     
    for(int i = 0; i < dvl.length(); i++) {
      try {
        System.out.println(dvl.get(i));
      } catch(Exception e) {
        e.printStackTrace();
      }
    }
*/
    Baum<String> baum = new Baum<>();
    baum.add("mke");
    baum.add("kmeeeee");
    System.out.println(baum.root);
    System.out.println(baum);
  }
}
