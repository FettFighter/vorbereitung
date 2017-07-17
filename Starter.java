public class Starter {
  public static void main(String args[]) {
    
    //Paar
    Paar<Integer, Integer> paar = new Paar<Integer, Integer>(128,64);
    Paar<String, Paar<Integer, Integer>> paar2 = new Paar<String, Paar<Integer, Integer>>(new String("Lawl"), paar);
    Paar<Paar<Integer, Integer>, Paar<Integer, Integer>> paar3 = new Paar<Paar<Integer, Integer>, Paar<Integer, Integer>>(paar, paar);
    /*Ein Paar und ein String des Paar */
    Paar<Paar<Integer, Integer>, String> paar4 = new Paar<Paar<Integer, Integer>, String>(paar,paar.toString());

    //GleichesPaar
    GleichesPaar<Integer> gleichesPaar = new GleichesPaar<>(paar4.erstes().erstes(),paar.zweites());

    //Knoten
    Knoten<Integer> knoten = new Knoten<Integer>();
    Knoten<Integer> knoten2 = new Knoten<Integer>(22);
    Knoten<Integer> knoten3 = new Knoten<Integer>();
    Knoten<String> knoten4 = new Knoten<String>("LoL");
    
    //Knoten1) knotenRechts soll auf knoten2 zeigen | knoten2) knotenRechts  auf knoten3 | Auf Referenzen zeigen.
    knoten.knotenRechts(knoten2); 
    knoten2.knotenRechts(knoten3);
    knoten.knotenRechts().knotenRechts().knotenRechts(knoten4);

    System.out.println(knoten.knotenRechts());
    System.out.println(knoten2.knotenRechts());
    System.out.println(knoten.knotenRechts().knotenRechts().knotenRechts());

    System.out.println(paar.toString());
    System.out.println(paar4.toString());
    System.out.println(paar4.erstes().getClass().toString()+ paar4.zweites().getClass().toString());
    System.out.println(gleichesPaar);
  }
}
