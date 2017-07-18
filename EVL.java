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
  
  public E letzerWert() {
    Knoten<E> tempKnoten;
    
    tempKnoten = start.knotenRechts();
    while(tempKnoten != null && tempKnoten.knotenRechts() != null) {
      tempKnoten = tempKnoten.knotenRechts();
    }
    return tempKnoten.anyValue();
  } 
}

// [KLASSE].[ZEIGT WAS STATISCH UND DEN RICHTIGEN ACCESSMODIFIER HAT AN]
// [INSTANZVARIABLE.[ZEIGT ALLES AN WAS IN DER KLASSE IST MIT DEM ACCESSMODIRIER]
// KONiSTRUKTOREN WERDEN NUR MIT NEW ANGEZEIGT
