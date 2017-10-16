public class Starter {
  public static void main(String args[]) {
    
    /*********************************************************
    //Paar
    Paar<Integer, Integer> paar = new Paar<Integer, Integer>(128,64);
    Paar<String, Paar<Integer, Integer>> paar2 = new Paar<String, Paar<Integer, Integer>>(new String("Lawl"), paar);
    Paar<Paar<Integer, Integer>, Paar<Integer, Integer>> paar3 = new Paar<Paar<Integer, Integer>, Paar<Integer, Integer>>(paar, paar);
    //Ein Paar und ein String des Paar
    Paar<Paar<Integer, Integer>, String> paar4 = new Paar<Paar<Integer, Integer>, String>(paar,paar.toString());
    
    //GleichesPaar
    GleichesPaar<Integer> gleichesPaar = new GleichesPaar<>(paar4.erstes().erstes(),paar.zweites());

    //Knoten
    Knoten<Integer> knoten = new Knoten<Integer>();
    Knoten<Integer> knoten2 = new Knoten<Integer>(22);
    Knoten<Integer> knoten3 = new Knoten<Integer>();
    Knoten<String> knoten4 = new Knoten<String>("LoL");
    Knoten<Paar<Integer, Integer>> knoten5 = new Knoten<Paar<Integer, Integer>>(new Paar<Integer, Integer>(3,4));
    
    // Knoten1) knotenRechts soll auf knoten2 zeigen | knoten2) knotenRechts  auf knoten3 | Auf Referenzen zeigen.
    knoten.knotenRechts(knoten2); 
    knoten2.knotenRechts(knoten3);
    //knoten.knotenRechts().knotenRechts().knotenRechts(knoten4);

    //EVL
    EVL<Integer> evl = new EVL<Integer>(256);
    EVL<Paar<Integer, Integer>> evl2 = new EVL<Paar<Integer, Integer>>(new Paar<Integer, Integer>(1,9));
    evl.prepend(knoten2);
    evl2.prepend(knoten5);
    evl2.prependValue(new Paar<Integer, Integer>(19,20));
    System.out.println("EVL EVL EVL EVL");
    //System.out.println(evl.firstValue());
    //System.out.println(evl.toString());
    //System.out.println(evl.laengeListe());
    System.out.println(evl2.toString());
    //System.out.println(evl2.laengeListe());
    //System.out.println(evl2.letzterWert());
    evl2.append(new Knoten<Paar<Integer,Integer>>(new Paar<Integer,Integer>(knoten5.anyValue().erstes(), knoten5.anyValue().zweites())));
    System.out.println(evl2);
    evl2.insert(2, new Knoten<Paar<Integer, Integer>>(new Paar<Integer, Integer>(knoten5.anyValue().erstes(), knoten5.anyValue().zweites())));
    System.out.println(evl2);
    evl2.deleteLast(); //Zeile löschen
    System.out.println(evl2);
    evl2.deleteFirst();
    System.out.println(evl2);
    evl2.deleteX(1); 
    System.out.println(evl2);

    System.out.println("STACK STACK STACK STACK STACK");
    Stack<String> stack  = new Stack<String>();
    stack.push("hehexd");
    System.out.println(stack.toString());
    System.out.println(stack.peek());
    stack.pop();
    System.out.println(stack.toString());
    
    System.out.println("QUEUE QUEUE QUEUE QUEUE QUEUE");
    Queue<String> queue = new Queue<String>();
    queue.queue("Alter ich bin ein QUEUE"); 
    System.out.println(queue.toString()); 
    System.out.println(queue.peek());
    queue.queue("Alter ich bin ein rieseger enes"); 
    queue.queue("Alter ich bin ein rieseger enes"); 
    queue.dequeue();
    System.out.println(queue.toString()); 
    *********************************************************/

    System.out.println("RINGPUFFER RINGPUFFER RINGPUFFER");
    RingPuffer<Integer> ringP = new RingPuffer<Integer>(4);
    try {
    ringP.pufferInsert(5);
    ringP.pufferInsert(10);
    ringP.pufferInsert(15);
    ringP.pufferInsert(20);
    ringP.pufferInsert(25);
    System.out.println(ringP.toString());
    ringP.pufferDelete();
    System.out.println(ringP.toString());
    } catch(GehtNetException e) {
      e.printStackTrace();
    }
    
    /************************************
    System.out.println("KNOTEN KNOTEN KNOTEN KNOTEN");
    System.out.println(knoten.knotenRechts());
    System.out.println(knoten2.knotenRechts());
    System.out.println(knoten.knotenRechts().knotenRechts().knotenRechts());
    System.out.println();
    
    System.out.println("PAAR PAAR PAAR PAAR");
    System.out.println(paar.toString());
    System.out.println(paar4.toString());
    System.out.println(paar4.erstes().getClass().toString()+ paar4.zweites().getClass().toString());
    System.out.println(gleichesPaar);
    ************************************/
  }
}