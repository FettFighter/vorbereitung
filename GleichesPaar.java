public class GleichesPaar<G> {
  
  private Paar<G, G> paar;
  
  public GleichesPaar(G erstes, G zweites) {
    paar = new Paar<G, G>(erstes, zweites);
  }
  //getter
  public G erstes(){
    return paar.erstes();
  }
  //setter
  public void erstes(G erstes) {
    paar.erstes(erstes);
  }
  //getter
  public G zweites(){
    return paar.zweites();
  }
  //setter
  public void zweites(G zweites) {
    paar.zweites(zweites);
  }
  public String toString() {
    return paar.toString();
  }
}
