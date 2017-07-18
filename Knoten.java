public class Knoten<W> {

  private W anyValue;
  private Knoten<W> knotenLinks;
  private Knoten<W> knotenRechts;
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
  public Knoten<W> knotenLinks() {
    return knotenLinks;
  }
  //setter
  public void knotenLinks(Knoten<W> knotenLinks) {
    this.knotenLinks = knotenLinks;
  }
  //getter
  public Knoten<W> knotenRechts() {
    return knotenRechts;
  }
  //setter
  public void knotenRechts(Knoten<W> knotenRechts) {
    this.knotenRechts = knotenRechts;
  }
}
