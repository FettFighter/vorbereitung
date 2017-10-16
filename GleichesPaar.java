public class GleichesPaar<G> {
  
  private Paar<G, G> paar;
  
  public GleichesPaar(G erstes, G zweites) {
    paar = new Paar<G, G>(erstes, zweites);
  }
  
  public G erstes() {
    return paar.erstes();
  }
  
  public void erstes(G erstes) {
    paar.erstes(erstes);
  }
  
  public G zweites() {
    return paar.zweites();
  }
  
  public void zweites(G zweites) {
    paar.zweites(zweites);
  }
  
  public String toString() {
    return paar.toString();
  }
}