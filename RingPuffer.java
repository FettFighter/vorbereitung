public class RingPuffer<R extends Object> {

  private Object[] ringPuffer;
  private int laenge;
  private int start;

  public RingPuffer(int valueInt) {
    ringPuffer = new Object[valueInt];
  }

  //Intern verwalten. Merken was ist mein start und was ist die länge von meinem Datentypen. Werte löschen und hinzufügen und hehexd die liste anzeigen.
  //Start als index (ersteposition)
  public void pufferInsert(Object pufferIn) throws GehtNetException {

    if(laenge != ringPuffer.length-1) {  
      ringPuffer[(start+laenge)%ringPuffer.length] = pufferIn;
      laenge++;
    } else {
      throw new GehtNetException("pufferInsert geht net, weil puffer voll ist. ");
    }
  }

  public Object pufferDelete() throws GehtNetException {
    Object tempPuffer = ringPuffer[start];
    
    if(start > ringPuffer.length) {
      start = 0;
    } else {
      start ++;
    }
    
    if(laenge != 0) {
      laenge --;
    } else {
      throw new GehtNetException("pufferDelete() geht net, weil Puffer = leer.p.s. guck im Code nach du kek.");
   }
    return tempPuffer;
  } 

  public String toString() {
    String lol = ":)";
    for(Object item: ringPuffer) {
     lol = lol + (" " + item + " ");
    }
    return lol;
  }

  
}

//Exception handling.
//Eigene Exception, wenn ich mehr Elemente annehme als meine Datenstruktur lang ist.
//Exception, wenn ich ein Element löschen will und der puffer leer ist.
//Overflow logik, wenn indizes weiter sind als mein Array Lang ist.
//toString verändern, sodass nur die die tatsächlich erreichbar sind angezeigt werden.
