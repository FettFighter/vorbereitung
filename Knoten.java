public class Knoten<W> {

  private W anyValue;
  private Knoten<W> knotenLinks;
  private Knoten<W> knotenRechts;
  
  public Knoten(W anyValue) {
    this.anyValue = anyValue;
  }
  
  public Knoten() {
  }
  
  public W anyValue() {
    return anyValue;
  }
  
  public void anyValue(W anyValue) {
    this.anyValue = anyValue;
  }
  
  public String toString() {
    return "(" + anyValue + ")";
  }
  
  public Knoten<W> knotenLinks() {
    return knotenLinks;
  }
  
  public void knotenLinks(Knoten<W> knotenLinks) {
    this.knotenLinks = knotenLinks;
  }
  
  public Knoten<W> knotenRechts() {
    return knotenRechts;
  }
  
  public void knotenRechts(Knoten<W> knotenRechts) {
    this.knotenRechts = knotenRechts;
  }
}