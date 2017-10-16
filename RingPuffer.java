public class RingPuffer<R extends Object> {

  private Object[] ringPuffer;
  private int laenge;
  private int start;

  public RingPuffer(int valueInt) {
    ringPuffer = new Object[valueInt];
  }
  
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
      throw new GehtNetException("pufferDelete(): es wurde versucht mehr Elemente zu löschen als überhaupt exestieren.");
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