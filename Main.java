import java.util.Iterator;

public class Main {
  public static void main(String... args) {

    Baum<String> baum = new Baum<>();
    baum.add("Baum1");
    baum.add("Baum2");
    System.out.println(baum.root);
    System.out.println(baum);
  }
}