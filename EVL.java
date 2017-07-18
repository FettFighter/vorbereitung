public class EVL<E> {

  private Knoten<E> start;

  public EVL(){
    this.start = new Knoten<E>();
  }

  public EVL(E firstValue) {
    this.start = new Knoten<E>(firstValue);
}

  public E firstValue() {
    return start.anyValue();
  }

  //Methode: prepend hängt vor das ERSTE Element einen Knoten und macht das ERSTE zum ZWEITEN Element und das neue Element zum ERSTEN
  public void prepend(Knoten<E> knoten) { 
    knoten.knotenRechts(start);
    start = knoten;
  }
  //genau wie oben nur mit Wert.
  public void prependValue(E value) {
    prepend(new Knoten<E>(value));
  } 

  public String toString() {
    String temp = "";
    Knoten tempKnoten;

    temp += start;
    tempKnoten = start.knotenRechts();

    while(tempKnoten != null) {
      System.out.println(temp);
      temp += tempKnoten;
      tempKnoten = tempKnoten.knotenRechts();
    }

    return temp;
  }

  public int laengeListe() {
    int index;
    Knoten tempKnoten;
    
    tempKnoten = start.knotenRechts();
    for(index = 1; tempKnoten != null; index++) {
      tempKnoten = tempKnoten.knotenRechts();
    }
    return index;
  }
  
  public E letzterWert() {
    Knoten<E> tempKnoten;
    
    tempKnoten = start.knotenRechts();
    while(tempKnoten != null && tempKnoten.knotenRechts() != null) {
      tempKnoten = tempKnoten.knotenRechts();
    }
    return tempKnoten.anyValue();
  }
  
  public void append(Knoten<E> knoten) { 
    Knoten<E> tempKnoten;
    
    tempKnoten = start.knotenRechts();
    while(tempKnoten != null && tempKnoten.knotenRechts() != null) {
      tempKnoten = tempKnoten.knotenRechts();
    }
    //tempKnoten ist mein LETZTER Knoten, dann greife ich auf knoten zu und hänge dass an den knotenRechts
    tempKnoten.knotenRechts(knoten);
  }

  public void appendValue(E value) {
    append(new Knoten<E>(value));
  }
  //An einem Index ein wert einfügen. Über die Liste iterrieren, wenn der Index gefunden wurde, dannnnnn wird der Wert eingefügt, wenn nicht, dann pech.
  public int insert(int index, Knoten insertKnoten) {
    Knoten<E> tempKnoten;
    
    tempKnoten = start.knotenRechts();
    while(tempKnoten != null && tempKnoten.knotenRechts() != null) {
      tempKnoten = tempKnoten.knotenRechts();
    }
    //hier kommt noch was hin
    return 0;
  }
}

// [KLASSE].[ZEIGT WAS STATISCH UND DEN RICHTIGEN ACCESSMODIFIER HAT AN]
// [INSTANZVARIABLE.[ZEIGT ALLES AN WAS IN DER KLASSE IST MIT DEM ACCESSMODIRIER]
// KONiSTRUKTOREN WERDEN NUR MIT NEW ANGEZEIGT
