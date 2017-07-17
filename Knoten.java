public class Knoten<W> {

  private W anyValue;
  private Knoten knotenLinks;
  private Knoten knotenRechts;
  //Konstrutkor
  public Knoten(W anyValue) {
    this.anyValue = anyValue;
  }
  //Konnstrutkor
  public Knoten() {
  }
  //getter
  public W anyValue() {
    return anyValue;
  }
  //setter
  public void anyValue(W anyValue) {
    this.anyValue = anyValue;
  }
  //toString
  public String toString() {
    return "(" + anyValue + ")";
  }
  //getter
  public Knoten knotenLinks() {
    return knotenLinks;
  }
  //setter
  public void knotenLinks(Knoten knotenLinks) {
    this.knotenLinks = knotenLinks;
  }
  //getter
  public Knoten knotenRechts() {
    return knotenRechts;
  }
  //setter
  public void knotenRechts(Knoten knotenRechts) {
    this.knotenRechts = knotenRechts;
  }
}
