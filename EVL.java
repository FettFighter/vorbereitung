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
    Knoten<E> tempKnoten;

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
    Knoten<E> tempKnoten;
    
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
  //an letztes dranhängen
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
  public void insert(int index, Knoten<E> insertKnoten) {
    Knoten<E> tempKnoten;
    int index1;

    tempKnoten = start.knotenRechts();

    for(index1 = 1; !(index1 == index); index1++) {
      tempKnoten = tempKnoten.knotenRechts();
    }
    insertKnoten.knotenRechts(tempKnoten.knotenRechts());
    tempKnoten.knotenRechts(insertKnoten);
  }

  public void deleteFirst() {  
    start = start.knotenRechts();
  }

  public void deleteLast() { 
    Knoten<E> tempKnoten;
    Knoten<E> alterTempKnoten;

    tempKnoten = start.knotenRechts();
    alterTempKnoten = tempKnoten;
    while(tempKnoten != null && tempKnoten.knotenRechts() != null) {
      alterTempKnoten = tempKnoten;
      tempKnoten = tempKnoten.knotenRechts();
    }
    //tempKnoten.knotenRechts(tempKnoten.knotenRechts().knotenRechts());
    alterTempKnoten.knotenRechts(null);
  }

  public void deleteX(int index) { 
    Knoten<E> tempKnoten;
    Knoten<E> alterTempKnoten;
    int index1;
    
    tempKnoten = start.knotenRechts();
    alterTempKnoten = start.knotenRechts();
    for(index1 = 1; !(index1 == index); index1++) {
      alterTempKnoten = tempKnoten;
      tempKnoten = tempKnoten.knotenRechts();
    }
    alterTempKnoten.knotenRechts(alterTempKnoten.knotenRechts().knotenRechts());
  }
}
// [KLASSE].[ZEIGT WAS STATISCH UND DEN RICHTIGEN ACCESSMODIFIER HAT AN]
// [INSTANZVARIABLE.[ZEIGT ALLES AN WAS IN DER KLASSE IST MIT DEM ACCESSMODIRIER]
// KONiSTRUKTOREN WERDEN NUR MIT NEW ANGEZEIGT
